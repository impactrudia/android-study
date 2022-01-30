package memento01.abc;

public class Originator {

    private String state;

    public MementoObject createMemento(){
        return new MementoObject(state);
    }

    public void restoreMemento(MementoObject memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
}