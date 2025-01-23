package arrayList;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;
    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }
    public int size() {
        return size;
    }

    public void add(Object e) {
        if(size == elementData.length) {
            grow();
        }
        elementData[size++] = e;
    }

    //원하는 위치에 추가
    public void add(int index, Object e) {
        if(size==elementData.length) {
            grow();
        }
        for(int i=elementData.length-1; i>index; i++) {
            elementData[i] = elementData[i-1];
        }
        elementData[index] = e;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object remove(int index) {
        Object removed = get(index);


        return removed;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
                size + ", capacity=" + elementData.length;
    }
}
