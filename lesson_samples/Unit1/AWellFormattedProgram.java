public class AWellFormattedProgram{
    public static void main(String[] args) {
        charSwitcher('Q');
    }

    public static void charSwitcher(char letter){
        switch(letter){
            case 'A':
                System.out.println("The character was A.");
                break;
            case 'B':
                System.out.println("The character was B.");
                break;
            case 'C':
                System.out.println("The character was C.");
                break;
            case 'D':
                System.out.println("The character was D.");
                break;
            case 'E':
                System.out.println("The character was E.");
                break;
            default:
                System.out.println("The character was not A, B, C, D, E.");
                break;
        }
    }
}