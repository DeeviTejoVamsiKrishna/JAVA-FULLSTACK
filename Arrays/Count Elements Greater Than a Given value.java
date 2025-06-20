public class CountGreater {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
        int value = 4;
        int count = 0;

        for (int i : arr) {
            if (i > value) count++;
        }

        System.out.println("Count > " + value + ": " + count);
    }
}