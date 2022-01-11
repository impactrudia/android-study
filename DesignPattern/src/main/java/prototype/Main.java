package prototype;

/**
 * 학습 목표 : 프로토 타입 패턴을 통해서 복잡한 인스턴스 복사를 할 수 있다.
 * 프로토타입 패턴 : 생산 비용이 높은 인스턴스를 복사를 통해서 쉽게 생성 할 수 있도록 하는 패턴
 * 프로토 : 원형
 * 인스턴스 생산 비용이 높은 경우
 * - 종류가 너무 많아서 클래스로 정리되지 않는 경우
 * - 클래스로부터 인스턴스 생성이 어려운 경우
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(1991, 1));

        Cat yo = navi.copy();
        yo.setName("yo");
//        yo.setAge(new Age(2022, 3));
        yo.getAge().setYear(2022);
        yo.getAge().setValue(3);

        System.out.println(navi.getName());
        System.out.println(navi.getAge().getYear());

        System.out.println(yo.getName());
        System.out.println(yo.getAge().getYear());
    }
}
