package Java_2_lesson;

public class Task3 {

    public static boolean Sum (int a) {
        if (a >= 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = -1;

        System.out.println(Sum(a));
    }
}
