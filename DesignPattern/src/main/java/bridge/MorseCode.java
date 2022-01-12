package bridge;

public class MorseCode {

    //델리게이트 위임한다.
    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot();
    }

    public void dash() {
        function.dash();
    }

    public void space() {
        function.space();
    }
}
