public class Class4 {
    public void iWasBorn(int month) {
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

    public static void main(String[] args) {
        Class4 class4 = new Class4();

        class4.iWasBorn(1);
    }
}
