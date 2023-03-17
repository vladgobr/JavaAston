package Java_2_lesson;

public class Task1 {

    public static boolean Sum (int a, int b) {

        if (a + b >= 10 && a + b <=20 ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 25;

        System.out.println(Sum(a,b));

    }
}
