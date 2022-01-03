package strategy;

/**
 * - 인터페이스
 * - 키보드나 디스플레이 따위처럼 사람과 컴퓨터를 연결하는 장치
 * - 기능에 대한 선언과 구현 분리
 * - 기능을 사용 통로
 * - 델리게이트
 * - 위임하다
 * - 스트레터지 패턴
 * - 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
 */
public class Main {

    public static void main(String[] args) {
        //인터페이스
        AInterface aInterface = new AInterfaceImpl();
        aInterface.funcA();

        //델리데이트
        AObj aObj = new AObj();
        aObj.funcAA();

        //전략 패턴, 무기를 추가할 때 효율적!
        GameCharacter character = new GameCharacter();

        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}
