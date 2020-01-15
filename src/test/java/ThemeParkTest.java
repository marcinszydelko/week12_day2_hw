import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private RollerCoaster rollerCoaster;
    private TobaccoStall tobaccoStall;
    private Dodgems dodgems;
    private Playground playground;
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;
    private Visitor visitor;


    @Before
    public void before() {
        visitor = new Visitor(14, 1.2, 40.0);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,4);
        dodgems = new Dodgems("Bumper Cars", 5);
        stalls.add(tobaccoStall);
        attractions.add(playground);
        attractions.add(rollerCoaster);
        attractions.add(dodgems);
        themePark = new ThemePark(stalls, attractions);
    }

//    @Test
//    public void shouldReturnArrayOfAllReviewed() {
//        ArrayList<IReviewed> reviewed = new ArrayList<>();
//        reviewed.add(tobaccoStall);
//        reviewed.add(playground);
//        reviewed.add(rollerCoaster);
//        reviewed.add(dodgems);
//        assertEquals(reviewed, themePark.getAllReviewed());
//    }

//    @Test
//    public void shouldCountVisitorsOfAttraction() {
//        themePark.visit(visitor, playground);
//        System.out.println("ASdasd");
//        System.out.println(playground.getVisitCount());
//        assertEquals(1, playground.getVisitCount());
//    }
//
//    @Test
//    public void shouldAddAttractionToListOfVisitedAttractions() {
//        themePark.visit(visitor, playground);
//        assertEquals(playground, visitor.getVisitedAttractions().get(0));
//    }

}

