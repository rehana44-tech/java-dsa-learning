class targetSubarray {

    public static void main(String[] args) {

        int a[] = {1, 2, 2, 3};

        int low = 0;
        int high = 0;

        int target = 4;
        int sum = 0;
        int minLength = a.length + 1;

        while(high < a.length) {

            // grow the window
            sum = sum + a[high];

            // shrink the window while sum is enough
            while(sum >= target) {

                int length = high - low + 1;

                minLength = Math.min(minLength, length);

                sum = sum - a[low];

                low++;
            }

            high++;
        }

        System.out.println(minLength);
    }
}