package Java_2_lesson;

public class Task5 {
    public static void Masiv(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {0,0, 1, 1, 0, 1};

        Masiv(arr);
    }

}
