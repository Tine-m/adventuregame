package logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testConectRoomWithNorthRoom() {
        Room start = new Room("Start");
        Room north = new Room("North");
        start.connectNorth(north);
        assertEquals("North", start.getNorth().getDescription());
        assertEquals("Start", north.getSouth().getDescription());
    }

    @Test
    public void testConectRoomWithSouthRoom() {
        Room start = new Room("Start");
        Room south = new Room("South");
        start.connectSouth(south);
        assertEquals("South", start.getSouth().getDescription());
        assertEquals("Start", south.getNorth().getDescription());
    }
    
    @Test
    public void testConectRoomWithEastRoom() {
        Room start = new Room("Start");
        Room east = new Room("East");
        start.connectEast(east);
        assertEquals("East", start.getEast().getDescription());
        assertEquals("Start", east.getWest().getDescription());
    }
    
      @Test
    public void testConectRoomWithWestRoom() {
        Room start = new Room("Start");
        Room west = new Room("West");
        start.connectWest(west);
        assertEquals("West", start.getWest().getDescription());
        assertEquals("Start", west.getEast().getDescription());
    }

    @Test
    public void testGetRoomViaOtherRoom() {
        Room start = new Room("Start");
        Room north = new Room("North");
        Room northsNorth = new Room("North of north");
        start.connectNorth(north);
        north.connectNorth(northsNorth);    
        assertEquals("North of north", north.getNorth().getDescription());
        assertEquals("North", northsNorth.getSouth().getDescription());
        assertEquals("North of north", start.getNorth().getNorth().getDescription());
    }

    @Test
    public void testGetRoomInMazeWithOnlyOneRoom() {
        Room room = new Room("Start room");
        Room result = room.getEast();
        assertNull(result);
        result = room.getWest();
        assertNull(result);
        result = room.getNorth();
        assertNull(result);
        result = room.getSouth();
        assertNull(result);
    }
}
