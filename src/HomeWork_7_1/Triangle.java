package HomeWork_7_1;

public class Triangle extends Figures{

    public double sideA;
    public double sideB;
    public double sideC;
    public double base;
    public double height;

    public Triangle(double sideA, double sideB, double sideC, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
    }

    @Override
    public double square() {
        return (base * height) / 2;  //Площадь треугольника = высота умножить на основание и их произведение поделить на 2
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;  //Периметр треугольника = сумме длин всех сторон
    }

    @Override
    void printInfo() {
        System.out.println("Triangle #: "+ "has next parameters: " + String.format("%.1f",sideA) + " SideA, and " + String.format("%.1f",sideB) + " SideB, and " + String.format("%.1f",sideC) + " SideC, and " + String.format("%.1f",base) + " base, and " + String.format("%.1f",height) + " height");
    }
}
