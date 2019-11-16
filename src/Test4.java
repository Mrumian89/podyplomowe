public class Test4 {
    public static void main(String[] args) {

        int accountBalance = 15005;
        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n", accountBalance);

        // s - do formatowania Stringów
        // d - liczby całkowite
        // f - zmiennoprzecinkowych
        // t - data/czas
        // n - separator linii
        // bB - boolean

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.10f%d", pi, 222);



    }
}
