class mooreVoting{
    public static void swap(int a[],int i,int j){
        int temp=a[i];
      a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
       int a[]={2,2,3,3,1,2,2};
       int n=a.length;
       int count=0;
       int target=n/2;
       int el=0;
       for(int i=0;i<n;i++){
         if(count==0){
               count=1;
               el=a[i]; 
            }
        else if(a[i]==el){
            count++;
        }
        else{
            count--;
           
        }
       }
        int frequency = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] == el) {
                frequency++;
            }
        }

        if(frequency > n / 2) {
            System.out.println(el);
        }
        else {
            System.out.println("No majority element");
        }
    }
}