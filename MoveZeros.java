import java.util.*;
class MoveZeros{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int array[]={1,0,2,3,2,0,0,4,5,1};
    int n=array.length;
    int temp[]=new int[n];
    int j=0;
    for(int i=0;i<n;i++){
        if(array[i]!=0){
            temp[j]=array[i];
            j++;
        }
    }
    for(int i=0;i<temp.length;i++){
        array[i]=temp[i];

    }
    for(int i=j;i<n;i++){
        array[i]=0;
    }
    System.out.println(Arrays.toString(array));
    
    }

    
}
//optimal solution 
class OptimalMove{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int array[]={1,0,2,3,2,0,0,4,5,1};
    int n=array.length;
    int j=-1;
    for(int i=0;i<n;i++){
        if(array[i]==0){
            j=i;
            break;
        }
    }
    for(int i=j+1;i<n;i++){
        if(array[i]!=0){
        swap(array,j,i);
        j++;
        }
    }
    System.out.println(Arrays.toString(array));
    
    }
    //swap function 
    public static void swap(int[] array, int j, int i) {
    int temp = array[j];
    array[j] = array[i];
    array[i] = temp;
}
}

