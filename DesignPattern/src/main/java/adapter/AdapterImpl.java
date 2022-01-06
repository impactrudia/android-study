package adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        //Adapter.class, Main.class 건들이지 않고 구현 가능.
        //return (float) Math.twoTime(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("절반 함수 시작");
        return (float) Math.half(f.doubleValue());
    }
}
