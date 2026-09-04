import java.util.*;

class LeftRotateD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = {1, 2, 3, 4, 5};
        int n = array.length;
        int d = 3;
        d=d%n;
        int first[] = new int[d];

        // save first d elements
        for (int i = 0; i < d; i++) {
            first[i] = array[i];
        }

        // shift remaining elements to the left
        for (int i = d; i < n; i++) {
            array[i - d] = array[i];
        }

        // put saved elements at the end
        for (int i = 0; i < d; i++) {
            array[n - d + i] = first[i];
        }

        System.out.println(Arrays.toString(array));
    }
}

