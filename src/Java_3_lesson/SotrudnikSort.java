package Java_3_lesson;

public class SotrudnikSort {
    public static void print(Sotrudnik[] sotArray){

        for (int i = 0; i < sotArray.length; i++) {
            if (sotArray[i].getAge() > 40) {
                sotArray[i].print();
            }
        }
    }
}
