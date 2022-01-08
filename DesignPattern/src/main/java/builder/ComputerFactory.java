package builder;

public class ComputerFactory {

    //설계도 가지고 있다.
    private BluePrint print;

    //설계도 만든다.
    public void setBluePrint(BluePrint print) {
        this.print = print;
    }

    public void make() {
        print.setRam();
        print.setCpu();
        print.setStorage();
    }

    public Computer getComputer() {
        return print.getComputer();
    }
}
