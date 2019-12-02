package type_lessons;

public class lb_to_kg{
    public static void main(String[] args){
        double pounds = 50;
        double basekiloPerPound = 0.45359237;

        double kiloPerPound = pounds * basekiloPerPound;

        System.out.println(kiloPerPound);

    }
}