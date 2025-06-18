import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int del = 3;
        int[] newArr = new int[arr.length - 1];
        int index = 0;

        for (int value : arr) {
            if (value != del) {
                if (index < newArr.length) newArr[index++] = value;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
