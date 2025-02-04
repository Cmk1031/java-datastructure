package list;

public class BatchProcessor {
    /*private final MyArrayList<Integer> list = new MyArrayList<>();

    public void logic(int size) {
        for(int i=0; i<size; i++) {
            list.add(0,i);
        }
    }*/

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        for(int i=0; i<size; i++) {
            list.add(0,i);
        }
    }
}
