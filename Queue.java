import java.util.*;

class Node{
  String data;
  Node previous;
  
  public Node(String data){
    this.data=data;
  }
}

class Queue{
  Node first,last;
  
  public void enqueue(String data){
    if(first==null){
      first=new Node(data);
      last=first;
    }else{
      Node temp=new Node(data);
      first.previous=temp;
      first=temp;
    }
  }
  
  public void printQueue(){
    if(last==null){
      System.out.println("Queue is empty!");
    }else{
      Node temp=last;
      while(temp!=null){
        System.out.print(temp.data);
        if(temp.previous!=null){
          System.out.print("<-");
          temp=temp.previous;
        }else{
          temp=null;
        }
      }
    }
  }
  
  public boolean contains(String data){
    boolean isAvailable;
    if(last==null){
      isAvailable=false;
    }else{
      if(last.data==data){
        isAvailable=true;
      }else if(first.data==data){
        isAvailable=true;
      }else{
        Node temp=last;
        while(temp!=null && temp.data!=data){
          if(temp.previous!=null){
            temp=temp.previous;
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
    return isAvailable;
  }
  
  public String dequeue(){
    String toDequeue=null;
    if(last==null){
      toDequeue=null;
    }else{
      toDequeue=last.data;
      last=last.previous;
    }
    
    return toDequeue;
  }
}


class Solution{
  public static void main(String s[]){
    Queue q1=new Queue();
    q1.enqueue("Rajat");
    q1.enqueue("Gupta");
    q1.enqueue("Software");
    q1.enqueue("Engineer");
    
    q1.printQueue();
    
    System.out.println("\n");
    System.out.println(q1.contains("Engineer"));
    
    System.out.println("\n");
    System.out.println(q1.dequeue());
    
    System.out.println("\n");
    System.out.println(q1.dequeue());
    
    System.out.println("\n");
    q1.printQueue();
  }
}
