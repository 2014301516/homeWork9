// Cubage.java
interface Cubage {
    double calculateVolume();
}

// Cylinder.java
class Cylinder implements Cubage {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return 3.14 * radius * radius * height; // 使用题目实际要求的圆柱体积公式
    }
}

// Cone.java
class Cone implements Cubage {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return 3.14 * radius * radius * height / 3; // 使用题目实际要求的圆锥体积公式
    }
}

//Main.java
public class Main {
    public static void main(String[] args) {
        Cubage cylinder = new Cylinder(2.5, 4);
        Cubage cone = new Cone(3, 4);

        System.out.printf("圆柱的体积是：%.2f%n", cylinder.calculateVolume());
        System.out.printf("圆锥的体积是：%.2f%n", cone.calculateVolume());
    }
}
