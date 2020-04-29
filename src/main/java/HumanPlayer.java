import java.util.Scanner;

public class HumanPlayer extends User implements Player {
    private final Scanner scanner;

    public HumanPlayer(Scanner scanner)
    {
        super(scanner);
        this.scanner= scanner;
    }

    public int getMove() {
        return  scanner.nextInt() ;
    }

}
