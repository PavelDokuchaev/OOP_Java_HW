package homework7;

/*
Создать класс Сотрудник (Employee) с полями:
Имя, Фамилия (String)
Название отдела (String)
Зарплата (double)
Реализовать equals и hashCode, который работает только с именем и фамилией 
*/

public class EmpolyeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Denis", "Nazarov", "Accaunting", 50000);
        Employee employee2 = new Employee("Denis", "Nazarov", "Legal Department", 65000);
        Employee employee3 = new Employee("Ivan", "Ivanov", "Legal Department", 65000);

        System.out
                .println("e1: " + employee1 + "\ne2: " + employee2 + "\nСравнение equals: "
                        + employee1.equals(employee2) + "\n");
        System.out
                .println("e2: " + employee2 + "\ne3: " + employee3 + "\nСравнение equals: "
                        + employee2.equals(employee3) + "\n");

        System.out.println("Сравнение hashCode:");
        System.out.println(employee1.hashCode() == employee2.hashCode());
        System.out.println(employee2.hashCode() == employee3.hashCode());
    }
}