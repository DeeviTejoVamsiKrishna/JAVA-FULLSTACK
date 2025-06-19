public class MethodExamples {
void addAndPrint(int a, int b) {
int sum = a + b;
System.out.println("Sum (printed inside method): " + sum);
}
int addAndReturn(int a, int b) {
return a + b;
}
void addFixedValuesAndPrint() {
int x = 5;
int y = 10;
int sum = x + y;
System.out.println("Sum of fixed values: " + sum);
}
int addFixedValuesAndReturn() {
int x = 7;
int y = 3;
return x + y;
}
public static void main(String[] args) {
MethodExamples obj = new MethodExamples();
obj.addAndPrint(12, 8);
int result = obj.addAndReturn(20, 30);
System.out.println("Returned sum: " + result);
obj.addFixedValuesAndPrint();
int sum = obj.addFixedValuesAndReturn();
System.out.println("Returned sum of fixed values: " + sum);
}
}
