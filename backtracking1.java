//backtracking
class backtracking1{
    public static void permutation(String str,String perm,int i){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int j=0;j<str.length();j++){
        char n=str.charAt(j);
        String perStr=str.substring(0,j)+str.substring(j+1);
        permutation(perStr, perm+n, i+1);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str, "", 0);
    }
}