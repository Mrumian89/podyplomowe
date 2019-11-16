import java.util.Scanner;

public class MatrixLab7 {
    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("------------------");


        for(int j=0; j<n; j++) {

            for (int i = 1; i <= n; i++) {
                System.out.printf("%3s", i + j + " ");

            }
            System.out.println(" ");

        }














       // do {
        //    System.out.print(i + " ");
         //   i++;
           // do {
             //   System.out.print(i + " ");
               // i++;
           // } while (n >= (n + 1));
 //       } while (n >= i);

    //    System.out.println(" ");

    //    do {
    //        System.out.println((i=2) + " ");
    //        i++;
    //        do {
      //          System.out.print(i + " ");
       //         i++;
        //    } while (n = (n + 1));
       // } while (i >= n);


    }
}


