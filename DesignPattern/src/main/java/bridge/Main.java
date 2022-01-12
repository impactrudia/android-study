package bridge;

public class Main {

    public static void main(String[] args) {
//        PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
        PrintMorseCode code = new PrintMorseCode(new SoundMCF());
        //code.g();code.a();code.r();code.a();code.m();
        // 위에 것보다 코드가 훨씬 더 깔끔해짐.
        code.g().a().r().a().m();
    }
}
