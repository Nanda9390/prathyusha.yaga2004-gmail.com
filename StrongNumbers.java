import java.util. Scanner;
public class StrongNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = input.nextInt();
System.out.println("Strong numbers between 1 and " + n + " are:");
for (int i = 1; i <= n; i++) {
int num = i;
int sum = 0;
while (num > 0) {
int digit = num % 10;
// Calculate factorial
int fact = 1;
for (int j = 1; j <= digit; j++) {
fact *= j;
}
sum += fact;
num /= 10;
}
if (sum == i) {
System.out.println(i);
}
}
}
}