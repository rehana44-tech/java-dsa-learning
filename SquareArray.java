import java.util.*;

class SquareArray {
    public static void main(String[] args) {

        int array[] = {3, -4, 1, -2};

        Arrays.sort(array);

        int n = array.length;
        int result[] = new int[n];

        int left = 0;
        int right = n - 1;

        for(int i = n - 1; i >= 0; i--) {

            if(Math.abs(array[left]) > Math.abs(array[right])) {
                result[i] = array[left] * array[left];
                left++;
            }
            else {
                result[i] = array[right] * array[right];
                right--;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}