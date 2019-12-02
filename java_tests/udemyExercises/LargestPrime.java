public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int num){
        int numFound = 0;

        if(num >= 2){
            for(int i = 2; i < num; i++){
                if (num % i == 0){
                    for (int y = 2; y < i/2; y++){
                        
                        }
                    }
                }
            if (numFound == 0){
                numFound = num;
            }
        } else {
            numFound = -1;
        }

        return numFound;
    }
}