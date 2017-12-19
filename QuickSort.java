import java.io.*;
import java.util.*;


class QuickSorting{
  
  public void quickSort(int[] toSort){
    quickSort(toSort, 0, toSort.length -1);
  }
  
  public void quickSort(int[] toSort, int left, int right){
    if(left >= right){
      return;
    }
    
    int pivot = toSort[(right + left)/2];
    int index = partition(toSort, left, right , pivot);
    quickSort(toSort, left, index-1);
    quickSort(toSort, index, right);
    
  }
  
  public int partition(int[] toSort, int left, int right, int pivot){
    while(left <= right){
      while(toSort[left] < pivot){
        left++;
      }
      
      while(toSort[right] > pivot){
        right --;
      }
      
      if(left <= right){
        //Swapping
        int tempValue=toSort[left];
        toSort[left]=toSort[right];
        toSort[right]=tempValue;
        left++;
        right--;
      }
    }
    return left;
  }
  
  public void toPrint(int[] temp){
    for(int i=0;i<temp.length;i++){
      System.out.println(temp[i]);
    }
  }
  
}

class QuickSort {
  public static void main(String[] args) {
    QuickSorting qs1=new QuickSorting();
    int[] toSort={1,2,324,6,12,3,8,3,6,13,354,51,9,0,7};
    qs1.quickSort(toSort);
    qs1.toPrint(toSort);
  }
}
