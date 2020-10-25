import java.util.Arrays;

public class MainHW2 {
    public static void main(String[] args) {
        // 1
        int[] array= new int[6];
        array[0] = 1;
        array[1] = 0;
        array[2] = 0;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            if(array[i] == 0){
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));

        //2
        int[] array2 = new int[8];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 3;
        }
        System.out.println(Arrays.toString(array2));

        //3
        int[] array3 = new int[12];
        array3[0] = 1;
        array3[1] = 5;
        array3[2] = 3;
        array3[3] = 2;
        array3[4] = 11;
        array3[5] = 4;
        array3[6] = 5;
        array3[7] = 2;
        array3[8] = 4;
        array3[9] = 8;
        array3[10] = 9;
        array3[11] = 1;

        for (int i = 0; i < array3.length; i++) {
            if(array3[i] < 6){
                array3[i] = array3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array3));

        //4
        int[][] array4 = new int[5][5];

        for (int i = 0; i < array4.length; i++){
            for (int j = 0; j < array4[i].length; j++) {
                if(i == j || i+j == array4.length - 1){
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        
        //5
        int[] array5 = new int[5];
        array5[0] = 12;
        array5[1] = 32;
        array5[2] = 23;
        array5[3] = 2;
        array5[4] = 6;
         int max,min;
         max = min = array5[0];
         for(int value: array5){
             if(value > max) max = value;
             if(value < min) min = value;
         }
        System.out.println("Max: " + max + " " + "Min: " + min);



    }
}
