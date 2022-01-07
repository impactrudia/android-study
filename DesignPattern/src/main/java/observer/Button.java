package observer;

import observer.Observable.Observer;

public class Button {

    private Observable<String> observable;//Observable을 상속할 수 있으나 위임해서 사용함

    public Button() {
        this.observable = new Observable<>();
    }

    public void addObserver(Observer<String> o) {
        observable.addObserver(o);
    }

    public void notifyObservers() {
        observable.setChanged();
        observable.notifyObservers(null);
    }

    public void onClick() {
        notifyObservers();
    }
}
