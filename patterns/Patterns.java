//Pattern1
public class Pattern1 {public static void main(String[] args) {
for (int i = 1; i <= 6; i++) {
for (int j = 1; j <= 6; j++) {
System.out.print("*"); }
System.out.println();
}
}
}

//Pattern2
public class Pattern2 {
public static void main(String[] args) {
 for (int i = 1; i <= 5; i++) {
 for (int j = 1; j <= 5; j++) {
 System.out.print(i + " ");
}
  System.out.println();
 }
 }
}


//Pattern3
public class Pattern3 {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
for (int j = 1; j <= 5; j++) {
   System.out.print(j + " ");
 }
   System.out.println();
  }
  }
}

//Pattern4
public class Pattern4 {
public static void main(String[] args) {
 int n = 5, num = 1;
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
  System.out.printf("%-4d", num++);
 }
 System.out.println();
  }
 }
}

//Pattern5
public class Pattern5 {
 public static void main(String[] args) {
  int n = 5, num = 1;
 for (int i = 0; i < n; i++) {
 int val = num;
 for (int j = 0; j < n; j++) {
  System.out.print(val + " ");
   val = (val % 9) + 1;
    }
  num = (num % 9) + 1;
    System.out.println();
      }
    }
}

//Pattern6
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

//Pattern7
public class Pattern7 {
public static void main(String[] args) {
int n = 5;
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
 System.out.print((j % 2 == 0 ? 1 : 0) + " ");
  }
  System.out.println();
     }
    }
}

//Pattern8
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

//Pattern9
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

//Pattern10
public class Pattern10 {
public static void main(String[] args) {
String word ="INDIA";
for (int i = 1; i <= word.length(); i++) {
System.out.println(word.substring(0,i));
}
}
}

//Pattern11
public class Pattern11 {
public static void main(String[] args) {
int n = 5;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
System.out.print("*");
}
System.out.println();
}
}
}

//Pattern12
public class Pattern12
{
public static void main(String[] args) 
{
int n = 4;
for(int i=1;i<=n;i++) 
{
int spaces=13-2*i;
for(int s=0;s<spaces;s++)
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++) 
{
System.out.print("* ");
}
System.out.println();
}
for(int i=n-1;i>=1;i--) 
{
int spaces=13-2*i;
for(int s=0;s<spaces;s++) 
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++) 
{
System.out.print("* ");
}
System.out.println();
}
}
}

//Pattern13
public class Pattern13 
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
int outerSpaces=Math.abs(mid-i);
int innerSpaces=n-2*outerSpaces-1;
for(int j=0;j<outerSpaces;j++) 
{
System.out.print("  ");
}
System.out.print("*");
if(innerSpaces>0) 
{
for(int j=0;j<innerSpacesj++) 
{
System.out.print("  ");
}
System.out.print("*");
}
System.out.println();
}
}
}

//Pattern14
public class Pattern14
{
public static void main(String[] args) 
{
int n=5;
for(inti=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{               
if(i==0||i==n-1||j==0||j==n-1) 
{
System.out.print("* ");
} 
else 
{
System.out.print("  ");
}
}
System.out.println();
}
}
}

//Pattern15
public class Pattern15
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
if(i==mid) 
{
System.out.print("   ");
for(int j=0;j<n;j++) 
{
System.out.print("* ");
}
} 
else 
{
System.out.print("         *");
}
System.out.println();
}
}
}

//Pattern16
public class Pattern16
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(j==i||j==n-1-i) 
{
System.out.print("*");
} 
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}

//Pattern17
public class Pattern17 
{
public static void main(String[] args) 
{
int n=7;
int mid=n/2;
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(i==0||i==3||i==6) 
{
System.out.print("* ");
}
else 
{
if(j==0||j==mid||j==n-1) 
{
System.out.print("*");
if(j!=n-1) 
{
System.out.print("     ");
}
} 
else 
{
}
}
}
System.out.println();
}
}
}

//Pattern18
public class Pattern18
{
public static void main(String[] args) 
{
for(int i=0;i<8;i++) 
{
System.out.print("* ");
}
System.out.println();
int spaces=8;
for(int i=0;i<5;i++) 
{
System.out.print("*");
for(int j=0;j<spaces;j++) 
{
System.out.print(" ");
}
System.out.println("*"); 
spaces-=2;
}
System.out.println("*");
}
}

//Pattern19
public class Pattern19
{
public static void main(String[] args) 
{
for(int i=0;i<=5;i++) 
{
for(int j=0;j<i;j++) 
{
System.out.print("* ");
}
System.out.println(i);
}
}
}

//Pattern20
public class Pattern20
{
public static void main(String[] args) 
{
for(int i=0;i<7;i++) 
{
System.out.print("* ");
}
System.out.println();
for(int i=0;i<6;i++) 
{
System.out.print("*"); 
for(int j=0;j<(2*i);j++) 
{
System.out.print(" ");
}
System.out.println("*");
}
}
}