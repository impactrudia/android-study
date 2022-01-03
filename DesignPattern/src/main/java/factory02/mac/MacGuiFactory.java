package factory02.mac;

import factory02.abst.Button;
import factory02.abst.GuiFactory;
import factory02.abst.TextArea;

public class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
