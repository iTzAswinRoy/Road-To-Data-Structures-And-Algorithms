package JavaxIQ;

// As a Backend Engineer, you're monitoring the daily server load (in terms of request volume or CPU usage),
// recorded as a list of numbers for each number represents the load for a given day.
//
// For each day, you want to determine how many days it will take until the server experiences a higher load than that day.
// If there is no future day with a higher load, return 0 for that day.
//
//      input = [73,74,75,71,69,72,76,73]
//
//      Output = [1,1,4,2,1,1,0,0]

import java.util.ArrayList;
import java.util.Arrays;

public class FindLoad {
    public static void main(String[] args) {
        int[] load = {73,74,75,71,69,72,76,73};

        ArrayList<Integer> result = findLoadPerDays(load);
        System.out.println(result);
    }

    static ArrayList<Integer> findLoadPerDays(int[] load) {

        ArrayList<Integer> daysPerLoad = new ArrayList<>();

        for (int i = 0; i < load.length; i++) {
            int count = 0;
            boolean found = false;

            for (int j = i + 1; j < load.length; j++) {
                count++;

                if (load[i] < load[j]) {

                    daysPerLoad.add(count);
                    found = true;
                    break;
                }
            }
            if (!found) {
                daysPerLoad.add(0);
            }
        }
        return daysPerLoad;
    }
}
