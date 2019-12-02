import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args){

    }

    public static void checker(){
        boolean canCheck = true;

        while(canCheck){
            Scanner number = new Scanner(System.in);

            System.out.println("Please enter a number to check in the high\\low sequence: ");
            number.nextInt();
            
            number.close();

            if (number.nextLine() == "Quit") {
                canCheck = false;
            } else {
                if (number.hasNextInt()) {

                }
            }


        }
        
    }
}