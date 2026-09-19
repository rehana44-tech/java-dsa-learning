class lessTarget{
    public static void main(String[] args) {
        //sorted array
        int arr[]={-2,0,1,3};
        int n=arr.length;
        int i=0;
        int target=2;
        int ans=0;
            for(i=0;i<n-2;i++){
                int left=i+1;
                int right =n-1;
             while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum >=target){
                    right--;
                }
                else{
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);   
                      left++;
                }
           
    
    }
}
     

    
}
}