import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.createSingleLinkedList(5);
        // System.out.println(sLL.getHead().getValue());

        sLL.insertLinkedList(6, 1);
        sLL.insertLinkedList(7, 3);
        sLL.insertLinkedList(8, 4);
        sLL.insertLinkedList(9, 0);
        sLL.traverseSinglyLinkedList();
        sLL.deletionOfOneNode(6);
        sLL.traverseSinglyLinkedList();

    }
}
