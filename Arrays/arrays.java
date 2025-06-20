// Add Integer Values of an Array
public class AddArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum = " + sum);
    }
}


// Calculate Average of Array
public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }
}


// Find Index of an Element
public class IndexFinder {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 30;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + index);
    }
}


// Check if Array Contains Specific Value
public class ContainsCheck {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12};
        int search = 8;
        boolean found = false;
        for (int val : arr) {
            if (val == search) {
                found = true;
                break;
            }
        }
        System.out.println(search + " exists: " + found);
    }
}


// Remove Specific Element
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int remove = 3;
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int val : arr) {
            if (val != remove) {
                newArr[index++] = val;
            }
        }
        System.out.println("Array after removing " + remove + ": " + Arrays.toString(newArr));
    }
}


// Copy One Array to Another
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied Array: " + Arrays.toString(copy));
    }
}


// Insert Element at Specific Position
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos = 2; // Insert at index 2
        int val = 25;
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0; i < pos; i++)
            newArr[i] = arr[i];
        newArr[pos] = val;
        for (int i = pos; i < arr.length; i++)
            newArr[i + 1] = arr[i];

        System.out.println("After Insertion: " + Arrays.toString(newArr));
    }
}


// Find Min and Max
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, 2, 33, 4};
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }
}


// Reverse an Array
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}


// Find Duplicate Values
public class DuplicateFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3};
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}


// Find Common Values Between Two Arrays
public class CommonValues {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.print("Common values: ");
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}


// Remove Duplicate Elements
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[j++] = arr[i];
            }
        }

        int[] result = Arrays.copyOf(temp, j);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}


// Find Second Largest Number in an Array
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 40, 25};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > first) {
                second = first;
                first = val;
            } else if (val > second && val != first) {
                second = val;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}


// Count Even and Odd Numbers
public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;
        for (int val : arr) {
            if (val % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}


// Difference of Largest and Smallest Values
public class DiffMaxMin {
    public static void main(String[] args) {
        int[] arr = {20, 50, 10, 40};
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("Difference = " + (max - min));
    }
}


// Verify if Array Contains 12 and 23
public class VerifyTwoValues {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 23, 9};
        boolean has12 = false, has23 = false;

        for (int val : arr) {
            if (val == 12) has12 = true;
            if (val == 23) has23 = true;
        }

        System.out.println("Contains 12 and 23: " + (has12 && has23));
    }
}


// Remove Duplicates and Return New Array
import java.util.Arrays;

public class RemoveAndReturn {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 6};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            for (int k = 0; k < j; k++) {
                if (temp[k] == arr[i]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[j++] = arr[i];
            }
        }

        int[] unique = Arrays.copyOf(temp, j);
        System.out.println("New array without duplicates: " + Arrays.toString(unique));
    }
}


// Find Missing Number in Sorted Array (1 to 100)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];
        int missing = 56; // Example missing number
        for (int i = 0, j = 1; i < 99; j++) {
            if (j == missing) continue;
            arr[i++] = j;
        }

        int expectedSum = 100 * (100 + 1) / 2;
        int actualSum = 0;
        for (int val : arr) {
            actualSum += val;
        }

        System.out.println("Missing number is: " + (expectedSum - actualSum));
    }
}