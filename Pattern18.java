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
