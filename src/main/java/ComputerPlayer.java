import java.util.Random;

public class ComputerPlayer implements Player {
private final Random random;

    public ComputerPlayer(Random random) {
        this.random = random;
    }

    public int getMove() {
        return random.nextInt(3);
    }

    public String getName() {
        return "Computer";
    }
}
