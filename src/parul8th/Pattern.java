package parul8th;

public class Pattern {

    public static void main(String[] args) {
        
        // 1. Right-angle triangle pattern
        System.out.println("Right-angle Triangle Pattern:");
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Left-aligned vertical stars
        System.out.println("Left-aligned Vertical Stars:");
        int rows1 = 5;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println();

        // 3. Diamond pattern
        System.out.println("Diamond Pattern:");
        int rows2 = 6;
        for (int i = 1; i <= rows2; i++) { // Upper half
            for (int j = i; j < rows2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows2 - 1; i >= 1; i--) { // Lower half
            for (int j = rows2; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 4. Hollow square pattern
        System.out.println("Hollow Square Pattern:");
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
