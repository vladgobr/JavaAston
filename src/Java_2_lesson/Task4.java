package Java_2_lesson;

public class Task4 {

    public static void Str(String str , int a){
        for (int i =0; i <= a; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        String str = "Повторяшка!";

        Str(str,a);
    }
}
