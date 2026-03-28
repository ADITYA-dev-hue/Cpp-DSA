class Arrays {
    public static void main(String args[]) {
        // declaring
        int arr1[] = new int[5]; // for integer it take 0 for bool it by default take false

        int arr[] = { 1, 2, 3, 4, 5, 6 };

        int arr2[] = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n   ===NEW erra===\n");

        boolean arr3[] = new boolean[6];
        for (boolean x : arr3) {
            System.out.print(x + " ");
        }

        String arr4[] = new String[6];
        for (String x : arr4) {
            System.out.print(x + " ");
        }
        Integer arrInt[] = new Integer[4];
        for (Integer x : arrInt) {
            System.out.print(x + " ");
        }
    }
}
