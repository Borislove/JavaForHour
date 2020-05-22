//массивы
public class Array {
    public static void main(String[] args) {

        //int[] arr = new int[]{56, 489, 324, 22, 2, 4234, 4123};
        //System.out.println(arr[2]);

        ////////////////////////////////////
//        float[] arr = new float[]{56.2f, 489.5f, 32.4f, 22.2f, 42.34f, 412.2f};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Element " + i + " is " + arr[i]);
//        }
        ////////////////////////////////////

        //двумерный массив
        int[][] arr = new int[][]{
                {23, 78, 65, 89},
                {23, 78, 65, 89},
                {23, 78, 65, 89}};

        arr[1][1] = 777;
        System.out.println(arr[1][1]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
