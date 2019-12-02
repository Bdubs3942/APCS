public class FlourPacker {
    public static void main(String[] args){
        System.out.println(canPack(1, 0, 6));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(goal >=0){
            int bigCountTotalKilos = bigCount * 5;
            int smallCountBeforeGoal = goal % 5;

            return bigCountTotalKilos + smallCount >= goal && smallCountBeforeGoal <= smallCount;
        //     if(bigCountTotalKilos + smallCount >= goal){
        //         return true;
        //     } else {
        //         return false;
        //     }

         } else{
             return false;
        }

    }
}