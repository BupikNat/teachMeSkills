package HomeWork_7_1;


import java.util.Random;

public class CalculateFigures {
    public static void main(String[] args) {

        Figures[] figures = new Figures[5];
        Random random = new Random();

        for (int i = 0; i < figures.length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    double a = random.nextDouble() * 10 + 1;
                    double b = random.nextDouble() * 10 + 1;
                    figures[i] = new Rectangle(a, b);
                    break;
                case 1:
                    double r = random.nextDouble() * 10 + 1;
                    figures[i] = new Circle(r);
                    break;
                case 2:
                    double x = random.nextDouble() * 10 + 1;
                    double y = random.nextDouble() * 10 + 1;
                    double z = random.nextDouble() * 10 + 1;
                    double q = random.nextDouble() * 10 + 1;
                    double w = random.nextDouble() * 10 + 1;
                    figures[i] = new Triangle(x, y, z, q, w);
                    break;
            }
        }
        double totalPerimeter = 0;
        for (Figures figure : figures) {
            System.out.println("Фигура: " + figure.getClass().getSimpleName());
            figure.printInfo();
            System.out.println("Площадь: " + figure.square());
            System.out.println("Периметр: " + figure.perimeter());
            totalPerimeter += figure.perimeter();
            System.out.println();
        }
        System.out.println("Сумма периметров: " + totalPerimeter);
    }
}


