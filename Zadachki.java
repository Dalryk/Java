public class Zadachki {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillArray(array);

        char[][] flag = new char[8][11];
        drawFlag(flag);
    }

    public static void fillArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            } for (int j = array[i].length - i; j< array[i].length; j++){
                array[i][j] = 2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
    public static void drawFlag(char[][] flag){
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                if (i<flag.length/2){
                    if (j <= i) flag[i][j] = 'b';
                    else flag[i][j] = 'w';
                }else if (j<flag.length - i) flag[i][j] = 'b';
                else flag[i][j] = 'r';
            }
        }
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                System.out.print(flag[i][j] + " ");
            }
            System.out.println();
        }
    }
}
