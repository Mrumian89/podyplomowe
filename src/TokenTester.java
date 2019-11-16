import java.awt.*;

public class TokenTester {
    public static void main(String[] args) {

        Object obj = new Object();
        Object obj2;

        obj2 = obj; // dwie zmienne wskazujące na ten sam obiekt w pamięci
        // obj = null;


        System.out.println(obj);
        System.out.println(obj2);

        String name = new String("Michael Jordan");
        String name2= "Ala";
        System.out.println(name);

        Point point = new Point(0,0);
        System.out.println(point);

    }
}
