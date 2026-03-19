import java.util.Scanner;
public class Test {
public static void main(String[] args) {
Scanner input= new  Scanner(System.in);
System.out.println("Enter a number:");
int num1=input.nextInt();
int num2=input.nextInt();
System.out.println("Your numbers are");
System.out.println(num1+num2);
input.close();
int sum= num1 + num2;
System.out.println(sum);}
}