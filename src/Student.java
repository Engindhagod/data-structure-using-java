
public class Student {
    String studentId;
    String studentName;

    // Constructor
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Display Student Details
    public void displayStudentDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
    }
}
