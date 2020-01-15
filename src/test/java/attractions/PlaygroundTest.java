package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(14, 130, 15);
        visitor2 = new Visitor(16, 135, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void shouldAllowVisitorIfUnder16() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void shouldNotBeAllowedVisitorIfOver15() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
