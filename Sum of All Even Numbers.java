public class SumEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) sum += i;
        }

        System.out.println("Sum of Even: " + sum);
    }
}
