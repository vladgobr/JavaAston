package Java_3_lesson;

public class Sotrudnik {
    public String fio;
    public String position;
    public String email;
    public String number;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Sotrudnik (String fio, String position, String email, String number, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printState(){
        System.out.println("ФИО: " + fio + " | " + " Должность: " + position + " | " + " email: " + email + " | " +
                " Телефон: " + number + " | " + " Зарплата: " + salary + " | " + " Возраст: " + age +"\n" + "*");
    }
}
