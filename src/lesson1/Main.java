package lesson1;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        long l = 100;
        double d = 5.0;
        float f = 5.0f;
        char c = 'c';
        boolean b = true;
        String s = "hello";
        System.out.println(math(10.0f, 3.0f, 8.0f, 4.0f));
        System.out.println(sum(10,5));
        positiveNum(-1);
        System.out.println(negative(5));
        leapYear(2016);
    }

    public static float math(float a, float b, float c, float d){
        return  a * (b + (c / d));
    }

    public static boolean sum(int a, int b){
        if (a + b >= 10 && a + b <= 20)
        return true;

        return false;
    }

    public static String positiveNum(int a){
        if (a >= 0)
            System.out.println("Положительное");
        else System.out.println("Отрицательное");

        return null;
    }

    public static boolean negative(int a){
        if (a < 0)
            return false;

        return true;
    }

    public static void greeting(String name){
        System.out.println("Привет, " + name);
    }

    public static void leapYear(int year){
        if (year % 4 != 0 || year % 100 == 0 && year % 400 !=0)
            System.out.println( year + " год - Невисокосный");
        else
        System.out.println( year + " год - Високосный");
    }

}
