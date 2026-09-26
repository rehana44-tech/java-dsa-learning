class subsequenceString{
    public static void sub(String str,int i,String newStr){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        
            sub(str, i+1, newStr+str.charAt(i));
        
            sub(str, i+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        sub(str, 0, "");
    }
}