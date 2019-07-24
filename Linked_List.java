import java.io.*;
import java.util.*;

class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int a){
            data=a;
            next=null;
        }
    }
    
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        if(head==null)
        {   head=new_node;
            return;  }
        new_node.next=head;
        head=new_node;
    }
    public void insertmid(int new_data,Node prev)
    {
        Node new_node=new Node(new_data);
        new_node.next=prev.next;
        prev.next=new_node;
    }
    public void append(int new_data)
    {
        Node last=new Node(new_data);
        if(head==null)
        {
           head=last;
           return;
        }
        Node t=head;
        while(t.next!=null)
        {   t=t.next; }
        t.next=last;
    }
    public void print()
    {
        Node temp=head;
        if(head==null)
        {   return;  }
        while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;  }
        
    }
    public static void main (String[] args) {
        LinkedList l=new LinkedList();
        l.append(2);
        l.append(23);
        l.append(21);
        l.push(56);
        l.print();
    }
    
}
