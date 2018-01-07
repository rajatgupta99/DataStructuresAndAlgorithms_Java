class SelectionSort{
    
  public void sort(int[] list){
      for(int i=0;i<list.length-1;i++){
        for(int j=i+1;j<list.length;j++){
          if(list[i]>list[j]){
            int temp=list[i];
            list[i]=list[j];
            list[j]=temp;
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
    SelectionSort ss1=new SelectionSort();
    ss1.sort(myList);
    ss1.printList(myList);
  }
}
