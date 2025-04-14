package tasks.task5;

/**
 * Устанавливает, возвращает значения корней квадратного уравнения
 */
public class Result {
    /**
     * Поля x1, x2 корни квадратного уравнения
     */
    final private Double x1;
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
}


