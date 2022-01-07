package observer;

public class Main {

    public static void main(String[] args) {
        //1. 제네릭
        //2. 델리게이트
        //3. 내부에 옵저버를 넣는다.
        Button button = new Button();
        button.addObserver(new Observable.Observer<String>() {
            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println(o + "is clicked");
            }
        });
        button.onClick();
        button.onClick();
        button.onClick();

        Button2 button2 = new Button2();
        button2.setOnClickListener(new Button2.OnClickListener2() {
            @Override
            public void onClick(Button2 button) {
                System.out.println(button + "is Clicked 2");
            }
        });

        button2.onClick();
    }
}

