package Y_JavaMaster;

public class Methods {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 5);
        highScore = calculateScore(false,1000,8,200);
        }

        int highScorePosition = calculateHighScorePosition(1500);
/*
        displayHighScorePosition("Tim", highScorePosition);
*/



        public static void displayHighScorePosition(String playerName, int highScorePosition){
            System.out.println(playerName + " manage to get into position " + highScorePosition + " on the high score position ");

        }

        public static int calculateHighScorePosition(int playerScore){
            if (playerScore > 1000){
                return 1;
            }else if(playerScore>500&& playerScore<1000){
                return 2;
            }else if(playerScore>100&& playerScore<500){
                return 3;
            }else {
                return 4;
            }
        }




        public static int calculateScore (boolean gameOver, int score, int levelComplted, int bonus){
        if (gameOver){
            int finalScore = score + (levelComplted * bonus);
            System.out.println("Your final score " + finalScore );
            return finalScore;

        }

        return -1;

        //or we can write like this
        /**/// }else{
               // return -1;
        // }

    }
    }



