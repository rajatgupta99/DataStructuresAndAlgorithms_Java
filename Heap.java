import java.util.*;

class MinHeap{

  private int capacity=10;
  private int size=0;
  int[] heap=new int[capacity];
  
  //Get Left Child Index
  private int getLeftChildIndex(int parentIndex){
    return 2*parentIndex + 1;
  }
  
  //Get Right Child Index
  private int getRightChildIndex(int parentIndex){
    return 2*parentIndex + 2;
  }
  
  //Get Parent Index
  private int getParentIndex(int childIndex){
    return (childIndex-1)/2;
  }
  
  //Has Left Child
  private boolean hasLeftChild(int parentIndex){
    int index=getLeftChildIndex(parentIndex);
    boolean isLeftChild;
    if(index<=size){
      isLeftChild=true;
    }else{
      isLeftChild=false;
    }
    return isLeftChild;
  }
  
  //Has Right Child
  private boolean hasRightChild(int parentIndex){
    int index=getRightChildIndex(parentIndex);
    boolean isRightChild;
    if(index<=size){
      isRightChild=true;
    }else{
      isRightChild=false;
    }
    return isRightChild;
  }
  
  //Has Parent
  private boolean hasParent(int childIndex){
    int index=getParentIndex(childIndex);
    boolean isParent;
    if(index>=0){
      isParent=true;
    }else{
      isParent=false;
    }
    return isParent;
  }
  
  //Get Left Child Value
  private int getLeftChild(int parentIndex){
    return heap[getLeftChildIndex(parentIndex)];
  }
  
  //Get Right Child Index
  private int getRightChild(int parentIndex){
    return heap[getRightChildIndex(parentIndex)];
  }
  
  //Get Parent Index
  private int getParent(int childIndex){
      return heap[getParentIndex(childIndex)];
  }
  
  //Swap Index Values
  private void swap(int indexOne, int indexTwo){
    int temp=heap[indexOne];
    heap[indexOne]=heap[indexTwo];
    heap[indexTwo]=temp;
  }
  
  //Ensure Capacity
  private void ensureCapacity(){
    if(size==capacity){
      capacity*=2;
      heap=Arrays.copyOf(heap,capacity);
    }
  }
  
  public int peek(){
    if(size==0){
      throw new IllegalStateException();
    }else{
      return heap[0];
    }
  }
  
  public int poll(){
    int element;
    if(size==0){
      throw new IllegalStateException();
    }else{
      element=heap[0];
      heap[0]=heap[size-1];
      size--;
      heapifyDown();
    }
    return element;
  }
  
  public void add(int item){
    ensureCapacity();
    heap[size]=item;
    size++;
    heapifyUp();
  }
  
  public void heapifyUp(){
    int index=heap[size-1];
    while(hasParent(index) && getParent(index)>heap[index]){
        swap(getParentIndex(index),index);
        index=getParentIndex(index);
    }
  }
  
  public void heapifyDown(){
    int index = 0;
    while(hasLeftChild(index)){
        int smallerChildIndex=getLeftChildIndex(index);
        if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)){
            smallerChildIndex=getRightChildIndex(index);
        }
      
        if(heap[index] > heap[smallerChildIndex]){
          swap(index, smallerChildIndex);
        }else{
          break;
        }
      index=smallerChildIndex;
    }
  }

}

public class Solution{
  public static void main(String s[]){
  
  }
}
