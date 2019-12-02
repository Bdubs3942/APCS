package type_lessons;

public class operatorChallenge{
    public static void main(String[] args){
        double firstNumber = 20;
        double secondNumber = 80;
        double firstEquation = ((firstNumber + secondNumber) * 25);
        double secondEquation = firstEquation % 40;

        if (secondEquation <= 20){
            System.out.println("Total was over the limit.");
        }
    }
}