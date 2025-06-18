public class Pattern20 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
            if (i == 0)
                for (int j = 1; j < n; j++) System.out.print("* ");
            else {
                for (int j = 1; j < i; j++) System.out.print("  ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
