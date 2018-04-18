package logic;

public class Player {

    private Room currentRoom;
    private int damage;
    //private static final int DAMAGE_FROM_START = 10;
    
    //rygsæk til player items

    public Player(Room startRoom) {
        this.currentRoom = startRoom; 
        damage = 10; 
    }
    
    public Room getCurrentRoom() {
        return currentRoom;
    }
    
    public boolean goNorth()
    {
        if(currentRoom.getNorth() == null) return false;
        currentRoom = currentRoom.getNorth();
        return true;
    }
    
    public boolean goEast()
    {
        if(currentRoom.getEast() == null) return false;
        currentRoom = currentRoom.getEast();
        return true;
    }
    
    public boolean goSouth()
    {
        if(currentRoom.getSouth() == null) return false;
        currentRoom = currentRoom.getSouth();
        return true;
    }
    
    public boolean goWest()
    {
        if(currentRoom.getWest() == null) return false;
        currentRoom = currentRoom.getWest();
        return true;
    }

    public void increaseDamage(int damage) {
        this.damage += damage;
    }

    public int getDamage() {
        return damage;
    }
}
