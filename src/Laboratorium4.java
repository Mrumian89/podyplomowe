public class Laboratorium4 {

// First name
//Last name
//Age (0…100)
//Gender (m or f)
//Personal ID number (e.g. 8306112507)

        String firstName;
        String lastName;
        int Age;
        char Gender;
        long personalIDNumber;

        void showAttributes() {
            System.out.println("Imię: " + firstName);
            System.out.println("Nazwisko: " + lastName);
            System.out.println("Wiek: " + Age);
            System.out.println("Płeć: " + Gender);
            System.out.println("ID pracownika to: " + personalIDNumber);

    }
}