package org.owndevz.dsa.linkedlist;

public class SingleLinkedListDeleteOperation {

    /**
     * Delete Node from Front
     */
    Node head;
    void deleteFrontNode()
    {
        if(head==null)
            return;

        head=head.next;
    }

    /**
     * delete node from End
     */
    public void deleteNodeFromEnd()
    {
        if(head==null)
            return;

        Node node=head;
        Node prvNode=null;
        while (node.next!=null) {
            prvNode=node;
            node = node.next;
        }
        prvNode.next=null;

    }

    /**
     * Delete specific node based on input
     * @param keyData
     */
    public void deleteSpecificNode(int keyData)
    {
        if(head==null)
        {
            System.out.println("No node found.");
            return;
        }
        if(isHead(keyData))
        {
            deleteFrontNode();
            return;
        }
        if(isTail(keyData))
        {
            deleteNodeFromEnd();
            return;
        }

        Node current_node=head;
        Node prv_node=null;
        while (current_node.next!=null)
        {
            if(current_node.data==keyData)
            {
                prv_node.next=current_node.next;
                return;
            }
            prv_node=current_node;
            current_node=current_node.next;
        }

    }
    public boolean isHead(int dataKey){
        if(head==null)
            return false;
        if(head.data==dataKey)
            return true;
        return false;
    }
    public boolean isTail(int dataKey){
        if(head==null)
            return false;
        Node node=head;
        int count=0;
        while (node.next!=null) {
            node = node.next;
            count++;
        }
        return count>2 && dataKey== node.data;
    }
    /**
     * Insert operation for support delete operation logics
     * @param data
     */
    void insertAtFront(int data)
    {
        Node newNode=new Node();

        newNode.data=data;

        newNode.next =head;

        head=newNode;
    }

    /**
     * Printing node from head.
     */
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

        // Start with the empty list
        SingleLinkedListDeleteOperation list = new SingleLinkedListDeleteOperation();

        list.insertAtFront(6);
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);
        list.printList();

     //   list.deleteFrontNode();
     //   list.printList();

       // list.deleteNodeFromEnd();
      //  list.printList();

        list.deleteSpecificNode(6);
        list.printList();

    }
}
