public class PublicPrivateSample
{
    public int nowYouSeeMe;
    private int nowYouDont;

    public String Peeka;
    private String Boo;

    public PublicPrivateSample(int initNowYouSeeMe, int initNowYouDont){
        nowYouSeeMe = initNowYouSeeMe;
        nowYouDont = initNowYouDont;
        Peeka = "Here I am";
        Boo = "Where am I?";
        printVariables();
    }

    public static void main(String[] args)
    {
    }

    public void printVariables()
    {
        System.out.println(nowYouSeeMe);
        System.out.println(nowYouDont);
        System.out.println(Peeka);
        System.out.println(Boo);
    }
}