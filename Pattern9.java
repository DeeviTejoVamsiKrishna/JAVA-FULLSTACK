public class Pattern9 {
public static void main(String[] args) {
int i,j,k=5+2,l=1;
for ( i = 1; i <k; i++) {
for ( j = 1; j <= (k-i); j++) {
System.out.print(" ");
}
for ( j=1;j<i;j++) {
System.out.print( 2*j + " " );
}
System.out.println();
}
}
}
