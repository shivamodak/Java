import java.util.Scanner;
public class hello {
    public static void main(String args[])
    {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+ name + "!");
        System.out.println("Have a good day.");
        sc.close();
    }
}
