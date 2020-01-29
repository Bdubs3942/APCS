public class ToStringSample
{

    String bar;

    public ToStringSample(String bar)
    {
        this.bar = bar;
    }

    public static void main(String[] args)
    {

    }

    public String toString(){
        return "This is a " + getClass() + " and it has a variable wiht the value of " + bar + ".";
    }
}