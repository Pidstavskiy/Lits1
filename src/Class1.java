public class Class1 {

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

    public static void main(String[] args) {
        System.out.println(isPalindrom("laal"));
    }
}
