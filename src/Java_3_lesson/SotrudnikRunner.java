package Java_3_lesson;

public class SotrudnikRunner {
    public static void main(String[] args) {

        Sotrudnik[] sotArray = new Sotrudnik[5];

        sotArray[0] = new Sotrudnik("Петров Пётр Петрович", "Специалист", "petr@mail.ru", "1111111", 1000, 30);
        sotArray[1] = new Sotrudnik("Федоров Фёдр Фёдорович", "Ведущий инжинер", "fedor@mail.ru", "2222222", 2000, 35);
        sotArray[2] = new Sotrudnik("Григорьев Григорий Григоривич", "Главный инжинер", "grigori@mail.ru", "3333333", 3000, 40);
        sotArray[3] = new Sotrudnik("Дмитро Дмитрий Дмитривич", "Бухгалтер", "dima@mail.ru", "4444444", 4000, 45);
        sotArray[4] = new Sotrudnik("Васильев Василий Васильевич", "Директор", "vasili@mail.ru", "5555555", 5000, 50);

        for (int i = 0; i < sotArray.length; i++) {
            if (sotArray[i].getAge() > 40) {
                sotArray[i].printState();
            }
        }
    }
}
