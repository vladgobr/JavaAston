package Java_1_lesson;

public class lesson_6_1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        if (array.length >= 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >1) {
                    System.out.println("true");
                }
                else
                    System.out.println("false");
            }
        }
    }
}
