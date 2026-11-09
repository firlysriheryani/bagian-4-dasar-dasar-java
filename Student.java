
import java.util.Date;

public class Student extends Person {
    private String nim;
    private double gpa;
    private String major;
    private String degree;
    private int graduationYear;

    public Student(String firstName, String middleName,
                   String lastName, Date dateOfBirth,
                   String nim, String major,
                   String degree, int graduationYear) {

        super(firstName, middleName, lastName, dateOfBirth);

        this.nim = nim;
        this.gpa = 0.0;
        this.major = major;
        this.degree = degree;
        this.graduationYear = graduationYear;
    }

    public String getNim() {
        return nim;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    public void calculateGPA(String[] grades) {
        double total = 0;

        for (String grade : grades) {
            switch (grade.toUpperCase()) {
                case "A":
                    total += 4.0;
                    break;
                case "A-":
                    total += 3.67;
                    break;
                case "B+":
                    total += 3.33;
                    break;
                case "B":
                    total += 3.0;
                    break;
                case "B-":
                    total += 2.67;
                    break;
                case "C+":
                    total += 2.33;
                    break;
                case "C":
                    total += 2.0;
                    break;
                case "D":
                    total += 1.0;
                    break;
                case "F":
                    total += 0.0;
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Nilai tidak valid: " + grade
                    );
            }
        }

        if (grades.length > 0) {
            gpa = total / grades.length;
        }
    }

    public void displayStudent() {
        System.out.println("Nama: " + getName());
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + major);
        System.out.println("Gelar: " + degree);
        System.out.println("Tahun Kelulusan: " + graduationYear);
        System.out.println("IP / GPA: " + gpa);
    }
}
