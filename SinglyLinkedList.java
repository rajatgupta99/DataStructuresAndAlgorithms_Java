import java.util.*;
import java.io.*;

class Node{
  String data;
  Node next=null;
  
  public Node(String data){
    this.data=data;
  }
}

class LinkedList{
  Node head, tail;
  
  public void insert(String data){
    if(head==null){
      head=new Node(data);
    }else{
      if(head.next==null && tail==null){
          tail=new Node(data);
          head.next=tail;
      }else{
        Node temp=new Node(data);
        tail.next=temp;
        tail=temp;
        
      }
    }
  }
  
  public void printList(){
    Node node=head;
    while(node!=null){
      System.out.println(node.data);
      node=node.next;
    }
  }
  
  public void append(String data){
    if(head!=null){
      Node temp=new Node(data);
      temp.next=head;
      head=temp;
    }else{
      head=new Node(data);
    }
  }
  
  public void prepend(String data){
    if(head!=null){
      if(tail!=null){
        Node temp=new Node(data);
        tail.next=temp;
        tail=temp;
      }else{
        tail=new Node(data);
      }
    }else{
      head=new Node(data);
    }
  }
  
  public void delete(String data){
      if(head==null){
        return;
      }else{
        Node node=head;
        
        if(head.data==data){
          head=head.next;
        }else{
          while(node.next.data!=data){
            node=node.next;
          }
          
          node.next=node.next.next;
          
          if(tail.data==data){
            tail=null;
          }
        }
      }
  }
}

public class Solution{

  public static void main(String s[]){
      LinkedList l1=new LinkedList();
      l1.insert("Rajat");
      l1.insert("Gupta");
      l1.insert("Append 1");
      l1.insert("Append 2");
      l1.append("Append 3");
      l1.append("Append 4");
      l1.prepend("Prepend 1");
      l1.prepend("Prepend 2");
    
      l1.delete("Rajat");
      l1.delete("Prepend 2");
      l1.prepend("Prepend 3");
      l1.printList();
  }
}
