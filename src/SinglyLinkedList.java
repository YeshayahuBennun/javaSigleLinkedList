public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();//--------------------------------------------------------- O(1)
        Node node = new Node();//---------------------------------------------------- O(1)
        node.setNext(null);//-------------------------------------------------------- O(1)
        node.setValue(nodeValue);//-------------------------------------------------- O(1)
        head = node;//--------------------------------------------------------------- O(1)
        tail = node;//--------------------------------------------------------------- O(1)
        size = 1;

        return head;
    }
}
