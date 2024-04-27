package org.owndevz.dsa.linkedlist;

public class SingleLinkedListInsertOperation {
    public Node head;

     void insertAtFront(int data)
    {
        Node newNode=new Node();

        newNode.data=data;

        newNode.next =head;

        head=newNode;
    }
    void insertAtAnyLocation(int data,int keyData)
    {
        Node new_node=new Node();
        new_node.data=data;

        Node foundNode= findNextNode(keyData);

        new_node.next=foundNode.next;
        foundNode.next=new_node;
    }

    public void insertAtEnd(int data)
    {
        Node new_node=new Node();
        new_node.data=data;

        if(head==null) {
            System.out.println("linked List is empty - adding first node");
            head=new_node;
            return;
        }
        Node node=head;
        while (node.next!=null)
        {
            node=node.next;
        }

        node.next=new_node;
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




    private Node findNextNode(int keyData) {
        if(head==null)
            return null;

        Node node=head;
        while (node!=null)
        {
            if(node.data==keyData)
                return node;
            node=node.next;
        }
        return null;
    }


    public static void main(String[] args) {
        // Start with the empty list
        SingleLinkedListInsertOperation list = new SingleLinkedListInsertOperation();

        list.insertAtFront(6);
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);
        list.printList();

        list.insertAtAnyLocation(8,4);
        list.printList();

        list.insertAtEnd(10);
        list.printList();

    }


}

