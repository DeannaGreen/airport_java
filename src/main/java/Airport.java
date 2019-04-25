import java.util.ArrayList;

public class Airport {

    ArrayList<Plane> hangar = new ArrayList<Plane>();
    int capacity;

    Airport() {
        this.capacity = 10;
    }

    public void clearForLanding(Plane plane) {
        hangar.add(plane);
    }

    public void clearForTakeOff(Plane plane) {
        hangar.remove(plane);
    }
}