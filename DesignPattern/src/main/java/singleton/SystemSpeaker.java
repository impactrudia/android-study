package singleton;

/**
 * 싱글톤 패턴을 통해서 하나의 인스턴스만 생성하도록 구현 할 수 있다.
 */
public class SystemSpeaker {

    static private SystemSpeaker instance;//하나의 인스턴스만 하기위해서 외부에 접근 안되고 스태틱
    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {//널인지 체크해서 인스턴스가 널이 아니면
            //시스템 스피커
            instance = new SystemSpeaker();//인스턴스 생성
            System.out.println("새로 생성");
        } else {
            System.out.println("이미 생성");

        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int i) {
        volume = i;
    }
}
