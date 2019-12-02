public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(10);
    }
    public static void printSquareStar(int size) {
        if (size < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < size; i++) {
                for (int y = 0; y < size; y++) {
                    if (i == 0 || i == size -1) {
                        System.out.print("*");
                    } else if (y == 0 || y == (size - 1)) {
                        System.out.print("*");
                    } else if (i == y) {
                        System.out.print("*");
                    //I am still feeling pretty unsure about the logic going into the next line.
                    } else if (y == size - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}