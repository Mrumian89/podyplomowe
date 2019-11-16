import javax.sound.midi.Soundbank;

public class Test3 {
    public static void main(String[] args) {

        // system dziesiętny - 0 do 9
        // 154 -> 1 * 10^2 + 5 * 10^1 + 4 * 10^0 = 100 +50 + 4


        // System.out.println(Integer.toBinaryString(5));
        // System.out.println(Integer.toOctalString(39));
        // System.out.println(Integer.toHexString(943));


        // 8 4 2 1
        // 1 0 1 1


        // & iloczyn bitowy
        // | suma bitowa
        // ^ - XOR (eXclusive OR)
        // ~ - negacja bitowa
        // << - przesunięcie w lewo
        // >> - przesunięcie w prawo

        byte a = 1; // 00000001
        byte b = 5; // 00000101

        System.out.println(b >> a);

        // System.out.println(String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'));
        // System.out.println(String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'));
        // System.out.println(".......................");
        // System.out.println(String.format("%8s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));


        // -1

        // 0001
        // 1110 + 1
        // ..........
        // 1111

        // System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ', '0'));
        // System.out.println(String.format("%32s", Integer.toBinaryString(-1)).replace(' ', '0'));


        System.out.println(1 + 2 + "z");
        System.out.println(1 + 2);
        System.out.println("a" + 1 + 2 + "z");

        System.out.println((6 + 4) / 2);









    }
}

