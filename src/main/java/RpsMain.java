import java.util.Scanner;

public class RpsMain {
    public static void main(String[] args){
        System.out.println("Let's play Rock Paper Scissors \n" +
                           "You will be playing against the computer \n");
        //Instantiate Human player
        HumanPlayer player = new HumanPlayer(new Scanner(System.in));

        //Instantiate game
        Game rpsGame=new Game();
        player.getDetails();
        for(int i=1;i<=player.getCounterDetails();i++) {
            System.out.println("Game: " + i);
            rpsGame.playGame(player);
        }
    }
}
