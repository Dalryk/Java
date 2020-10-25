import java.util.Arrays;
import java.util.Random;

public class Practica {
    public static Random random = new Random();
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt(10);
            array[i] = x;
        }
        System.out.println(Arrays.toString(array));

        int max = 5; // Массив не должен быть пустым
        int min = 5;
        float avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg +=array[i];
        }

        avg = avg / array.length;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
        System.out.println(Arrays.toString(removeElement(array)));
    }

    public static int[] removeElement(int[] nums) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 ==0){
                System.out.println("Deleted % 2 element " + nums[i]);
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
