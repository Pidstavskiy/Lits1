import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static boolean isPalindrom(String word) {
        char[] c = word.toCharArray();
        int len = c.length - 1;
        int i = 0;
        while (i < len) {
            if (c[i] != c[len]) {
                return false;
            }
            i++;
            len--;
        }
        return true;
    }

    public static void iWasBorn(int month) {
        switch (month) {
            case 1:
                System.out.println("I was born in January");
                break;
            case 2:
                System.out.println("I was born in February");
                break;
            case 3:
                System.out.println("I was born in March");
                break;
            default:
                System.out.println("Incorrect month");
                break;
        }
    }

    public static void bubbleSort(int[] array) {
        boolean b = true;
        int j = 0;
        int temp;
        while (b) {
            b = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    b = true;
                }
            }
        }
    }


    public static void main(String[] args) {

        // task 1
        System.out.println("Word is palindrom : " + isPalindrom("dada"));

        // task 2
        Random r = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(47);
        }

        System.out.print("Array : ");
        for (int arr : a) {
            System.out.print(arr + " ");
        }

        //task 2a Max value
        System.out.println();
        int max = a[0];
        int ind1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                ind1 = i;
            }
        }
        System.out.println("Max value " + max + " and index " + ind1);

        //task 2b Min value
        int min = a[0];
        int ind2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                ind2 = i;
            }
        }
        System.out.println("Min value " + min + " and index " + ind2);

        // task 2c
        int[] arr = new int[a.length];
        for (int i = a.length - 1; i > 0; ) {
            for (int j = 0; j < a.length; j++) {
                arr[j] = a[i];
                i--;
            }
        }
        System.out.print("Reverse array : ");
        for (int array : arr) {
            System.out.print(array + " ");
        }

        // task 2d Odd elements of array
        System.out.println();
        System.out.print("Odd elements of array : ");
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }

        //task 2e Sorting array
        bubbleSort(a);
        System.out.println();

        System.out.print("Sorted array : ");
        for (int arr3 : a) {
            System.out.print(arr3 + " ");
        }
        System.out.println();

        // task 3
        System.out.println();
        System.out.println("Two-dimensional array: ");
        int[][] a1 = {{1, 5, 7, 32, 65, 5, 23, 45, 75, 1}, {33, 44, 12, 32, 4, 5, 12, 3, 4, 1}, {99, 2, 4, 21, 35, 67, 86, 32, 2, 4}, {12, 43, 54, 22, 6, 774, 2, 2, 4, 1}, {12, 34, 12, 2, 0, 12, 40, 42, 12, 3}, {55, 34, 52, 61, 71, 863, 46, 87, 34, 1}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, {99, 32, 6, 8, 3, 236, 78, 568, 54, 23}, {1, 3, 5, 7, 9, 11, 12, 13, 15, 17}};
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + "\t");
            }
            System.out.println();
        }

        // task 3a Elements above the diagonal
        System.out.println("Elements above the diagonal : ");
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                System.out.print(a1[i][j] + " ");
            }
        }

        // task 3b Elements below the diagonal
        System.out.println();
        System.out.println("Elements below the diagonal : ");
        for (int i = 1; i < a1.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a1[i][j] + " ");
            }
        }
        System.out.println();

        //task 4 switch
        System.out.println();
        iWasBorn(1);
    }
}
