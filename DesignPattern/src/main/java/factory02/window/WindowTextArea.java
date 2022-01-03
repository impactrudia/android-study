package factory02.window;

import factory02.abst.TextArea;

public class WindowTextArea implements TextArea {

    @Override
    public String getText() {
        return "window 텍스트 에어리어";
    }
}
