package factory02.linux;

import factory02.abst.TextArea;

public class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트 에어리어";
    }
}
