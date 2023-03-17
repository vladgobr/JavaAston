package Java_2_lesson;

public class Task2 {

    public static void Sum (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }

    public static void main(String[] args) {

        int a = -1;

        Sum(a);
    }
}
