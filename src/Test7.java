import java.sql.SQLOutput;

public class Test7 {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        { // start
            y = y + x;
        } // koniec

        if (x > 0) {
            System.out.println("Większe od zera!");
        } else if (x == 0) {
            System.out.println("Równe zero!");
        } else {
            System.out.println("Równe zero!");

        }
    }
}
