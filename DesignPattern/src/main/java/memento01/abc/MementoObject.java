package memento01.abc;

public class MementoObject {

    private String state;

    protected MementoObject(String state) {
        this.state = state;
    }

    protected String getState(){
        return state;
    }
}