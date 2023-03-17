package Java_2_lesson;

public class Task6 {
    public static void NewMasiv (int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int sise = 100;

        NewMasiv(sise);
    }
}
