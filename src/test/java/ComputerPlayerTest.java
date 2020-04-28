import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComputerPlayerTest {

     @Test
     public void ComputerTest() {
         ComputerPlayer player = new ComputerPlayer(new Random());
         assertTrue(player.getName().contains("Computer"));
         assertNotNull(player.getMove());
     }
}
