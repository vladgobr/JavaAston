package Java_1_lesson;

import java.util.HashMap;
import java.util.Map;

public class lesson_6 {

    public static void theOrder (int[] array) {
        if (array.length >= 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= array[i+1]) {
                    System.out.println("true");
                }
                else
                    System.out.println("false");
            }
        }
    }

    // StringBuffer or Builder
    public static void newText(String text, String separator, int count) {
        if (count <= 1) {
            System.out.println(text);
        } else if (count <= 2){
            System.out.println(text + separator + text);
        } else
            System.out.println(text + separator + text +separator + text);
    }

    // методы HashMap
    public static Map<Character, Boolean> theSymbol(char[] symbol) {
        Map<Character,Boolean> map = new HashMap<>();
        char c = 'c';
        for (int i = 0; i < symbol.length; i++){
                if (symbol[i] == c) {
                    System.out.println(symbol[i] + " - true");
                } else
                    System.out.println(symbol[i] + " - false");
            }
        return map;
    }

    public static void main(String[] args) {

        String text = "Java";
        String separator = "И";
        int count = 3;

        newText(text,separator,count);


//        int[] array = {1, 3, 5};
//
//        theOrder(array);


        char[] symbol = {'c', 's', 'e', 'c'};

        theSymbol(symbol);
    }
}
