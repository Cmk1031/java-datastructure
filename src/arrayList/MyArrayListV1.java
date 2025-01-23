package arrayList;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public void add(Object e) {
        elementData[size++] = e;

    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int indexOf(Object e) {
        for(int i=0; i<size; i++) {
            if(elementData[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public Object set(int index, Object e) {
        Object oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }



}
