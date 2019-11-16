public class Test5 {
    public static void main(String[] args) {

        byte a = 7;
        short b;
        int c;

        c = a; // niejawna konwersja
        b = (short)c; // rzutowanie


        int x = 5;
        double y = 13.5;

        double z = x / y;
        int w = (int)(x / y);
        int k = x / (int)y;



    }
}
