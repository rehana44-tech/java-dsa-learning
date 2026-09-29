import java.util.HashMap;
class distinctSubstring{
    public static void main(String[] args) {
        String str="aabcdeffgghh";
        int length=0;
        int low=0;
        String result="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int high=0;high<str.length();high++){
            char n=str.charAt(high);
            if(map.containsKey(n)&&map.get(n)>=low){
                low=map.get(n)+1;
            }
            map.put(n,high);
            if (high - low + 1 > length) {
              length = high - low + 1;
              result = str.substring(low, high + 1);
            }
        }
        System.out.println(result);
        System.out.println(length);
    }
}