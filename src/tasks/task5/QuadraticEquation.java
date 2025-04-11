package tasks.task5;

public class QuadraticEquation {

    public Result calculation(double a, double b, double c) {
        Result result = new Result();
        double d = Math.pow(b, 2) - 4.0 * a * c;

        if (d < 0) {
            result.setX1(null);
            result.setX2(null);
        } else if (d == 0) {
            double x1 = -b / (2 * a);
            result.setX1(x1);
            result.setX2(null);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            result.setX1(x1);
            result.setX2(x2);
        }
        return result;
    }
}