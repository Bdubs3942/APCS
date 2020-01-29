public class ThisIsAnExampleHaHaHahaH
{
    int temperature;
    int chanceOfPrecipitation;

    public void setWeather(int temperature, int chanceOfPrecipitation)
    {
        this.temperature = temperature;
        this.chanceOfPrecipitation = chanceOfPrecipitation;
    }

    public void printWeather()
    {
        System.out.println("The current temperature is " + temperature + " degrees.");
        System.out.println("The chance of precipitation is " + chanceOfPrecipitation + "%.");
    }

    public static void main(String[] args)
    {
        ThisIsAnExampleHaHaHahaH weather = new ThisIsAnExampleHaHaHahaH();
        weather.setWeather(45, 50);
        weather.printWeather();
    }
}