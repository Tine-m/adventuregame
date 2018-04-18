package logic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PlayerTest {

    Room start;

    @Before
    public void setup() {
        start = new Room("Start");
        Room north = new Room("North");
        //Room northsNorth = new Room("North of north");
        start.connectNorth(north);
        //north.connectNorth(northsNorth);
    }

    @Test
    public void testCreatePlayer() {
        Player player = new Player(start);
        Room result = player.getCurrentRoom();
        assertEquals("Start", start.getDescription());
    }

    @Test
    public void testGoNorth() {
        Player player = new Player(start);
        boolean result = player.goNorth();
        assertTrue(result);
        assertEquals("North", player.getCurrentRoom().getDescription());
          
    }
    
    @Test
    public void testGoEastWhenThereIsNoEastRoom() {
        Player player = new Player(start);
        boolean result = player.goEast();
        assertFalse(result);
    }
}
