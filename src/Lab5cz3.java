public class Lab5cz3 {
    public static void main(String[] args) {

        int i = 123; // nasza liczba
        int n = 2;   // pozycja bitu
        int mask = 1 << n;

        boolean result = (i & mask ) > 0;

        System.out.println("Dla liczby " + i + " na pozycji " + n);
        System.out.println(" znajduje się bit " + result);




    }
}
