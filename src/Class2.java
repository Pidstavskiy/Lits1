import java.util.Random;

public class Class2 {

    public int method1(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public int method2(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public int[] method3(int[] a) {
        int[] arr = new int[a.length];
        for (int i = a.length - 1; i > 0; ) {
            for (int j = 0; j < a.length; j++) {
                arr[j] = a[i];
                i--;
            }
        }
        return arr;
    }

    public void method4(int[] a) {
        System.out.print("\nOdd elements : ");
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public int[] method5(int[] array) {
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
        return array;
    }

    public void outputArray(int[] a) {
//        System.out.print("\nArray : ");
        for (int arr : a) {
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {

        Class2 class2 = new Class2();

        Random r = new Random();

        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(47);
        }

        System.out.print("Array : ");
        class2.outputArray(a);
        System.out.println("\nMax : " + class2.method1(a));
        System.out.println("Min : " + class2.method2(a));
        System.out.print("Reverse array : ");
        class2.outputArray(class2.method3(a));
        class2.method4(a);
        System.out.print("\nSorted array : ");
        class2.outputArray(class2.method5(a));


    }
}
