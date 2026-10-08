public class soal2_dan3_4_4 {
    public static void main(String[] args) {
        
        System.out.println("=== JAWABAN SOAL NO. 2 ===");
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("a. s1.compareTo(s2) = " + s1.compareTo(s2));
        System.out.println("b. s2.equals(s3)    = " + s2.equals(s3));
        System.out.println("c. s3 == s1         = " + (s3 == s1));
        System.out.println("d. s2.compareTo(s3) = " + s2.compareTo(s3));
        System.out.println("e. s3.equals(s1)    = " + s3.equals(s1));

        System.out.println("\n=== JAWABAN SOAL NO. 3 ===");
        // Mendeklarasikan dan menginstansiasi dua objek String terpisah
        String kataPertama = "Belajar";
        String kataKedua = "Java";
        
        // Menggabungkan keduanya dan menetapkan ke objek String ketiga
        String kataKetiga = kataPertama + " " + kataKedua;
        
        System.out.println("Hasil penggabungan string: " + kataKetiga);
    }
}