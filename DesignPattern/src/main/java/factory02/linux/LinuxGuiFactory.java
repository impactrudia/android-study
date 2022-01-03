package factory02.linux;

import factory02.abst.Button;
import factory02.abst.GuiFactory;
import factory02.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
