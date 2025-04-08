package tasks.task5;

public class QuadraticEquation {
    public String noRoots() {
        return "нет корней";
    }

    public String oneRoot(double x) {
        return "Один корень" + x;
    }

    public String twoRoots(double x1, double x2) {
        return "Два корня: " + x1 + " " + x2;
    }

    public String calculation(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4.0 * a * c;

        if (d < 0) {
            return noRoots();
        } else if (d == 0) {
            double x = -b / (2 * a);
            return oneRoot(x);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return twoRoots(x1, x2);
        }

    }
}

