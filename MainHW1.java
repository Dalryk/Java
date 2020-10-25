public class MainHW1 {
    public static void main(String[] args) {
        byte by = 1; //8bit -128 127
        short sh = 123; //16bit 32k
        int in = 1233; //32bit 32k
        long lo = 1231224L; //64bit 2billiard
        float fl = 1.23f; //32bit
        double dou = 2.34234; //64bit
        char ch = 'A'; //One symbol
        final String Str = "Hello, world"; //Const
        boolean boo = true; // True or false

        System.out.println(NumberThree(3, 4,5,6));
        System.out.println(NumberFour(6, 5));
        System.out.println(NumberFive(-2));
        System.out.println(NumberSix(4));
        System.out.println(NumberSeven("Dalryk"));
    }
    public static int NumberThree(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean NumberFour(int a, int b) {
        if(a+b > 10 && a+b < 20){
            return true;
        }else {
            return false;
        }
    }
    public static String NumberFive(int a) {
        if( a >= 0){
            return "Положительное число!";
        } else {
            return "Отрицательное число!";
        }
    }
    public static boolean NumberSix(int a) {
        if ( a <= 0){
            return true;
        }else {
            return false;
        }
    }
    public static String NumberSeven(String name){
        return "Hello, "+ name;
    }
}
