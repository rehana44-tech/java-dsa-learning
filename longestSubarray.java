class longestSubarray{
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,1,3,3};
        int k=6;
        int sum=0;
        int maxLength=0;
        int left=0;
        for(int right=0;right<a.length;right++){
            sum+=a[right];
            while(sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
        }
        System.out.println(maxLength);

    }
}