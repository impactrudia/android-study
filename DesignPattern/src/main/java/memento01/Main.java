package memento01;

import memento01.abc.MementoObject;
import memento01.abc.Originator;

import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Stack<MementoObject> mementos = new Stack<>();
        Originator originator = new Originator();

        originator.setState("state 1");
        mementos.push(originator.createMemento());
        originator.setState("state 2");
        mementos.push(originator.createMemento());
        originator.setState("state Final");
        mementos.push(originator.createMemento());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
    }
}