package factory;

import factory.abst.BikeFactory;
import factory.abst.Body;
import factory.abst.Wheel;
import factory.gt.GtBikeFactory;
import factory.samchully.SamChullyFactory;

public class Main {

    public static void main(String[] args) {
        /**
         * 기본적으로 factory 원리 알려줌. 구현체가 다르지만 상위 타입은 같은 형태.
         */
        BikeFactory samChullyFactory = new SamChullyFactory();
        BikeFactory gtBikeFactory = new GtBikeFactory();

        viewFactory(samChullyFactory);
        viewFactory(gtBikeFactory);
    }

    private static void viewFactory(BikeFactory factory) {
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
