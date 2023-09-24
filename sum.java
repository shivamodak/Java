import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int sum = num1 +num2 +num3;
        System.out.println("The sum of these numbers is " + sum);
        sc.close();
    }
}