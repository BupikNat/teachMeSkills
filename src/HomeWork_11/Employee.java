package HomeWork_11;

public class Employee {
    String name;
    int teaWants; // сколько раз хочет выпить чай
    int teaDrunk = 0; // сколько раз выпил чай

    public Employee(String name, int teaWants) {
        this.name = name;
        this.teaWants = teaWants;
    }
}
