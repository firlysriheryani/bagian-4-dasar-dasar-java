
import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student(
            "Firly",
            "Sri",
            "Heryani",
            new Date(),
            "123456",
            "pengembangan perangkat lunak",
            "Sarjana",
            2028
        );

        String[] grades = {"A", "B+", "A-", "B"};

        student.calculateGPA(grades);

        student.displayStudent();

        System.out.println("\nMengubah Jurusan...");
        student.changeMajor("Matematika");

        System.out.println("Jurusan Baru: " + student.getMajor());
    }
}
