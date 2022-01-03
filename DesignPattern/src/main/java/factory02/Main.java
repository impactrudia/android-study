package factory02;

import factory02.abst.Button;
import factory02.abst.GuiFactory;
import factory02.abst.TextArea;
import factory02.concreate.FactoryInstance;

public class Main {

    public static void main(String[] args) {
//        GuiFactory fac = new LinuxGuiFactory();
//        GuiFactory fac = new MacGuiFactory();
        /**
         * 라이브러리 변경 없이 동일한 인터페이스를 제공하면서 동일한 결과 얻을 수 있다.
         */
        GuiFactory fac = FactoryInstance.getGuiFactory();

        Button button = fac.createButton();
        TextArea area = fac.createTextArea();

        button.click();
        System.out.println(area.getText());

    }
}
