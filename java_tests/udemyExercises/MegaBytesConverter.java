public class MegaBytesConverter {
    public static void main (String[] args){
        printMegaBytesAndKiloBytes(10250);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kb = kiloBytes;

        int totalMB = kb/1_024;
        int remainingKB = kb % 1_024;
        if (kb >=0){
            System.out.println(kb + " KB = " + totalMB + " MB and " + remainingKB + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}