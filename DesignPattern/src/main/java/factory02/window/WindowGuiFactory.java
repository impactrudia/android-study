package factory02.window;

import factory02.abst.Button;
import factory02.abst.GuiFactory;
import factory02.abst.TextArea;

public class WindowGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowTextArea();
    }
}
