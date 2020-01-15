package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 146, 15);
        visitor2 = new Visitor(13, 130, 25);
        visitor3 = new Visitor(11, 140, 25);
        visitor4 = new Visitor(25, 204, 45);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canUseRollerCoaster() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void shouldChargeRegularFeeCustomersUnder200Cm() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void shouldChargeDoubleFeeCustomersOver200Cm() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.01);
    }
}
