public class Student7 {
    // Instance variables
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    // Constructor untuk menginisialisasi objek Student
    public Student7(String name, int credits, double gpa, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
        this.qualityPoints = qualityPoints;
    }

    // a. Method untuk mengembalikan nilai rata-rata indeks prestasi saat ini
    public double calculateGPA() {
        if (credits == 0) {
            return 0.0; // Menghindari pembagian dengan angka nol
        }
        return qualityPoints / credits;
    }

    // b. Method untuk memperbarui kredit, poin mutu, dan IP berdasarkan input kelas/semester baru
    public void addCourse(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        if (this.credits > 0) {
            this.gpa = this.qualityPoints / this.credits;
        }
    }

    // Getter tambahan
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public double getGpa() { return gpa; }
    public double getQualityPoints() { return qualityPoints; }

    // Method main di dalam class yang sama supaya gampang di-run
    public static void main(String[] args) {
        // Membuat objek mahasiswa baru
        Student7 mhs = new Student7("Firly", 30, 3.5, 105.0);

        System.out.println("Nama: " + mhs.getName());
        System.out.println("IP Awal: " + mhs.calculateGPA());

        // Menguji method addCourse (menambah 3 kredit, 12 poin mutu)
        mhs.addCourse(3, 12.0);

        System.out.println("IP Setelah Update: " + mhs.calculateGPA());
    }
}