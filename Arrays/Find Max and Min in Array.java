
public class MinMax {
public static void main(String[] args) {
int[] arr = {5, 1, 9, 3};
int max = arr[0], min = arr[0];
for (int i : arr) {
if (i > max) max = i;
if (i < min) min = i;
}
System.out.println("Max: " + max + ", Min: " + min);
}
}
