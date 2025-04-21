package tasks.task5;

/**
 * Значения корей квадратного уравнения.
 */
public class Result {
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
        if (getX1() == null && getX2() == null) {
            return "Нет корней";
        } else if (getX2() == null) {
            return "Один корень x1: " + getX1();
        } else
            return "Два корня: х1:" + getX1() + " x2:" + getX2();
    }
}


