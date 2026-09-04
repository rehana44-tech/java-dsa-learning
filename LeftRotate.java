import java.util.*;
class LeftRotate{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int array[]={1,2,3,4,5}; 
        int n=array.length;
       int first=array[0];
        for(int i=1;i<n;i++){
            array[i-1]=array[i];
           
        }
        array[n-1]=first;
        System.out.println(Arrays.toString(array));
    }
}