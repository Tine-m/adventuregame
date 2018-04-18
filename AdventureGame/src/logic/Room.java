package logic;

public class Room {

    private final String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public Room(String description) {
        if (description == null) {
            throw new NullPointerException("description may not be null");
        }
        this.description = description;
        north = null;
        east = null;
        south = null;
        west = null;
    }
    
    public Room getNorth()
    {
        return north;
    }

    public Room getEast()
    {
        return east;
    }

    public Room getSouth()
    {
        return south;
    }

    public Room getWest()
    {
        return west;
    }

    public void connectNorth(Room other)
    {
        other.south = this;
        this.north = other;
    }
    
    public void connectEast(Room other)
    {
        other.west = this;
        this.east = other;
    }
    
    public void connectSouth(Room other)
    {
        other.north = this;
        this.south = other;
    }
    
    public void connectWest(Room other)
    {
        other.east = this;
        this.west = other;
    }
    
     public String getDescription()
    {
        return description;
    }
}
