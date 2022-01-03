package strategy;

public class AObj {

    AInterface aInterface;

    public AObj() {
        aInterface = new AInterfaceImpl();
    }

    public void funcAA() {
        System.out.println("AAA");

        // 책임을 다른 객체의 기능을 빌려서 사용하는 것. "위임한다."라고 말한다.
        aInterface.funcA();

        // 기능이 필요하빈다 개발해주세요.
    }
}
