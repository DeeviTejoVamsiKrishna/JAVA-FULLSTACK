public class EquilateralTriangle {
public static void main(String[] args) {
short i,j,k=5+2,l=1;
for ( i = 1; i <k; i++) {
for ( j = 1; j <= (k-i); j++) {
System.out.print(" ");
}
for ( j=1;j<i;j++) {
System.out.print(" *");
}
System.out.println();
}
}
}
