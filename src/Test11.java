import java.awt.*;

public class Test11 {
    public static void main(String[] args) {

        int[] numbers = {1,5,2,7,3};

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("----------------");

        for (int x : numbers) {
            System.out.println(x);
        }

        System.out.println("----------------");

        String[] dogs = {"Burek", "Pluto", "Azor"};
        String[] people = {"Ania", "Wojtek", "Dorota"};
        String[] cats = {"Filemon", "Mruczek", "Klakier"};
        String[][] names = {dogs, people, cats};

        for (int i=0; i<names.length; i++) {
            for(int j=0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();

        }




        // int[][] multiDimArr = {{1,2},{3,4}}; // tablica wielowymiarowa

       // int[] a = {1,2};
       // int[] b = {3,4};
       // int[][] c = {a,b};

      //  System.out.println("Rozmiar tablicy wewnętrznej 1: " + c[0].length);
      //  System.out.println("Rozmiar tablicy wewnętrzne 2: " + c[1].length);





        // Point[] markups = {new Point(1,1), new Point(2,3), new Point(5,5)};

        // markups[2].x = 555;
        // System.out.println(markups[2].x);




       // String[] titles = new String[5];
       // titles [0] = "Pan";
       // titles [1] = "Pani";
       // titles [2] = "Państwo";
       // titles [3] = "Panna";
       // titles [4] = "Doktor";

        // System.out.println(titles[3]);

    }

}
