import java.util.Random;

public class Game {

    public void playGame(Player humanPlayer) {
        // instantiating computer player
        ComputerPlayer computer= new ComputerPlayer(new Random());
        System.out.println(" Please enter 1- for Rock,2- for Paper,3 for Scissors ");
        boolean j = true;

        while (j == true) {
            //get moves
            int b= humanPlayer.getMove();
            int a= computer.getMove();

            if (b > 3 || b <= 0 )
            {
                System.out.println(" Please input a valid input");
            }
            else {
                j= false;
                Items humanInput = Items.values()[b-1];
                System.out.println( humanPlayer.getName() +" input  :"+ humanInput.toString());
                Items computerInput = Items.values()[a];
                System.out.println( computer.getName() +" input  :"+ computerInput.toString());

                if (humanInput.defeats(computerInput)) {
                    System.out.println("you win");
                } else if (computerInput.defeats(humanInput)) {
                    System.out.println("you lose");
                } else {
                    System.out.println("It is a draw");
                }
            }
        }
    }
}
