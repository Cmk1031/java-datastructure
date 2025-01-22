package linkedList;
/*
- 노드는 내부에 데이터와 다음 노드에 대한 참조를 가지고 있다.
- 해당 구조는 각각의 노드가 참조를 통해 연결되어 있다.
- 데이터를 추가할 때 동적으로 필요한 만큼의 노드만 만들어서 연결하면 된다.
- 따라서 배열과 다르게 메모리를 낭비하지 않는다.
 */
public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }
    //IDE 생성 toString()
    /*@Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while(x!=null) {
            sb.append(x.item);
            if(x.next!=null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
