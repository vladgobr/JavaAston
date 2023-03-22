package Java_3_lesson;
/* все эти поля вынести в отдельные класы */
public class Sotrudnik {
    private String fio;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;



    public Sotrudnik (String fio, String position, String email, String number, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println("ФИО: " + fio + " | " + " Должность: " + position + " | " + " email: " + email + " | " +
                " Телефон: " + number + " | " + " Зарплата: " + salary + " | " + " Возраст: " + age +"\n" + "*");
    }

}
