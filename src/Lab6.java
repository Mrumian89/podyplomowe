import java.util.StringTokenizer;

public class Lab6 {
    public static void main(String[] args) {
        StringTokenizer st1;

        String date = "29/04/2019";
        st1 = new StringTokenizer(date,"/");

        System.out.println("\nCz.1: " + st1.nextToken());
        System.out.println("Cz.2: " + st1.nextToken());
        System.out.println("Cz.3: " + st1.nextToken());




    }
}
