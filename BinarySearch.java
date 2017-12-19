import java.io.*;
import java.util.*;


class BinarySearching{

  public boolean searchArray(int[] toSearch, int searchValue){
    return searchArray(toSearch, searchValue, 0, toSearch.length -1);
  }
  
  public boolean searchArray(int[] toSearch, int searchValue, int left, int right){
      if(left>right){
        return false;
      }
        
        int mid=left + ((right -left) / 2);
        if(searchValue==toSearch[mid]){
          return true;
        }else{
          if(searchValue<toSearch[mid]){
            return searchArray(toSearch,searchValue,left,mid-1);
          }else{
            return searchArray(toSearch,searchValue, mid + 1, right);
          } 
        }
  }

}

class BinarySearch {
  public static void main(String[] args) {
	BinarySearching bs1=new BinarySearching();
    int[] myArray={1,2,3,4,5,6,7,8,9,10,11,12,13,15};
    System.out.println(bs1.searchArray(myArray,10));
  }
}
