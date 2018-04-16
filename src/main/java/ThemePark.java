import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IEnjoyable> enjoyables;
    private String displayString;

    public ThemePark(ArrayList<IEnjoyable> enjoyables) {
        this.enjoyables = enjoyables;
    }

    public String showFunRatings() {

        displayString = "";

        for (IEnjoyable enjoyable: enjoyables) {
            displayString += enjoyable.getName() + ": " + enjoyable.getFunRating() + ", ";
        }

        displayString = displayString.substring(0, displayString.length() - 2);

        return displayString;
    }
}
