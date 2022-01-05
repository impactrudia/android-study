package template;

public abstract class AbstractGameConnectHelper {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String str);

    //템플릿 메소드
    public String requestConnection(String encoded) {

        //보안 작업 -> 암호화 된 문자열을 복호화한다.
        String decodeInfo = doSecurity(encoded);

        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";
        int i = authorization(userName);//반환된 것을 가지고 아이디, 암호를 할당한다.
        switch (i) {
            case -1:
                break;
            case 0:
                System.out.println("게임매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            default://기타 사항
        }

        return connection(decodeInfo);
    }
}
