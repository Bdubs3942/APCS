public class MinutesToYearsDaysCalculator {
    public static void main(String[] args){
        printYearsAndDays(725_949);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes >= 0){
            System.out.println(minutes + " min = " + (((minutes/60l)/24l)/365l) + " y and " + (((minutes/60l)/24l) % 365 )+ " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}