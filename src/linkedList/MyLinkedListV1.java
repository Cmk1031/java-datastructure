package linkedList;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;


    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next =newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while(x.next!=null) {
            x = x.next;
        }
        return x;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        Node x = first;
        int cnt = 0;
        while(x.item!=e) {
            x = x.next;
            cnt++;
        }
        return cnt;
    }

    public Object set(int index, Object e) {
        Node node = getNode(index);
        Object oldValue = node.item;
        node.item = e;
        return oldValue;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }


}
