import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args)
    {

        String firstName;
        String lastName;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Hello " + firstName);
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);
        scan.close();

        // int numba;
        // int numbaTwo;

        // Scanner scan = new Scanner(System.in);

        // System.out.println("Gimmie a numba: ");
        // numba = scan.nextInt();
        // System.out.println("Gimmie anotha numba: ");
        // numbaTwo = scan.nextInt();
        // scan.close();
        // int sum = numba + numbaTwo;

        // System.out.println(sum);
    }
}