//Two pointer approach
import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={2,2,2,8,6,8,0};
        Arrays.sort(array);
        int i=0;
        for(int j=1;j<array.length;j++){
            if(array[i]!=array[j]){
                i++;
                array[i]=array[j];
            }
          }
          for(int k=0;k<=i;k++){
        System.out.println(array[k]+" ");
          }
        
    }
    
}