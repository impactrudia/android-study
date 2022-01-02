package factory.samchully;

import factory.abst.BikeFactory;
import factory.abst.Body;
import factory.abst.Wheel;

public class SamChullyFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamChullyBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamChullyWheel();
    }
}
