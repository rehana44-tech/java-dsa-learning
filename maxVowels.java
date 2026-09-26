class maxVowels{
    public static boolean isVowel(char c){
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        return true;
    }
    return false;
   }
   public static void main(String[] args) {
       String str="abciidef";
       int k=3;
       int low=0;
       int high=k-1;
       int count=0;
       int max=0;
       for(int i=low;i<=high;i++){
          if(isVowel(str.charAt(i))){
            count++;
          }
       }
       max=count;
      for(int i=k;i<str.length();i++){
        if(isVowel(str.charAt(i))){
            count++;
        }
        if(isVowel(str.charAt(i-k))){
    count--;
}
        max=Math.max(max,count);
        
       }
       System.out.println(max);
   }
  
}