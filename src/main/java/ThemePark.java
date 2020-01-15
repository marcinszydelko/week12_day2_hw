import attractions.Attraction;
import attractions.Playground;
import behaviours.IReviewed;
import com.sun.tools.javac.util.ArrayUtils;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark(ArrayList<Stall> stalls, ArrayList<Attraction> attractions) {
        this.stalls = stalls;
        this.attractions = attractions;
    }

    public void visit(Visitor visitor, Playground playground) {
        visitor.visit(playground);
        playground.addVisit();
    }

//    public ArrayList<IReviewed> getAllReviewed(){
//        ArrayList<IReviewed> reviewed = new ArrayList<>();
//
//        for(Stall stall : stalls) {
//            reviewed.add(stall);
//        }
//
//        for(Attraction attraction : attractions) {
//            reviewed.add(attraction);
//        }
//
//        return reviewed;
//    }


}
