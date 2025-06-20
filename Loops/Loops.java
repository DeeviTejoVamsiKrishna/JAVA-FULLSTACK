//Bright it career
class Bright{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++){
            System.out.println("Bright IT Career");
        }
    }
} 


//1to20numbers
class Bright{
    public static void main(String[] args)
    {
        int i=1;
        while(i<=20){
            System.out.println(i);
            i++;
        }
    }
}


//equal or not equal
class EqualityDemo{
    public static void main(String[] args)
    {
        int[] numbers = {3,5,7,5,11};
        int target =12;
        System.out.println("Checking numbers equal or not equal to"+target+":");
        for(int num : numbers){
            if (num == target){
                System.out.println(num+"=="+target+"==Equal");
            }
            else if (num != target){
                System.out.println(num+"!="+target+"==Not Equal");
            }
        }
    }
}


//odd or even
class OddorEven{
    public static void main(String[] args)
    {
        for(int i=1;i<=20;i++){
            if (i%2==0){
                System.out.println("number"+" "+i+" "+"is Even");
            }
            else {
                System.out.println("number"+" "+i+" "+"is Odd");
            }
        }
    }
}


//largestofthree
import java.util.Scanner;
public class LargestOfThree{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int[] nums = {sc.nextInt() ,sc.nextInt() ,sc.nextInt()};
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
         System.out.println("Largest number is:"+max);
         sc.close();
    }
}


//evenbetween10to100
class EvenNumbers{
    public static void main(String[] args)
    {
       int num = 10;
       while(num<=100){
           if(num%2==0){
           System.out.println(num);
           }
           num++;
        }
    }
}


//whileloopbetween1to10
class Numbers{
    public static void main(String[] args)
    {
       int num = 1;
        do{
           System.out.println(num);
            num++;
        }while(num<=10);
       
    }
}


//armstrongornot
class ArmstrongNumbers{
    public static void main(String[] args)
    {
       int num=371,originalNum,remainder,result=0;
       originalNum = num;
       while(originalNum != 0)
       {
           remainder = originalNum%10;
           result += Math.pow(remainder,3);
           originalNum /= 10;
        }
        if(result==num)
            System.out.println(num+"is Armstrong Number");
        else
            System.out.println(num+"is not Armstrong Number");
    }
}


//primenumbers
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    int count = 0;
    System.out.println("Enter the number:");
    n = sc.nextInt();
    if (n <= 1) {
      System.out.println("The number is not prime");
      return;
    }
    for (int j = 1; j <= n / 2; j++) {
      if (n % j == 0) {
        count++;
      }
    }
    if (count > 1) {
        System.out.println("The number is not prime");
    }
    else {
      System.out.println("The number is prime");
    }
  }
}


//palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int original = n;    
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        sc.close(); 
    }
}

// Program to check whether a number is EVEN or ODD using switch
import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("The number is EVEN.");
                break;
            case 1:
                System.out.println("The number is ODD.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}


// Print gender (Male/Female) according to given M/F using switch
import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender is Male.");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender is Female.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}


// Program for multiple if-else (Largest number in 10, 20 and 30)
public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}
