import java.util.*;
class dotchNational{
    public static void swap(int array[],int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void main(String[] args) {
        int array[]={0,2,1,0,2,2,1};
            int low=0;
            int mid=0; 
            int high=array.length-1;
            while(mid<=high){
                if(array[mid]==0){
                    swap(array,low,mid);
                    low++;
                    mid++;
                }
                else if(array[mid]==1){
                    mid++;
                }
                else{
                    swap(array,mid,high);
                    high--;
                }
            }
        System.out.println(Arrays.toString(array));   
}
}