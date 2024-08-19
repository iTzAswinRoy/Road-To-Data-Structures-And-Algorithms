package JavaConstructor;

// Create a class Person with a default constructor that initializes name to "Aswin" and age to 20.
public class c1 {
    private String name;
    private int age;

    public c1() {
        this.name = "Aswin";
        this.age = 20;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if(age < 70) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        c1 obj = new c1();
        obj.setAge(45);

        System.out.println("My name is "+ obj.getName());
        System.out.println("My age is "+ obj.getAge());
    }
}

