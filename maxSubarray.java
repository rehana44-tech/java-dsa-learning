class maxSubarray {
    public static void main(String[] args) {
        int a[]={2,1,5,1,3,2};
        int k=3;
        int low=0;
        int sum=0;
        int high=k-1;
        int maxSum=0;
        for(int i=low;i<=high;i++){
            sum=sum+a[i];

        }
         maxSum=sum;
        while(high<a.length-1){   
             sum-=a[low];
             low++;
             high++;
             sum+=a[high];
             
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);

    }
}