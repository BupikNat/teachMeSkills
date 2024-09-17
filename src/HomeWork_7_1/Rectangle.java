package HomeWork_7_1;

public class Rectangle extends Figures {

    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return height * width;  //Площадь прямоугольника = длина умножить на ширину
    }

    @Override
    public double perimeter() {
        return (height * 2) + (width * 2);  //Периметр прямоугольника = сумме длин всех сторон
        }

    @Override
    void printInfo() {
        System.out.println("Rectangle #: "+ "has next sides: " + String.format("%.1f",width) + ", and " + String.format("%.1f",height));
    }
}