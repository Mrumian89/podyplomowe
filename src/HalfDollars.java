public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total =  new int[denver.length];
        int average;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];

        average = (total[0] + total[1] + total [2])/total.length;

        System.out.print("Produkcja w 2012 wyniosła: ");
        System.out.printf("%,d sztuk %n", total[0]);
        System.out.print("Produkcja w 2013 wyniosła: ");
        System.out.printf("%,d sztuk%n", total[1]);
        System.out.print("Produkcja w 2014 wyniosła: ");
        System.out.printf("%,d sztuk %n", total[2]);
        System.out.print("średnia produkcja: ");

        System.out.printf("%,d%n", average);

    }
}