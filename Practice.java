import java.util.*;
import java.io.*;
import java.lang.*;
class Insertion_2 {
    public static void main(String[] args){
        Node head=null;
        head=Inserend(head,10);
        head=Inserend(head,20);
        head=Inserend(head,30);
        printlist(head);

    }


    public static Node Inserend(Node head,int x){
        Node temp=new Node(x);
        if(head==null)  return temp;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;

    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}