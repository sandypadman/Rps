import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {
    @Test
    public void checkUser() {
     User human = new User(new Scanner(System.in));
     human.setName("sandhya");
     human.setCounter(1);
     assertTrue( human.getName().contains("sandhya"));
     assertEquals( human.getCounter(),1);
    }

    @Test
    public void checkItems()
    {
        Items item = Items.values()[1];
        assertFalse(item.defeats(Items.values()[2]));
    }

    @Test
    public void checkPlayGame()
    {
        Game game= new Game();
        HumanPlayer player= mock (HumanPlayer.class);
        when(player.getName()).thenReturn("MockingStar");
        when(player.getMove()).thenReturn(1);
        game.playGame(player);
    }

}
