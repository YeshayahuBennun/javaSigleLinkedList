import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.createSingleLinkedList(5);
        System.out.println(sLL.getHead().getValue());


    }
}
