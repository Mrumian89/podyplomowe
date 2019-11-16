import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {

/*      double a = 3e-10;
        double b = 3e+100;

        DecimalFormat df = new DecimalFormat ( "#.##########");
        System.out.println(df.format(a));
        System.out.println(df.format(b));*/

        // int jackpot = 3500000
        int jackpot = 3_500_000;

        int binary = 0b101010101010; // binarnie
        System.out.println(binary);

        int val = 05670;  // ósemkowo
        System.out.println(val);

        boolean chosen = true; // prawda / fałsz
        char key = 'a';

        String message = "Agata powiedziała \n- \"To nie jest moje\" \u2122";
        System.out.println(message);

    }
}
