package factory02.mac;

import factory02.abst.Button;

public class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("맥 버튼");
    }
}
