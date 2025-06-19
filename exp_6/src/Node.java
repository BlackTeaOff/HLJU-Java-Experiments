public class Node { // 不需要访问外部类的实例成员--static
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
    }

    void setData(Object data) {
        this.data = data;
    }
    Object getData() {
        return this.data;
    }

    void setNext(Node next) {
        this.next = next;
    }
    Node getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}