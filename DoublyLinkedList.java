import java.util.*;

class Node{
  String data;
  Node next, previous;
  
  public Node(String data){
    this.data=data;
  }
}


class DoublyLinkedList{
  Node head, tail;
  
  public void insert(String data){
    if(head==null){
      head=new Node(data);
    }else{
      if(tail==null){
        tail=new Node(data);
        head.next=tail;
        tail.previous=head;
      }else{
        Node temp=new Node(data);
        tail.next=temp;
        temp.previous=tail;
        tail=temp;
      }
    }
  }
  
  public void printList(){
    if(head==null){
      System.out.println("List is empty!");
    }else{
      Node temp=head;
      while(temp!=null){
        System.out.println(temp.data);
        if(temp.next!=null){
          temp=temp.next;
        }else{
          temp=null;
        }
      }
    }
  }
  
  public void printListReverse(){
    if(tail==null){
      if(head==null){
        System.out.println("List is empty!");
      }else{
        System.out.println(head.data);
      }
    }else{
      Node temp=tail;
      while(temp!=null){
        System.out.println(temp.data);
        if(temp.previous!=null){
          temp=temp.previous;
        }else{
          temp=null;
        }
      }
    }
  }
  
  public void prepend(String data){
    if(head==null){
      System.out.println("List is empty!");
    }else{
      Node temp=new Node(data);
      head.previous=temp;
      temp.next=head;
      head=temp;
    }
  }
  
  public void remove(String data){
    if(head==null){
      System.out.println("List is empty!");
    }else{
      if(head.data==data){
        head.next.previous=null;
        head=head.next;
      }else{
        if(tail.data==data){
         Node temp=tail.previous;
          temp.next=null;
          tail=temp;
        }else{
          Node temp=head;
          
          while(temp!=null && temp.next.data!=data){
            if(temp.next!=null){
              temp=temp.next;
            }else{
              temp=null;
            }
          }
          
          if(temp!=null && temp.next.data==data && temp.next!=tail){
            temp.next=temp.next.next;
            temp.next.previous=temp;
          }
          if(temp!=null && temp.next.data==data && temp.next==tail){
            temp.next=null;
            tail=temp;
          }
        }
      }
    }
  }
  
  public boolean contains(String data){
    boolean isAvailable;
    if(head==null){
      isAvailable=false;
    }else{
      if(head.data==data){
        isAvailable=true;
      }else{
        if(tail.data==data){
          isAvailable=true;
        }else{
          Node temp=head;
          while(temp!=null && temp.data!=data){
            if(temp.next!=null){
              temp=temp.next;
            }else{
              temp=null;
            }
          }
          
          if(temp!=null && temp.data==data){
            isAvailable=true;
          }else{
            isAvailable=false;
          }
        }
      }
    
    }
    
    return isAvailable;
  }
  
}


public class Solution{

  public static void main(String s[]){
    DoublyLinkedList db1=new DoublyLinkedList();
    db1.insert("Rajat");
    db1.insert("Gupta");
    db1.insert("Software");
    db1.insert("Engineer");
    
    db1.printList();
    
    System.out.println("
");
    db1.printListReverse();
    
    db1.prepend("Mr");
    
    System.out.println("
");
    db1.printList();
    
    db1.remove("Software");
    db1.remove("Mr");
    
    System.out.println("
");
    db1.printList();
    
    System.out.println("
");
    System.out.println(db1.contains("Engineer"));
    
  }
}
