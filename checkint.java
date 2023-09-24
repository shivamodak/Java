import java.util.Scanner;
public class checkint {
    public static void main(String args[])
    {
        System.out.println("Enter a number to check it is integer or not: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
