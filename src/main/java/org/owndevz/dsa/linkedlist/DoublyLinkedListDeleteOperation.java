package org.owndevz.dsa.linkedlist;

public class DoublyLinkedListDeleteOperation {

    Node head;

    public void deleteFirstNode()
    {
        if(head==null)
        {
            System.out.println("List is empty...");
            return;
        }


        head=head.next;
    }
    public void deleteLastNode()
    {
        if(head==null)
        {
            System.out.println("List is empty...");
            return;
        }

        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp=temp.prev;
        if(temp!=null)
        temp.next=null;

    }
    private void insertFromFront(int data)
    {
        // 1. allocate node
        // 2. put in the data */
        Node new_node=new Node(data);

        // 3. Make next of new node as head and previous as NULL
        new_node.next=head;
        new_node.prev=null;

        // 4. change prev of head node to new node
        if(head!=null)
            head.prev=new_node;

        // 5. move the head to point to the new node
        head=new_node;

    }
    void printList()
    {
        Node node=head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedListDeleteOperation dlist=new DoublyLinkedListDeleteOperation();
     /*   dlist.insertFromFront(5);
        dlist.insertFromFront(4);
        dlist.insertFromFront(3);
        dlist.insertFromFront(2);*/
        dlist.insertFromFront(1);
        dlist.printList();

      //  dlist.deleteFirstNode();
        dlist.printList();

        dlist.deleteLastNode();
        dlist.printList();
    }
}
