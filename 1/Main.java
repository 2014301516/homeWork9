// Shape.java
abstract class Shape {
    public abstract double calculateArea();
}

// Rectangle.java
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Trapezoid.java
class Trapezoid extends Shape {
    private double a;  // �ϵ�
    private double b;  // �µ�
    private double h;  // ��

    public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a + b) * h / 2;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // ���������Σ���4����3
        Shape rectangle = new Rectangle(4, 3);
        // �������Σ��ϵ�3���µ�4����5
        Shape trapezoid = new Trapezoid(3, 4, 5);

        // ������
        System.out.println("�����ε�����ǣ�" + rectangle.calculateArea());
        System.out.println("���ε�����ǣ�" + trapezoid.calculateArea());
    }
}