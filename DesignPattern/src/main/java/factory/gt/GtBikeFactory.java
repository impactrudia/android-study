package factory.gt;

import factory.abst.BikeFactory;
import factory.abst.Body;
import factory.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
