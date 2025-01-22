package generic.test.ex2;

public class Pair<T1, T2> {
    private T1 a;
    private T2 b;

    public T1 getFirst() {
        return a;
    }

    public void setFirst(T1 a) {
        this.a = a;
    }

    public T2 getSecond() {
        return b;
    }

    public void setSecond(T2 b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
