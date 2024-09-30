//В офисе компании на столе стоит банка с пакетиками чая трех типов, которая наполняется в начале дня случайным образом на 10-20 пакетиков (кидают с разных коробок не подряд).
// В офисе работают 5 сотрудников, каждый из которых приходит утром в офис с желанием выпить чай n-ное количество (0 <= n <= 5) раз,
// причем никто из них не хочет быть обличенным в торчании на кухне, поэтому пить его старается как можно реже.
// Смоделировать работу двух дней, вывести на протяжении дня кто какой чай выпил и кому в конце его не досталось (и сколько), если это произошло.


package HomeWork_11;

import java.util.*;

public class DrinkTea {
    //Банка с чаем заполняется случайным количеством пакетиков каждого типа (10-20)
    public static List<TeaType> fillTeaJar() {
        List<TeaType> teaJar = new ArrayList<>();
        Random rand = new Random();
        int totalTeaBags = 10 + rand.nextInt(11); //от 10 до 20 пакетиков

        for (int i = 0; i < totalTeaBags; i++) {
            teaJar.add(TeaType.values()[rand.nextInt(TeaType.values().length)]);
        }

        Collections.shuffle(teaJar); // Перемешать пакетики
        return teaJar;
    }

    //День работы
    public static void simulateDay(List<Employee> employees, List<TeaType> teaJar) {
        Random rand = new Random();

        //Сотрудник хочет взять пакетик чая
        for (Employee employee : employees) {
            for (int i = 0; i < employee.teaWants; i++) {
                if (!teaJar.isEmpty()) {
                    TeaType tea = teaJar.remove(rand.nextInt(teaJar.size()));
                    employee.teaDrunk++;
                    System.out.println(employee.name + " выпил чай: " + tea);
                } else {
                    System.out.println(employee.name + " хотел чай, но пакетиков не осталось.");
                    break;
                }
            }
        }

        //Остаток в банке
        if (!teaJar.isEmpty()) {
            System.out.println("В конце дня в банке осталось " + teaJar.size() + " пакетиков чая.");
        } else {
            System.out.println("Все чайные пакетики закончились.");
        }

        //Вывод в консоль кто сколько чая выпил
        for (Employee employee : employees) {
            System.out.println(employee.name + " выпил " + employee.teaDrunk + " раз(а) чай.");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        //Сколько раз сотрудники захотели выпить чай
        List<Employee> employees = Arrays.asList(
                new Employee("Алексей", rand.nextInt(6)),
                new Employee("Мария", rand.nextInt(6)),
                new Employee("Иван", rand.nextInt(6)),
                new Employee("Ольга", rand.nextInt(6)),
                new Employee("Дмитрий", rand.nextInt(6))
        );

        //Два дня
        for (int day = 1; day <= 2; day++) {
            System.out.println("\n--- День " + day + " ---");
            List<TeaType> teaJar = fillTeaJar();
            simulateDay(employees, teaJar);

            //Обнуление сколько кто выпил чая для следующего дня
            for (Employee employee : employees) {
                employee.teaDrunk = 0;
            }
        }
    }
}
