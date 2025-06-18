public class Pattern12 {
public static void main(String[] args) {
int n = 7;
int mid = n / 2;
for (int i = 0; i <= mid; i++) {
  for (int s = 0; s < mid - i; s++) System.out.print("  ");
     for (int j = 0; j < 2 * i + 1; j++) System.out.print("* ");
   System.out.println();
  }
 for (int i = mid - 1; i >= 0; i--) {
   for (int s = 0; s < mid - i; s++) System.out.print("  ");
      for (int j = 0; j < 2 * i + 1; j++) System.out.print("* ");
   System.out.println();
  }
 }
}
