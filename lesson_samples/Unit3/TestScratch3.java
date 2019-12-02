public class TestScratch3
{
    public static void main(String[] args)
    {

        String monster = "Dracula";
        String vampire = new String();
        vampire = monster;

        boolean x = monster.equals(vampire);
        boolean y = vampire.equals(monster);
        boolean z = (monster == vampire);
        System.out.println(x + " " + y + " " + z);


        // boolean penguin = true;
        // boolean puffin = true;

        // !(penguin || puffin)

    }
}