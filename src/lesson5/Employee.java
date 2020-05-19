package lesson5;

//      Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

    public class Employee {
        private  String name;
        private  String sureName;
        private  String middleName;
        private  String email;
        private  String callNum;
        private  int salary;
        private  int age;

//      Конструктор класса должен заполнять эти поля при создании объекта.

        public Employee (String fullName, String sEmail, int sAge, int sSalary, String sCallNum ){
            String[] tempString = fullName.split(" ");
            sureName = tempString[0];
            name = tempString[1];
            middleName = tempString[2];
            age = sAge;
            email = sEmail;
            salary = sSalary;
            callNum = sCallNum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSureName() {
            return sureName;
        }

        public void setSureName(String sureName) {
            this.sureName = sureName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCallNum() {
            return callNum;
        }

        public void setCallNum(String callNum) {
            this.callNum = callNum;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

//    * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

      void info(){
        System.out.println("ФИО: " + sureName + " " + name + " " + middleName);
         System.out.println("Возраст: " + age);
         System.out.println("Email: " + email);
         System.out.println("Номер телефона: " + callNum);
         System.out.println("Зарплата: " + salary + "$");
         System.out.println("_______________________________");
    }


}
