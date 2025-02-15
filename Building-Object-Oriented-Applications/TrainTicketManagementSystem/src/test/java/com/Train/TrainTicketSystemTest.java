package com.Train;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainTicketSystemTest {
    private TicketSystem ticketSystem;

    @BeforeAll
    public static void setup() {
        TicketSystem ticketSystem = new TicketSystem();
    }

    @Test
    void testBookingTicket_Success() {
        TicketBooking booking = new TicketBooking('A', 'C', 2, ticketSystem);
        booking.execute();

        assertEquals(1, ticketSystem.ticketBooked.size(), "Ticket should be booked");
        assertEquals(6, ticketSystem.seatsAvailability[0], "Seat count should decrease");
        assertEquals(6, ticketSystem.seatsAvailability[1], "Seat count should decrease");
    }

    @Test
    void testBookingTicket_WaitingList() {
        // Book all available seats
        TicketBooking booking1 = new TicketBooking('A', 'E', 8, ticketSystem);
        booking1.execute();

        // Try booking extra seats (should go to the waiting list)
        TicketBooking booking2 = new TicketBooking('A', 'C', 2, ticketSystem);
        booking2.execute();

        assertEquals(1, ticketSystem.waitingList.size(), "Ticket should be in the waiting list");
        assertEquals(2, ticketSystem.waitingListAdded, "Waiting list count should increase");
    }

    @Test
    void testCancellationTicket_FullCancellation() {
        TicketBooking booking = new TicketBooking('A', 'C', 3, ticketSystem);
        booking.execute();

        Ticket ticket = ticketSystem.ticketBooked.values().iterator().next();
        int pnr = ticket.getPnrNumber();

        TicketCancellation cancellation = new TicketCancellation(pnr, 3, ticketSystem);
        cancellation.execute();

        assertTrue(ticketSystem.ticketBooked.isEmpty(), "Ticket should be cancelled");
        assertEquals(8, ticketSystem.seatsAvailability[0], "Seats should be restored");
        assertEquals(8, ticketSystem.seatsAvailability[1], "Seats should be restored");
    }

    @Test
    void testPartialCancellation() {
        TicketBooking booking = new TicketBooking('A', 'C', 4, ticketSystem);
        booking.execute();

        Ticket ticket = ticketSystem.ticketBooked.values().iterator().next();
        int pnr = ticket.getPnrNumber();

        TicketCancellation cancellation = new TicketCancellation(pnr, 2, ticketSystem);
        cancellation.execute();

        assertEquals(2, ticket.getSeats(), "Partial cancellation should update seat count");
        assertEquals(6, ticketSystem.seatsAvailability[0], "Only cancelled seats should be restored");
        assertEquals(6, ticketSystem.seatsAvailability[1], "Only cancelled seats should be restored");
    }

    @Test
    void testWaitingListPromotion() {
        TicketBooking booking1 = new TicketBooking('A', 'E', 8, ticketSystem);
        booking1.execute();

        TicketBooking booking2 = new TicketBooking('A', 'C', 2, ticketSystem);
        booking2.execute();

        Ticket ticket = ticketSystem.ticketBooked.values().iterator().next();
        int pnr = ticket.getPnrNumber();

        TicketCancellation cancellation = new TicketCancellation(pnr, 2, ticketSystem);
        cancellation.execute();

        assertEquals(0, ticketSystem.waitingList.size(), "Waiting list ticket should be promoted");
        assertEquals(1, ticketSystem.ticketBooked.size(), "Cancelled ticket should be replaced by waiting list ticket");
    }
}