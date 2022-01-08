package builder;

/**
 * - 빌더패턴
 * 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
 */
public class Main {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBluePrint());
//        factory.setBuilder(new MacAirBluePrint());
//        Computer computer = factory.makeAndGet();
        factory.make();
        System.out.println("computer1 : " + factory.getComputer());

        Computer computer = factory.getComputer();
        //Computer computer1 = ComputerBuilder.start()
        System.out.println("computer2 : " + computer);

        // 생성자에 파라미터로 넣으면 값을 잘못 대입할 수 있지만 빌더패턴을 이용해서 값에 대한 직관력을 높일 수 있다.
        Computer builder = new ComputerBuilder()
                .startWithCpu("i9")
                .setRam("16g")
                .setStorage("1T ssd")
                .build();
        System.out.println("builder1 : " + builder);
    }
}
