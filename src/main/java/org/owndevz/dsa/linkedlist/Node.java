package org.owndevz.dsa.linkedlist;

public class Node {
     int data;
     Node next;

     Node prev;

     public Node(){}
     public Node(int data){this.data=data;}
     public Node(int data,Node next){this.data=data;this.next=next;}
     public Node(int data,Node next,Node prev){this.data=data;this.next=next;this.prev=prev;}
}
