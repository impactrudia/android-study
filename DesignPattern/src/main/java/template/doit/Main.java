package template.doit;

import template.AbstractGameConnectHelper;
import template.DefaultGameConnectHelper;

/**
 * -Template : 모양자에 펜 색깔을 달리할 때마다 빨간동그라미, 파란 동그라미가 된다.
 * -Template Method Pattern : 고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴
 *   - 구현하려는 알고리즘이 일정한 프로세스가 있다.
 *   - 구현하려는 알고리즘이 변경 가능성이있다.
 *   - 알고리즘을 여러 단계로 나눈다.
 *   - 나눠진 알고리즘 단계를 메소드로 선언한다.
 *   - 알고리즘을 수행할 템플릿 메소드를 만든다.
 *   - 하위 클래스에서 나눠진 메소드들을 구현한다.
 */
public class Main {

    public static void main(String[] args) {
        AbstractGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
