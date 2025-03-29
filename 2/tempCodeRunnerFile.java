public class Main {
    // 定义接口 Cubage
    public interface Cubage {
        double calculateVolume();
    }

    // 实现 Cylinder 类
    public static class Cylinder implements Cubage {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double calculateVolume() {
            return Math.PI * radius * radius * height;
        }
    }

    // 实现 Cone 类
    public static class Cone implements Cubage {
        private double radius;
        private double height;

        public Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double calculateVolume() {
            return (Math.PI * radius * radius * height) / 3;
        }
    }

    // 主方法
    public static void main(String[] args) {
        // 创建 Cylinder 对象并计算体积
        Cylinder cylinder = new Cylinder(2.5, 4);
        double cylinderVolume = cylinder.calculateVolume();

        // 创建 Cone 对象并计算体积
        Cone cone = new Cone(3, 4);
        double coneVolume = cone.calculateVolume();

        // 输出结果，保留两位小数
        System.out.printf("圆柱的体积是：%.1f\n", cylinderVolume);
        System.out.printf("圆锥的体积是：%.2f\n", coneVolume);
    }
}