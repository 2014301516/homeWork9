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
    private double a;  // 上底
    private double b;  // 下底
    private double h;  // 高

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
        // 创建长方形：长4，宽3
        Shape rectangle = new Rectangle(4, 3);
        // 创建梯形：上底3，下底4，高5
        Shape trapezoid = new Trapezoid(3, 4, 5);

        // 输出面积
        System.out.println("长方形的面积是：" + rectangle.calculateArea());
        System.out.println("梯形的面积是：" + trapezoid.calculateArea());
    }
}