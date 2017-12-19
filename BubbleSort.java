class BubbleSort{

  public int[] sortBubble(int[] myList){
      for(int i=0;i<myList.length-1;i++){
        for(int j=0;j<myList.length-1;j++){
          if(myList[j]>myList[j+1]){
            int temp=myList[j];
            myList[j]=myList[j+1];
            myList[j+1]=temp;
          }
        }
      }
    return myList;
  }
}

public class Solution{

  public static void main(String s[]){
    BubbleSort bs1=new BubbleSort();
    int[] myArray={1,2,1,3,41,12,3,6,3,13,6,5,13,4,63,123,121,2,0,2,1,64,9};
    bs1.sortBubble(myArray);
    
    for(int i=0;i<myArray.length;i++){
      System.out.println(myArray[i]);
    }
  }
}
