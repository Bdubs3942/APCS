import java.util.Random;

public class Squirtle {

    Random random = new Random();

    boolean isShiny;

    int currentLevel = 10;
    int maximumLevel = 100;
    int minimumLevel = 1;
    int hitPoints = 44;
    int attack = 48;
    int defense = 65;
    int specialAttack = 50;
    int specialDefense = 64;
    int speed = 43;

    String nature;
    String name;

    enum Natures {
        Hardy,
        Lonely,
        Adamant,
        Naughty,
        Brave,
        Bold,
        Docile,
        Impish,
        Lax,
        Relaxed,
        Modest,
        Mild,
        Bashful,
        Rash,
        Quiet,
        Calm,
        Gentle,
        Careful,
        Quirky,
        Sassy,
        Timid,
        Hasty,
        Jolly,
        Naive,
        Serious;

        public static Natures pickNature() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    public Squirtle() {
    }

    public static void main(String[] args)
    {
        Squirtle s = new Squirtle();
        s.setShiny();
        s.setNature();
        System.out.println("Go Squirtle!");
        s.announceShiny();
        s.announceNature();

    }

    public void setShiny()
    {
        isShiny = random.nextBoolean();
    }

    public boolean getShiny()
    {
        return isShiny;
    }

    public void announceShiny()
    {
        if(getShiny())
        {
            System.out.println("Yay! It's a shiny Pokemon.");
        }
        else
        {
            System.out.println("This Pokemon is not shiny.");
        }
    }

    public void setNature()
    {
        nature = Natures.pickNature().name();
    }

    public void announceNature()
    {
        System.out.println("This Pokemon's nature is: " + nature);
    }
}