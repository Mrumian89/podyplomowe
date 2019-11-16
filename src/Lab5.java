public class Lab5 {
    public static void main(String[] args) {

        int investment = 14_000;
        double year1value = (investment * 1.4);

        System.out.println("Wartość inwestycji w pierwszym roku: " + year1value + " zł.");


        double year2value = (year1value - 1500);
        System.out.println("Wartość inwestycji w drugim roku: " + year2value + " zł.");

        double year3value = (year2value * 1.12);
        System.out.println("Wartość inwestycji w trzecim roku: " + year3value + " zł.");




    }

}
