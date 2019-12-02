package expressionsStatements;

public class methodsPractice{
    public static void main(String[] args){
        int player1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Bruce", player1);
        int player2 = calculateHighScorePosition(900);
        displayHighScorePosition("Clark", player2);
        int player3 = calculateHighScorePosition(400);
        displayHighScorePosition("Diana", player3);
        int player4 = calculateHighScorePosition(50);
        displayHighScorePosition("Hal", player4);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get to position " + playerPosition+ " on the scoreboard.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int score = playerScore;

        int playerPosition = 4;

        if (score >= 1_000) {
            playerPosition = 1;
        } else if (score >= 500){
            playerPosition = 2;
        } else if (score >= 100) {
            playerPosition = 3;
        }

        return playerPosition;
    }
}