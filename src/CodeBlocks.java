public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5000) {
            System.out.println("your score was less than 5000");
        } else {
            System.out.println("got here");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        //Challenge: Print out a second score , Score set to 10000 , Level completed set to 8, Bonus set to 200
        //Make sure the first printout above still displays as well.

        boolean newGameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (score >= 10000) {
            System.out.println("your score was equal to or greater than 10000.");
        } else if (score < 10000) {
            System.out.println("your score was less than 10000.");
        }

        if (gameOver == true) {
            int newFinalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + newFinalScore);
        }
    }
}
