package Question1;

public class Student {
    private String name;
    private String studentID;
    private float gpa;

    public Student(){
        name = "Simple student";
        studentID = "0";
        gpa = 4.0F;
    }

    //deep copy
    public Student(Student s){
        Student student = new Student();
        this.name = s.name;
        this.studentID = s.studentID;
        this.gpa = s.gpa;
    }

    //shallow copy
    Student s1 = new Student();
    Student s2 = s1;

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public float getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


}
