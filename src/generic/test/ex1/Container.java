package generic.test.ex1;

public class Container <T>{
    private T item;
    private Boolean isEmpty = true;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        isEmpty = false;
    }

    public Boolean isEmpty() {
        return isEmpty;
    }
}
