import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsNot.not;

public class AirportTest {

    Airport airport;
    Plane plane;

    @Before
    public void createInstance() {
        airport = new Airport();
        plane = new Plane();
    }

    @Test
    public void planeLandAtAirport() {
        plane.land();
        Assert.assertEquals("Plane has landed", plane.getStatus());
    }

    @Test
    public void planeStoredAtAirport() {
        airport.clearForLanding(plane);
        Assert.assertThat(airport.hangar, hasItem(plane));
    }

    @Test
    public void planeTakeOffFromAirport() {
        plane.takeOff();
        Assert.assertEquals("Plane has taken off", plane.getStatus());
    }

    @Test
    public void planeNotAtAirport() {
        airport.clearForLanding(plane);
        airport.clearForTakeOff(plane);
        Assert.assertThat(airport.hangar, not(hasItem(plane)));
    }
}
