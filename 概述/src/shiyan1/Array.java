package shiyan1;

public class Array{
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[][] array2 ={{1,2},{3,4},{4,5}};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j]);
            }
        }
    }
}

