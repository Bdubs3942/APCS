public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, 9));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
      //  boolean getUp = (isBarking && (hourOfDay < 8 || hourOfDay >22)) ? true : false;
      //  return getUp;
        if (hourOfDay >= 0 && hourOfDay <= 23){
            return (isBarking && (hourOfDay < 8 || hourOfDay >22)) ? true : false;
        } else {
            return false;
        }
    }
}