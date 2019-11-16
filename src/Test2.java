public class Test2 {
    public static void main(String[] args) {

        // liczby całkowite
        // byte - 1   00000000
        // short - 2  00000000 00000000
        // int - 3    00000000 00000000 00000000 00000000
        // long - 4   00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        System.out.println(123123);
        System.out.println(1241235465434L);

        byte b = -120;
        short s = 31678;
        int z = 1_123_456_789;
        long l = z * b;
        char c = 123;
        char cc = '}';

        System.out.println(c + " "+ cc);



        // liczby zmiennoprzecinkowe
        // float - 4
        // double - 8

        double a = 34.35;
        float f = 1.4F;

        double d = 2342342423.23423423423423;

        boolean chosen = true;

        int qq = 3;
        int zz = 5;

        boolean q = qq > zz;

        System.out.println(q);


    }
}
