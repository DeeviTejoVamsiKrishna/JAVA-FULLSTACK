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
