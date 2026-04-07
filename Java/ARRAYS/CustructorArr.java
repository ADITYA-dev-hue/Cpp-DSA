class CustructorArr {
    public int[] arr;

    CustructorArr() {
        System.out.println("Default");
    }

    CustructorArr(int... n) {
        for (int i : n) {

            arr[i] = i + 2;
        }
    }

    void display() {
        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        CustructorArr obj = new CustructorArr(12, 2, 7, 4, 8, 1, 9);
        obj.display();
    }
}
