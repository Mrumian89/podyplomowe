public class FindNumbInArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        for(int i=0; i<arr1.length; i++){
            System.out.print("arr [" + i + "] = ");
            System.out.println(arr1[i]);
        }



        int[][][] arr = {{{5},{5,7,8,9},{4,4}},{{3},{3,3,3,3}}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("arr [" + i + "][" + j + "][" + k + "] = ");
                    System.out.println(arr[i][j][k]);
                }
            }
        }
    }
}