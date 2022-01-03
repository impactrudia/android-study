package factory02.window;

import factory02.abst.Button;

public class WindowButton implements Button {

    @Override
    public void click() {
        System.out.println("window 버튼");
    }
}
