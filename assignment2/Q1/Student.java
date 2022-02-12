package Q1;

public class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student s){
        this.rollNumber = s.rollNumber;
        this.name = s.name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}
