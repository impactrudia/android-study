package factory02.mac;

import factory02.abst.TextArea;

public class MacTextArea implements TextArea {

    @Override
    public String getText() {
        return "맥 텍스트 에어리어";
    }
}
