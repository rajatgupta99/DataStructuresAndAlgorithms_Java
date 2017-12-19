import java.io.*;
import java.util.*;


class MergeSorting{
  
  public int[] mergeSort(int toSort[]){
      return mergeSort(toSort, new int[toSort.length], 0, toSort.length -1);
      //printArray(toSort);
  }
  
  public int[] mergeSort(int[] toSort,int[] temp, int leftStart, int rightEnd){
      if(leftStart >= rightEnd){
        return toSort;
      }
      
      int middle=(rightEnd+leftStart)/2;
      mergeSort(toSort, temp, leftStart, middle);
      mergeSort(toSort, temp, middle+1, rightEnd);
      mergeHalves(toSort, temp, leftStart, rightEnd);
    return toSort;
  }
  
  public void mergeHalves(int[] toSort, int[] temp, int leftStart, int rightEnd){
      
      int leftEnd=(rightEnd + leftStart)/2;
      int rightStart=leftEnd + 1;
      int size=rightEnd - leftStart +1;
    
      int left=leftStart;
      int right=rightStart;
      int index=leftStart;
    
      while(left <= leftEnd && right <= rightEnd){
          if(toSort[left] < toSort[right]){
            temp[index]=toSort[left];
            left++;
          }
          else{
            temp[index]=toSort[right];
            right++;
          }
        index++;
      }
    
    System.arraycopy(toSort,left,temp,index, leftEnd - left +1);
    System.arraycopy(toSort,right,temp,index, rightEnd - right +1);
    System.arraycopy(temp,leftStart,toSort,leftStart,size);
  
  }
  
  public void printArray(int[] sorted){
      
    for(int i=0;i<sorted.length;i++){
      System.out.println(sorted[i]);
    }
  }

}

class MergeSort {
  public static void main(String[] args) {
    MergeSorting m1=new MergeSorting();
    int[] sort={1,2,324,6,12,3,8,3,6,13,354,51,9,0,7};
    int[] sorted= m1.mergeSort(sort);
    m1.printArray(sorted);
    
  }
}
