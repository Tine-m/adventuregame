package logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeaponTest {

    @Test
    public void testUseWeapon() {
        //Arrange
        Item item = new Weapon("sword", 5);
        Player player = new Player(new Room("start"));
        int expectedDamageResult = 15;
        
        //Act
        item.use(player);

        //Assert
        assertEquals(expectedDamageResult, player.getDamage());
    }
}
