import java.util.Scanner;

public class InputAdder {
    public static void main(String[] args){
        runInputAdder(5);
    }

    public static void runInputAdder(int numOfNumsToAdd){
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numOfNumsToAdd; i++){
            System.out.println("Please enter number " + (i+1) + " of " + numOfNumsToAdd + " to add: ");

            boolean isANumber = scanner.hasNextInt();

            if (isANumber) {
                total += scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Beep Boop I am broken.");
            }
        }
        scanner.close();

        System.out.println("The total of those number is: " + total);
    }
}