import java.util.*;
class TripletSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={-1,-1,0,1,2,4};
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            if(i>0&&a[i]==a[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=a[i]+a[left]+a[right];
                if(sum==0){
                    System.out.println(a[i]+" "+a[left]+" "+a[right]);
                    left++;
                    right--;
                while(left<right&&a[left]==a[left+1]){
                    left++;
                }
                while(left<right&&a[right]==a[right-1]){
                    right--;

            }
        }
            else if(sum<0){
                left++;


            }
            else{
                right--;
            }
        }
    }
}
} 
