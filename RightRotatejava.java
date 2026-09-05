import java.util.*;
class RightRotate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={1,2,3,4,5,6,7};
        int n=7;
        int d=2;
        d=d%n;
        int last[]=new int[d];
        for(int i=0;i<d;i++){
            last[i]=array[n-d+i];
        }
        for(int i=n-d-1;i>=0;i--){
            array[i+d]=array[i];
        }
        for(int i=0;i<d;i++){
            array[i]=last[i];

        }
        System.out.println(Arrays.toString(array));
    }
}