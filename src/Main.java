import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.createSingleLinkedList(5);
        System.out.println(sLL.getHead().getValue());

        sLL.insertLinkedList(6,1);
        sLL.insertLinkedList(6,3);
        System.out.println(sLL.getHead().getNext().getNext().getValue());
        System.out.println(sLL.getSize());


    }
}
