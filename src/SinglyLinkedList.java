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

    //Insert Method SinglyLinkedList
    public void insertLinkedList(int nodeValue, int location) {
        //Create a node that receives the nodeValue
        Node newNode = new Node();
        //Inserting the new value in the new node.
        newNode.setValue(nodeValue);
        if (this.head == null) {//Now we are going to check if the linked list is created or not.
            createSingleLinkedList(nodeValue);
            return;
            //If our single linked list is already created, them we are going to check location
            //parameters.
        } else if (location == 0) {//We are inserting at the beginning of the singly linked list
            newNode.setNext(head);//the previous head now is the next of our new node.
            head = newNode;//now we are creating a new reference for our new node as a head.

        } else if (location >= size) {//If the parameter location is grater than the size then we have to insert in the end
            newNode.setNext(null);//Set the next of our new node to null because it will be the last node
            tail.setNext(newNode);//The previous tail receives our new node as you next
            tail = newNode;// Now we are creating a new reference for our new node as a tail.
        } else {//Now we're going to start loop from the head
            Node actualNode = head;
            int index = 0;
            while (index < location - 1) {//------------------------------------------------------------- O(N)
                actualNode = actualNode.getNext();//In the end of the loop we'll have the actual position
                index++;
            }
            Node nextNode = actualNode.getNext();//now we are store the actual next to a temporary node called nextNode
            actualNode.setNext(newNode);//Here we are store our newNode into the actual node position
            newNode.setNext(nextNode);// And now we are store the actual previous next to our new node's next.
        }
        size++;
    }

    //SinglyLinked List Traversal
    public void traverseSinglyLinkedList() {
        if (head == null) {//---------------------------------------------------------------------------- O(1)
            System.out.println("sLL does not exist");//-------------------------------------------------- O(1)
        } else {
            Node actual = head;//------------------------------------------------------------------------ O(1)
            for (int i = 0; i < size; i++) {
                System.out.println(actual.getValue());//------------------------------------------------- O(N)
                if(i!=size-1){
                    System.out.println("->");//---------------------------------------------------------- O(1)
                }
                actual =actual.getNext();//-------------------------------------------------------------- O(1)
            }
        }
        System.out.println("\n");//---------------------------------------------------------------------- O(1)
    }
}
