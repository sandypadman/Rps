import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Scanner scanner;
    User user;

    public HumanPlayer(Scanner scanner)
    {
        user= new User(scanner);
        this.scanner= scanner;
    }

    @Override
    public int getMove() {
        return  scanner.nextInt() ;
    }

    @Override
    public String getName() {
        return user.getName();
    }

    public void getDetails()
    {
        user.promptForName("Please enter your name: ");
        user.promptForCounter("How many games do you want to play: ");
        System.out.println(" Hello " + user.getName());
        System.out.println(" We will play "+ user.getCounter()+ " games");
    }

    public int getCounterDetails() {
        return user.getCounter();
    }
}
