package lesson5;

public class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Петросян Алексей Владимирович", "gk@mail.ru",38,
                50000,"89054785874");
        emp1.info();


        //        Создать массив из 5 сотрудников.

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Петросян Алексей Владимирович","gk@mail.ru", 38,50000,
                "89054785874");
        empArray[1] = new Employee(" Игнатов Петр Ваисльевич","gk@mail.ru", 47,5000,
                "8945254875");
        empArray[2] = new Employee("Бадров Василий Николаевич","gk@mail.ru", 58,1000,
                "89554755915");
        empArray[3] = new Employee("Петров Никита Сергеевич", "gk@mail.ru",
                18,3000,"89549844855");
        empArray[4] = new Employee("Кислов Андрей Андреевич", "gk@mail.ru",29,
                1000,"89874116518");

//       С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (Employee e : empArray){
            if (e.getAge() > 40){
            e.info();
            }
        }
    }
}
