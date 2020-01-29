public class WeatherAnalyzerAnswer
{
    //Daily average temperatures in December 2019.
    //https://weather.com/weather/monthly/l/a5fb2107836588dd25f0f3d46491503cf8382246c7a9034fe2aba24ab65347df
    int[] temps = {32,28,38,39,36,31,38,40,34,8,9,19,18,20,15,27,27,13,29,38,40,41,39,37,36,35,28,35,41,34,25,33};

    public static void main(String[] args)
    {
        WeatherAnalyzerAnswer wa = new WeatherAnalyzerAnswer();

        wa.averageWeather(wa.temps);
        wa.highTemp(wa.temps);
    }


    public void highTemp(int[] temperatures)
    {
        int low = temperatures[0];
        for(int i = 0; i < temperatures.length; i++)
        {
            if(low > temperatures[i])
            {
                low = temperatures[i];
            }
        }
        System.out.println("The low temperature in December 2019 is " + low + ".");
    }

    public void averageWeather(int[] temperatures)
    {
        int total = 0;
        int average = 0;

        for(int i=0; i < temps.length; i++)
        {
            total += temperatures[i];
        }

        average = total/temperatures.length;

        System.out.println("The average is " + average + ".");
    }
}