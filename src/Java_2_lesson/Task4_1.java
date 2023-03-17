package Java_2_lesson;

public class Task4_1 {

    public static boolean Year(int number) {

        if (number % 400 == 0 || (number % 4 == 0 && number % 100 != 0)){
           return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 2023;

        System.out.println(Year(number));
    }
}
