public class speedConverter{
    public static void main(String[] args){
       // printConversion(4.6);
       printConversion(50);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double kpm = kilometersPerHour;
        long mph = -1;

        if (kpm < 0){
            mph = -1;
        } else {
            mph = Math.round(kpm/1.609d);
        }

        return mph;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else{
            System.out.println("Invalid Value");
        }
    }
    
}