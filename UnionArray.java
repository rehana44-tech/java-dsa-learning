
class UnionArray {
    public static void main(String[] args) {

        int array1[] = {1, 1, 2, 3, 4};
        int array2[] = {2, 5, 6};

        int n = array1.length;
        int m = array2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        int union[] = new int[n + m];

        while (i < n && j < m) {

            if (array1[i] < array2[j]) {

                if (k == 0 || union[k - 1] != array1[i]) {
                    union[k] = array1[i];
                    k++;
                }

                i++;
            }

            else if (array2[j] < array1[i]) {

                if (k == 0 || union[k - 1] != array2[j]) {
                    union[k] = array2[j];
                    k++;
                }

                j++;
            }

            else {

                if (k == 0 || union[k - 1] != array1[i]) {
                    union[k] = array1[i];
                    k++;
                }

                i++;
                j++;
            }
        }

        while (i < n) {
            if (k == 0 || union[k - 1] != array1[i]) {
                union[k] = array1[i];
                k++;
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || union[k - 1] != array2[j]) {
                union[k] = array2[j];
                k++;
            }
            j++;
        }

        for (int x = 0; x < k; x++) {
            System.out.print(union[x] + " ");
        }
    }
}