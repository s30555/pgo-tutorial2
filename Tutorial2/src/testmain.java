import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testmain {
    @Test
    public void testApplyAgeDiscount() {

        assertEquals(0.0, Main.applyAgeDiscount(5, 40.0));

        assertEquals(20.0, Main.applyAgeDiscount(15, 40.0));

        assertEquals(40.0, Main.applyAgeDiscount(25, 40.0));
    }
    @Test
    public void testApplyCityDiscount() {

        assertEquals(36.0, Main.applyCityDiscount("Warsaw", 40.0));

        assertEquals(40.0, Main.applyCityDiscount("Krakow", 40.0));
    }
    @Test
    public void testApplyThursdayDiscount() {

        assertEquals(0.0, Main.applyThursdayDiscount(true, 40.0));
        
        assertEquals(40.0, Main.applyThursdayDiscount(false, 40.0));
    }
    @Test
    public void testCalculateTicketPrice() {

        assertEquals(0.0, Main.calculateTicketPrice("Warsaw", 9, true));

        assertEquals(40.0, Main.calculateTicketPrice("Krakow", 25, false));

        assertEquals(20.0, Main.calculateTicketPrice("Krakow", 15, false));

        assertEquals(36.0, Main.calculateTicketPrice("Warsaw", 25, false));

        assertEquals(0.0, Main.calculateTicketPrice("Krakow", 25, true));
    }
}
