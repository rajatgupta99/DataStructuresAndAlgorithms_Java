import java.util.*;

class Node{
  String data;
  Node next;
  
  public Node(String data){
    this.data=data;
  }
}

class Stack{
  Node top;
  
  public void push(String data){
    if(top==null){
      top=new Node(data);
      top.next=null;
    }else{
        Node temp=new Node(data);
        temp.next=top;
        top=temp;
      }
  }
  
  public void peek(){
    if(top==null){
      System.out.println("Stack is empty!");
    }else{
      System.out.println(top.data);
    }
  }
  
  public boolean contains(String data){
    boolean isAvailable=false;
    if(top!=null){
      if(top.data==data){
        isAvailable=true;
      }else{
        Node temp=top;
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
    return isAvailable;
  }
  
  public void printStack(){
    if(top==null){
      System.out.println("Stack is empty!");
    }else{
      Node temp=top;
      while(temp!=null){
        System.out.print(temp.data);
        if(temp.next!=null){
          System.out.print("->");
          temp=temp.next;
        }else{
          temp=null;
        }
      }
    }
  }
  
  public String pop(){
    String popValue=null;
    if(top!=null){
      popValue=top.data;
      top=top.next;
    }
    return popValue;
  }
  
}

public class Solution{
  public static void main(String s[]){
    Stack st1=new Stack();
    
    st1.push("Rajat");
    st1.push("Gupta");
    st1.push("Software");
    st1.push("Engineer");
    
    st1.peek();
    
    System.out.println("
");
    st1.printStack();
    
    System.out.println("
");
    System.out.println(st1.contains("Engineer"));
    
    System.out.println("
");
    System.out.println(st1.pop());
    
    System.out.println("
");
    st1.printStack();
  }
}
