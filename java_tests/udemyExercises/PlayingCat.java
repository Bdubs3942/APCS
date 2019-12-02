public class PlayingCat {
    public static void main(String[] args){

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (temperature >= 25 && temperature <= 45) ? true : false;
        } else {
            return (temperature >= 25 && temperature <= 35) ? true : false;
        }
    }
}