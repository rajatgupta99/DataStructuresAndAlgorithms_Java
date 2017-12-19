import java.io.*;
import java.util.*;


class Node{
  Node left, right;
  int data;
  
  public Node(int data){
    this.data=data;
  }
  
  public void insert(int toInsert){
      if(toInsert <= data){
        if(left==null){
          left=new Node(toInsert);
        }else{
          left.insert(toInsert);
        }
      }else{
        if(right==null){
          right=new Node(toInsert);
        }else{
          right.insert(toInsert);
        }
      }
  }
  
  public boolean contains(int toSearch){
    if(data==toSearch){
      return true;
    }else if(toSearch < data){
      if(left==null){
        return false;
      }else{
        return left.contains(toSearch);
      }
    }else{
      if(right==null){
        return false;
      }else{
        return right.contains(toSearch);
      }
    }
  }

  public void printInOrder(){
    if(left!=null){
      left.printInOrder();
    }
    System.out.println(data);
    if(right!=null){
      right.printInOrder();
    }
  }
}

class BinarySearchTree {
  public static void main(String[] args) {
    Node n1=new Node(100);
    
    Random r1=new Random();
    
    for(int i=0;i<10;i++){
      int randNumber=r1.nextInt(340302) + 1;
      n1.insert(randNumber);
    }
    
    System.out.println(n1.contains(2));
    
    n1.printInOrder();
  }
}
