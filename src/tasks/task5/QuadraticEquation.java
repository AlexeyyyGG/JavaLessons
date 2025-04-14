package tasks.task5;

public class QuadraticEquation {
    /**
     * Вычисление дискриминанта , расчёт и возвращение корней квадратного уравнения.
     *
     * @param a Старший коэффициент
     * @param b Средний коэффициент
     * @param c Свободный коэффициент
     * @return Значения корней уравнения
     */
    public Result calculation(double a, double b, double c) {

        double d = Math.pow(b, 2) - 4.0 * a * c;

        if (d < 0) {
            return new Result(null, null);
        } else if (d == 0) {
            double x1 = -b / (2 * a);
            return new Result(x1, null);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new Result(x1, x2);
        }
    }
}