package tasks.task5;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation equation = new QuadraticEquation();
        do {
            System.out.println("Введите коэффициент а: ");
            double a = scanner.nextDouble();
            System.out.println("Введите коэффициент b: ");
            double b = scanner.nextDouble();
            System.out.println("Введите коэффициент c: ");
            double c = scanner.nextDouble();

            Result result = equation.calculation(a, b, c);
            System.out.println(result.getX1() + " " + result.getX2());
            System.out.println("Хотите выйти?: (Y/N) ");
            scanner.nextLine();

        } while (!scanner.nextLine().equalsIgnoreCase("Y"));
    }
}
