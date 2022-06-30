public class GeometryCalculator {

    public static double getCircleSquare(double radius) {
        return Math.PI * radius * radius;
    }

   public static double getSphereVolume(double radius) {
        double v = 4.0 / 3.0;
        return v * Math.PI * Math.abs(radius * radius * radius);
           }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            System.out.println("Можно построить треугольник");
            double p = (a + b + c) / 2;
            double p1 = (p - a);
            double p2 = (p - b);
            double p3 = (p - c);
            double pp = p * p1 * p2 * p3;
            double s = Math.sqrt(pp);
            return s;
        }
        return -1.0;
    }
}
