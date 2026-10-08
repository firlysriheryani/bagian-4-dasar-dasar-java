
    public class StudentDriver {
    public static void main(String[] args) {

        Student student = new Student();

        student.studentName = "Lisa Palombo";
        student.studentID = "123456789";
        student.studentStatus = "Activ";

        System.out.println("Student Name: " + student.studentName);
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Student Status: " + student.studentStatus);
    }
}
