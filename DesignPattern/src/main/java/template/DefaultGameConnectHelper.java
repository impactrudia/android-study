package template;

public class DefaultGameConnectHelper extends AbstractGameConnectHelper{

    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String str) {
        System.out.println("마지막 접속단계!");
        return str;
    }
}
