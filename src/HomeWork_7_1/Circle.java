package HomeWork_7_1;

public class Circle extends Figures {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return radius * radius * Math.PI; //Площадь круга = диаметр умножить на число Пи
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI) * radius; //Длина окружнсти = радиус умножить на 2Пи
    }

    @Override
    void printInfo() {
        System.out.println("Circle #: "+ "has the radius: " + String.format("%.1f",radius));
    }
}
