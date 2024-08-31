package JavaConstructor;

// Create a class Student with a copy constructor that copies the values of name and grade from another Student object.
public class C4 {       //
    private String name;        //
    private String grade;       //

    C4 (String name, String grade){         //
        this.name = name;       //
        this.grade = grade;       //
    }

    C4 (C4 obj){        //
        this.name = obj.name;
        this.grade = obj.grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        C4 obj1 = new C4("Aswin", "12th");
        C4 obj2 = new C4(obj1);

        System.out.println("Name:"+obj2.getName());
        System.out.println("Grade:"+obj2.getGrade());
    }
}
