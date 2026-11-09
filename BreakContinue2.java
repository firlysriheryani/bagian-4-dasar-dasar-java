public class BreakContinue2 {
    public static void main(String[] args) {
        String teks = "BELAJAR JAVA ITU MENYENANGKAN";

        int i = 0;

        while (i < teks.length()) {
            if (teks.charAt(i) == ' ') {
                break;
            }

            System.out.println(teks.charAt(i));
            i++;
        }

        System.out.println("Spasi pertama ditemukan!");
    }
}