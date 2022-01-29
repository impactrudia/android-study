package flyweight;

/**
 * 메모리 사용을 적게 하기 위해 생성된 객체를 재사용하는 패턴
 */
public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight = factory.getFlyweight("A");

        System.out.println(flyweight);

        flyweight = factory.getFlyweight("A");

        System.out.println(flyweight);
    }
}
