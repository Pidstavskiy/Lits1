public class Class3 {

    public void outputTwoDimensioArr(int[][] a1) {
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void method1(int[][] a1) {
        System.out.println("\nElements above the diagonal : ");
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                System.out.print(a1[i][j] + " ");
            }
        }
    }

    public void method2(int[][] a1) {
        System.out.println("\nElements below the diagonal : ");
        for (int i = 1; i < a1.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a1[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Class3 class3 = new Class3();

        int[][] a1 = {{1, 5, 7, 32, 65, 5, 23, 45, 75, 1},
                {33, 44, 12, 32, 4, 5, 12, 3, 4, 1},
                {99, 2, 4, 21, 35, 67, 86, 32, 2, 4},
                {12, 43, 54, 22, 6, 774, 2, 2, 4, 1},
                {12, 34, 12, 2, 0, 12, 40, 42, 12, 3},
                {55, 34, 52, 61, 71, 863, 46, 87, 34, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {99, 32, 6, 8, 3, 236, 78, 568, 54, 23},
                {1, 3, 5, 7, 9, 11, 12, 13, 15, 17}};

        System.out.println("Two-dimensional array : ");
        class3.outputTwoDimensioArr(a1);

        class3.method1(a1);
        class3.method2(a1);
    }
}
