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

