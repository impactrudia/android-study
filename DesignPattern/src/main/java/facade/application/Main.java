package facade.application;

import facade.Facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        //HelpSystem이 접근이 안 되게 만듦으로써 메인에서 Facade로 객체 실행시킴
        facade.process();
    }
}
