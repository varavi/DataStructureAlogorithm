package org.owndevz.dsa.linkedlist;

public class DoublyLinkedListInsertOperation {

    Node head;

    public void insertFromFront(int data)
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
    public void insertAtEnd(int data)
    {
        Node new_node=new Node(data);

        if(head==null){
            head=new_node;
            return;
        }

        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        new_node.prev=temp;
        temp.next=new_node;
    }

    public void insertAtAfterPosition(int data, int position)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=new_node;
            return;
        }

        Node temp=head;
        int count=0;
        while (temp.next!=null)
        {
            if(position==count)
            {
                new_node.next=temp.next;
                new_node.prev=temp;
                temp.next=new_node;
            }
            count++;
            temp=temp.next;
        }
        if(position>=count)
        {
            System.out.print("Position not found...");
        }

    }
    public void insertAfterNode(int data, int dataKey)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            System.out.print("No data key found.."+dataKey);
            return;
        }

        Node temp=head;
        boolean flag=false;
        while (temp.next!=null)
        {
            if(temp.data==dataKey)
            {
                new_node.next=temp.next;
                new_node.prev=temp;
                temp.next=new_node;
                flag=true;
            }
            temp=temp.next;
        }
        if(temp.next==null && temp.data==dataKey)
        {
            new_node.prev=temp;
            temp.next=new_node;
            flag=true;
        }
        if(!flag)
            System.out.print("Key Data not found in list ...");

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

    public void insertBeforeNode(int data, Node next_node)
    {
        if(next_node!=null)
            System.out.println("Node is null");

        Node new_node=new Node(data);

        new_node.next=next_node;
        new_node.prev=next_node.prev;

        next_node.prev.next=new_node;
        next_node.prev=new_node;

    }
    public static void main(String[] args) {

        DoublyLinkedListInsertOperation dlist=new DoublyLinkedListInsertOperation();
        dlist.insertFromFront(5);
        dlist.insertFromFront(4);
        dlist.insertFromFront(3);
        dlist.insertFromFront(2);
        dlist.insertFromFront(1);
        dlist.printList();

        //insert from end
        dlist.insertAtEnd(6);
        dlist.insertAtEnd(7);
        dlist.printList();

        // insert at given position
        dlist.insertAtAfterPosition(8,3);
        dlist.printList();

        dlist.insertAfterNode(8,2);
        dlist.printList();

       // dlist.insertBeforeNode(10,8);
    }
}
