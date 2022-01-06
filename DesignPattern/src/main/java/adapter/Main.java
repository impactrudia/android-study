package adapter;


public class Main {

    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        //halfOf기능 전에 로그를 추가 하고 싶을 때 함수 안에 넣어주면서 Math알고리즘 건드리지 않고 계속 추가하지 않고 함수 안에서 로그 기능 구현 가능
        System.out.println(adapter.halfOf(80f));
    }
}
