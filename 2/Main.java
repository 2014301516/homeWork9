public class Main {
    // ����ӿ� Cubage
    public interface Cubage {
        double calculateVolume();
    }

    // ʵ�� Cylinder ��
    public static class Cylinder implements Cubage {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double calculateVolume() {
            // ʹ�� 3.14 �滻 Math.PI
            return 3.14 * radius * radius * height;
        }
    }

    // ʵ�� Cone ��
    public static class Cone implements Cubage {
        private double radius;
        private double height;

        public Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double calculateVolume() {
            // ʹ�� 3.14 �滻 Math.PI
            return (3.14 * radius * radius * height) / 3;
        }
    }

    // ������
    public static void main(String[] args) {
        // ���� Cylinder ���󲢼������
        Cylinder cylinder = new Cylinder(2.5, 4);
        double cylinderVolume = cylinder.calculateVolume();

        // ���� Cone ���󲢼������
        Cone cone = new Cone(3, 4);
        double coneVolume = cone.calculateVolume();

        // ������������һλС������λС��
        System.out.printf("Բ��������ǣ�%.1f\n", cylinderVolume);
        System.out.printf("Բ׶������ǣ�%.2f\n", coneVolume);
    }
}
