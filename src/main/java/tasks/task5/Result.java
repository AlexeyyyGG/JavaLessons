package tasks.task5;

import java.util.Locale;

/**
 * Значения корней квадратного уравнения.
 */
public class Result {
    private static final String NO_ROOTS = "Нет корней";
    private static final String ONE_ROOT = "Один корень х1 = %.1f";
    private static final String TWO_ROOTS = "Два корня x1 = %.1f x2 = %.1f";
    /**
     * Первый корень квадратного уравнения.
     */
    final private Double x1;
    /**
     * Второй корень квадратного уравнения.
     */
    final private Double x2;

    public Result(Double x1, Double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }

    @Override
    public String toString() {
        if (this.x1 == null && this.x2 == null) {
            return NO_ROOTS;
        } else if (this.x2 == null) {
            return String.format(Locale.US, ONE_ROOT, this.x1);
        } else {
            return String.format(Locale.US, TWO_ROOTS, this.x1, this.x2);
        }
    }
}


