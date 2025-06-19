public class LinkedList { // 聚合关系 Has-A

    private Node head;

    LinkedList() {
        this.head = null;
    }

    void add(Object data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    boolean remove(Object data) {
        Node temp = head;
        if (head == null) {
            return false;
        }
        if (head.getData().equals(data)) { // getData返回Object实例，equals调用的也是该实例的实际类型(PetImpl)的equals方法
            head = head.getNext();
            return true;
        }
        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(data)) {
                temp.setNext(temp.getNext().getNext());
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }

    Node search(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    boolean insertAfter(Node previous, Object data) {
        if (previous == null) {
            return false;
        }
        Node node = new Node(data);
        node.setNext(previous.getNext());
        previous.setNext(node);
        return true;
    }

    Node get(int index) {
        Node temp = head;
        if (index < 0) return null;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.getNext();
        }
        return temp;
    }

    boolean set(Node node, Object data) {
        if (node == null) {
            return false;
        }
        node.setData(data);
        return true;
    }

    int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        return size;
    }
}