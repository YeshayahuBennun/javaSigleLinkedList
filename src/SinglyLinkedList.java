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
                System.out.print(actual.getValue());//--------------------------------------------------- O(N)
                if (i != size - 1) {
                    System.out.print("->");//------------------------------------------------------------ O(1)
                }
                actual = actual.getNext();//------------------------------------------------------------- O(1)
            }
        }
        System.out.println("\n");//---------------------------------------------------------------------- O(1)
    }

    //Searching in Singly Linked List
    public boolean searchNode(int nodeValue) {
        if (head != null) {//-------------------------------------------------------------------------------- O(1)
            Node tempNode = head;//-------------------------------------------------------------------------- O(1)
            for (int i = 0; i < size; i++) {//--------------------------------------------------------------- O(N)
                if (tempNode.getValue() == nodeValue) {//---------------------------------------------------- O(1)
                    System.out.println("Found the node at location:" + i + "\n");//-------------------------- O(1)
                    return true;//--------------------------------------------------------------------------- O(1)
                }
                tempNode = tempNode.getNext();//------------------------------------------------------------- O(1)
            }
        }
        System.out.println("Node not found!");//------------------------------------------------------------- O(1)
        return false;//-------------------------------------------------------------------------------------- O(1)
    }

    //Deleting a node from SinglyLinkedList
    public void deletionOfOneNode(int location) {
        //Check if the linked list exists or not
        if (head == null) {
            System.out.println("The single linked list does not exist");
            return;//Return - Because we don't want to continue the further.
            //Then the first condition is we want to delete a node, which is the first node in single linked list.

        } else if (location == 0) {//So we want to delete the first node from single linked list.

            //Then we have two cases:
            // 1 - more than one node;
            head = head.getNext();
            //Then after doing so, we have to decrease the size.
            size--;
            // 2 - only one element
            if (size == 0) {
                //So if we had only one element in our singly Linked List tail references to null
                tail = null;
                //Now than we are going to continue to the next case
            }
        } else if (location >= size) {//Delete one node from the end of the singly linked list.

            //We have to find a node which is located before the last node then we are going to set the next
            //of this node to null, and we are going to change tail to reference this node over here.
            //Now also we have two cases: one and more the one node
            //Before we have to find the node which is located before the last one:
            Node tempNode = head;
            for (int i = 0; i < this.size - 1; i++) {//Size -1 because we need to find a node which is located before lest node
                tempNode = tempNode.getNext();
            }
            // 1 - only one node
            if (tempNode == head) {
                head = null;
                tail = null;
                size--;
                return;//Because we don't need to continue.
            }
            // 2 - more than one node

            //In this case the next reference of the tempNode has to reference to null, because in this case,
            //after deleting the last node the node that is located before last node is going to be last node.
            tempNode.setNext(null);
            //We are going to set tai to reference this node because it is the last node now.
            tail = tempNode;
            size--;

        } else {//Delete a node from a given location
            //We need to find the node which is located before this node and change the reference of this node to the
            //next node which is located after the node that we want to delete.
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            //So after finding the node which is located before the node that we want to delete
            //In that case tempNode's next reference points to the node that we want to delete.
            //So we are going to change the next reference to the node that is located after the node which we want
            //to delete.
            tempNode.setNext(tempNode.getNext().getNext());
            size--;
        }
    }

    //Delete Entire SinglyLinkedList
    public void deleteAll() {
        head = null;//----------------------------------------------------------------------------------------O(1)
        tail = null;//----------------------------------------------------------------------------------------O(1)
        System.out.println("Empty");//------------------------------------------------------------------------O(1)
    }

}
