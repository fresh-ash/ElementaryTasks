package input;

public class ValidData<T> implements Validated<T>{

    private T obj;

    public ValidData(T obj){
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
}
