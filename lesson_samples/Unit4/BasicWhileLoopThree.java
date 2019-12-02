public class BasicWhileLoopThree
{
    public static void main(String[] args)
    {
        int foo = 1;

        while(foo <= 1000)
        {
            if(foo % 2 == 0){
                System.out.println("This number is even: " + foo);
            }
            foo++;
        }

        System.out.println();
        System.out.println("This will not print until foo reaches 10.");
    }
}