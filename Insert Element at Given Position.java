import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int pos = 2; // index
        int val = 3;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) newArr[i] = val;
            else newArr[i] = arr[j++];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
