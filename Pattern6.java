public class Pattern6 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i < n; i++) {
            int val = num;
            for (int j = 0; j < n; j++) {
                System.out.print(val + " ");
                val += 2;
            }
            num += 20;
            System.out.println();
        }
    }
}
