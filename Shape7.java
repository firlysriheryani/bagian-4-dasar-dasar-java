public class Shape7 {
    // Instance variables
    private int numSides;
    private boolean regular;

    // Constructor pertama (default)
    public Shape7() {
        numSides = 0;
        regular = false;
    }

    // Constructor kedua (dengan parameter)
    public Shape7(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter
    public int getNumSides() {
        return numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    // Setter
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    // Method main (cukup satu saja di dalam class)
    public static void main(String[] args) {
        Shape7 shape1 = new Shape7();
        Shape7 shape2 = new Shape7(4, true);

        System.out.println("Shape 1");
        System.out.println("Jumlah sisi: " + shape1.getNumSides());
        System.out.println("Beraturan: " + shape1.isRegular());

        System.out.println("\nShape 2");
        System.out.println("Jumlah sisi: " + shape2.getNumSides());
        System.out.println("Beraturan: " + shape2.isRegular());
    }
}