public class WeatherAnalyzer
{
    //Daily average temperatures in December 2019.
    //https://weather.com/weather/monthly/l/a5fb2107836588dd25f0f3d46491503cf8382246c7a9034fe2aba24ab65347df
    int[] temps = {32,28,38,39,36,31,38,40,34,8,9,19,18,20,15,27,27,13,29,38,40,41,39,37,36,35,28,35,41,34,25};

    public static void main(String[] args)
    {
        WeatherAnalyzer wa = new WeatherAnalyzer();

        // wa.average(wa.temps);
        wa.high(wa.temps);
    }


    public void average(int[] x)
    {
        int average = 0;
        int total = 0;

        for(int i = 0; i < x.length; i++)
        {
            total += x[i];
        }

        average = total/x.length;

        System.out.println(average);
    }

    public void high(int[] y)
    {
        int highestNumber = y[0];

        for(int i = 0; i < y.length; i++)
        {
            if(highestNumber < y[i])
            {
                highestNumber = y[i];
            }
        }  
        
        System.out.println(highestNumber);
    }

}