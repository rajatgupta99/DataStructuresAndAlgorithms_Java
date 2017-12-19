class SelectionSort{

  public int[] sortSelection(int[] myList){
      for(int i=0;i<myList.length;i++){
        int min=myList[i];
        for(int j=i+1;j<myList.length;j++){
          if(myList[j]<min){
            int temp=myList[i];
            min=myList[j];
            myList[i]=myList[j];
            myList[j]=temp;
          }
        }
      }
    return myList;
  }
}

public class Solution{

  public static void main(String s[]){
    SelectionSort s1=new SelectionSort();
    int[] myArray={1,2,1,3,41,12,3,6,3,13,6,5,13,4,63,123,121,2,0,2,1,64,9};
    s1.sortSelection(myArray);
    
    for(int i=0;i<myArray.length;i++){
      System.out.println(myArray[i]);
    }
  }
}
