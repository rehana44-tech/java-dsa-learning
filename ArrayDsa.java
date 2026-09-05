public class ArrayDsa {
     public static void main(String[] args) {

        int array1[] = {1, 2, 3, 4};
        int array2[] = {3, 4, 5, 6};

        int n = array1.length;
        int m = array2.length;

        int union[] = new int[n + m];

        int k = 0;
        for(int i=0;i<n;i++){
            union[k]=array1[i];
            k++;
        }
        for(int i=0;i<m;i++){
            boolean found=false;
            for(int j=0;j<k;j++){
                if(union[j]==array2[i]){
                    found =true;
                    break;
                }
            }
            if(found==false){
                union[k]=array2[i];
                k++;
            }
        }
         for(int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
}
}
