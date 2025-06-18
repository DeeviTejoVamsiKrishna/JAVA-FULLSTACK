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
