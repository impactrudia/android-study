package prototype;

public class Cat implements Cloneable {

    private String name;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    protected Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat) this.clone();
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));// 기본타입은 깊은복사가 되는데 참조형타입은 직접 선언해줘야 깊은 복사 가능
        return ret;
    }
}
