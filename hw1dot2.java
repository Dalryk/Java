import java.util.Random;
import java.util.Scanner;

public class hw1dot2 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] temp = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        String keyWord = words[random.nextInt(words.length)];
        //System.out.println(keyWord);
        String str;
        do {
            System.out.println("Write word");
            str = scanner.nextLine();
            if(str.equals(keyWord)){
                System.out.println("You win!");
                break;
            } else {
                int length = (keyWord.length() < str.length()) ? keyWord.length() : str.length();
                for (int i = 0; i < length; i++) {
                    if (keyWord.charAt(i) == str.charAt(i) && temp[i] == '#') temp[i] = keyWord.charAt(i);
                }
            }
            System.out.println(temp);
        }while (!str.equals(keyWord));
    }
}
