package logic;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }
    
    public void use(Player p) {
        //do nothing
        // but we need to implement adding item to player´s backpack
        //p.addItemToBackPack(this);
    }
    
}
