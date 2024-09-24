//Написать иерархию классов для животных. У них у всех есть id, имя и возраст,
// при этом каждое из них может есть, некоторые могут говорить и предоставлять о себе данные в виде строки:
//- Собака, имеет дополнительно имя хозяина, может гулять по утрам
//- Кот
//- Ворона, может летать, имеет дополнительно максимальную высоту полета
//- Рыба, не может говорить, может плавать
//- Попугай, тоже может летать, имеет высоту полета и цвет оперения
//Создать массив из 10 объектов, заполненных случайным образом. Пройтись по массиву, заставить всех, кто способен, говорить, плавать, летать, гулять.
// Вывести информацию о каждом животном



//Доработайте задачу 2 из ДЗ 7.
// Теперь массив с животными циклично выводится на консоль и пользователю представляется выбор, какое действие с ними выполнить (для тех, кто может это сделать).
// Обработать ситуацию некорректного ввода пользователя с помощью исключений.



package HomeWork_9_1;

public abstract class Animals {
    protected int id;
    protected String name;
    protected int age;

    public Animals(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public abstract String getInfo();

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

