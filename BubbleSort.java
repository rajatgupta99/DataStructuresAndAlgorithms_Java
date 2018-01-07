class BubbleSort{
  
  public void sort(int[] list){
    
      for(int i=0;i<list.length;i++){
        for(int j=0;j<list.length-1;j++){
          if(list[j]>list[j+1]){
            int temp=list[j];
            list[j]=list[j+1];
            list[j+1]=temp;
          }
        }
      }
  }
  
  public void printList(int[] list){
    for(int i=0;i<list.length;i++){
      System.out.println(list[i]);
    }
  }
}

class Solution{
  
  public static void main(String s[]){
    int[] myList={1,2,23,12,13,43,7,13,254,214,453,2342,11,313,54,896,587,964,12};
    BubbleSort bb1=new BubbleSort();
    
    bb1.sort(myList);
    bb1.printList(myList);
  }
}
