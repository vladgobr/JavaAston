package Java_2_lesson;

public class Task3 {

    public static String sum (int a) {
        return (a >= 0) ? "Privet" : "Poka";
    }

    public static void main(String[] args) {
        int a = -1;

        System.out.println(sum(a));
    }
}
