package singleton;

public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();//new Speaker가 되지 않는다. 왜냐하면 private니깐
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();//정말 하나의 리소스에서만 접근하는지 확인하기 위해서 두개 생성.

        //5, 5
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);//동일한 인스턴스라는게 증명 되는 것, 하나만 변경했는데 두 개가 나옴, 확실하게 하려면 디버깅하면 좋다.
        //11, 11
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(22);
        //22, 22
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}
