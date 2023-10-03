public class Diamond_pattern {
    public static void Diamond(int n) {

        // 1 half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 half
        for (int i = n; i >= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Diamond(4);
    }
    }

