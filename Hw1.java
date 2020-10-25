import java.util.Random;
import java.util.Scanner;

public class Hw1 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        for(;;){
            int a = random.nextInt(10);
            for (int i = 2; i >= 0; i--) {
                System.out.println("Введите число от 0 до 9!");
                int b = scanner.nextInt();
                if (b > a) System.out.println("Введённое число больше загаданного. Кол-во оставшихся попыток: " + i + ".");
                if (b < a) System.out.println("Введённое число меньше загаданного. Кол-во оставшихся попыток: " + i + ".");
                if (b == a){
                    System.out.println("Вы угадали число " + b);
                    break;
                }
            }
            System.out.println("Загаданное число - " + a);
            System.out.println("Хотите попробовать ещё раз? Введите 1 если да, или 0 если нет.");
            int c = scanner.nextInt();
            while (c > 1 || c < 0) {
                    System.out.println("Введите 1 или 0");
                    c = scanner.nextInt();
                }
            if (c == 0) break;
        }
    }

}
