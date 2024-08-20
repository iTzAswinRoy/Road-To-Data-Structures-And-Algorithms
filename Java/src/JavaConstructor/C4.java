package JavaConstructor;

// Create a class Student with a copy constructor that copies the values of name and grade from another Student object.
public class C4 {
    private String name;
    private String grade;

    C4 (){
        this.name = "Aswin";
        this.grade = "6th";
    }

    C4 (C4 obj){
        this.name = obj.name;

        this.grade = obj.grade;
    }

    public static void main(String[] args) {

    }
}
