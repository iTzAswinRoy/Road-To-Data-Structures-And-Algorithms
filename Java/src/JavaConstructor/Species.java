package JavaConstructor;

// Create a base class Animal with a constructor that initializes species.
// Then, create a derived class Dog that calls the base class constructor.
 class Animal {     //
     private String species;      //

     Animal(String species) {
         this.species = species;

     }

     public void displaySpecies() {      //
         System.out.println("Animal class species is " + species);
     }
}

class Dog extends Animal {      //
     private String breed;

     Dog(String breed) {        //
          this(breed, "unknown");
     }

     Dog(String breed, String species) {     //
         super(species);
         this.breed = breed;
     }
     public void displayBreed(){
         System.out.println("Dog breed is " + breed);
     }
}

public class Species {
    public static void main(String[] args) {
        Dog myDog = new Dog("Pit bull", "Dog");
        Dog myDog2 = new Dog("Shit-zuh");


        myDog.displaySpecies();
        myDog.displayBreed();

        System.out.println();
        myDog2.displaySpecies();
        myDog2.displayBreed();
    }
}
