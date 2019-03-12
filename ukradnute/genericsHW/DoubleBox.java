package genericsHW;

public class DoubleBox<T,P> {
    T obj;
    P obj2;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public P getObj2() {
        return obj2;
    }

    public void setObj2(P obj2) {
        this.obj2 = obj2;
    }
}
