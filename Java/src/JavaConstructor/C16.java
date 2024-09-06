package JavaConstructor;

// Write a class ImmutablePerson that has final fields and only provides a constructor for initializing these fields.
public class C16 {      //
    private final String name;
    private final int age;

    C16(String name, int age) {     //
        this.name = name;
        this.age = age;
    }

    public String getName() {       //
        return name;        //
    }

    public int getAge() {       //
        return age;     //
    }

    public static void main(String[] args) {        //
        C16 person = new C16("Aswin", 25);      //
        System.out.println("Person details:");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
