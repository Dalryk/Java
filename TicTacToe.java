import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
        public static char[][] map;
        public static final int SIZE = 3;
        public static final int DOTS_TO_WIN = 3;
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static final char DOT_EMPTY = '*';
        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true){
                humanTurn();
                printMap();
                if (checkWin(DOT_X)){
                    System.out.println("Human Winner!");
                    break;
                }
                if (isMapFull()){
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)){
                    System.out.println("AI Winner!");
                    break;
                }
                if (isMapFull()){
                    System.out.println("Draw!");
                    break;
                }
            }
            System.out.println("Game Over!");
        }
        public static void humanTurn(){
            int x,y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            }while (!isCellValid(x,y));
            map[y][x] = DOT_X;
        }
        public static void aiTurn(){
            int x,y;
            do {
                //for (int i = 0; i < SIZE; i++) {
                    //for (int j = 0; j < SIZE; j++) {
                        //if (map[i][j] == DOT_X &&(map[i+1][j+1] == DOT_X || map[i][j+1] == DOT_X || map[i+1][j] == DOT_X || map[i-1][j] == DOT_X || map[i][j-1] == DOT_X || map[i-1][j-1] == DOT_X)){
//
                        //}
                   // }
               // }
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }while (!isCellValid(x,y));
            System.out.println("Компьютер сходил по координатам" + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        public static boolean isCellValid(int x, int y){
            if (x < 0 || x>= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }
        public static  boolean isMapFull(){
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static boolean checkWin(char symb){
            boolean cols, rows, toright, toleft;
            toright = true;
            toleft = true;
            cols = true;
            rows = true;
            for (int diag=0; diag<SIZE; diag++) {
                toright &= (map[diag][diag] == symb);
                toleft &= (map[SIZE-diag-1][diag] == symb);
            }
            if (toright || toleft) return true;
            for (int col=0; col<SIZE; col++) {
                for (int row=0; row<SIZE; row++) {
                    cols &= (map[col][row] == symb);
                    rows &= (map[row][col] == symb);
                }
                if (cols || rows) return true;
            }
            return false;
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap(){
            for (int i = 0; i <= SIZE ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i+1 + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
