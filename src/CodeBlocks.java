public class CodeBlocks {

    //learning codeblocks as well as using methods... refactored code.

    public static void main(String[] args) {

        calculateScore(true, 5000, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Daniel", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Raymond", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jeff", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the highscore table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        // either method works to let the player know what position they are in based on their score.

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        //Final code change.
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 1;
        }
        return position;
    }

    // creating methods.... CANNOT PUT A METHOD WITHIN A METHOD
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }


}
