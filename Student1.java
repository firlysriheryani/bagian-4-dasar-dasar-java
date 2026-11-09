public class Student1 {
    // 1. Instance variables (Jawaban Soal No. 4)
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    // 2. Constructor Method (Jawaban Soal No. 4)
    public Student1(String name, int credits, double gpa, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
        this.qualityPoints = qualityPoints;
    }

    // 3a. Method untuk mengembalikan nilai rata-rata IP (poin mutu / kredit)
    public double calculateGPA() {
        if (credits == 0) {
            return 0.0; // Menghindari pembagian dengan nol
        }
        return qualityPoints / credits;
    }

    // 3b. Method untuk memperbarui kredit, poin mutu, dan IP
    public void addCourse(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        if (this.credits > 0) {
            this.gpa = this.qualityPoints / this.credits;
        }
    }

    // Method Getter untuk mengambil data
    public String getName() { 
        return name; 
    }

    public int getCredits() { 
        return credits; 
    }

    public double getQualityPoints() { 
        return qualityPoints; 
    }

    // ============================================================
    // METHOD MAIN (Jawaban Soal No. 5)
    // ============================================================
    public static void main(String[] args) {
        // Membuat 3 instance (objek) Student berdasarkan data tabel No. 5
        Student1 mary = new Student1("Mary Jones", 14, 0.0, 46.0);
        Student1 john = new Student1("John Stiner", 60, 0.0, 173.0);
        Student1 ari = new Student1("Ari Samala", 31, 0.0, 69.0);

        // Menampilkan data beserta hasil perhitungan IP masing-masing
        System.out.println("--- DATA MAHASISWA & IP ---");
        System.out.println("1. Nama: " + mary.getName() + " | Kredit: " + mary.getCredits() + " | Poin Mutu: " + mary.getQualityPoints() + " | IP: " + mary.calculateGPA());
        System.out.println("2. Nama: " + john.getName() + " | Kredit: " + john.getCredits() + " | Poin Mutu: " + john.getQualityPoints() + " | IP: " + john.calculateGPA());
        System.out.println("3. Nama: " + ari.getName() + " | Kredit: " + ari.getCredits() + " | Poin Mutu: " + ari.getQualityPoints() + " | IP: " + ari.calculateGPA());
    }
}