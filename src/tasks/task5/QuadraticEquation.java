package tasks.task5;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите коэффициент а: ");
            double a = scanner.nextDouble();
            System.out.println("Введите коэффициент b: ");
            double b = scanner.nextDouble();
            System.out.println("Введите коэффициент c: ");
            double c = scanner.nextDouble();
            double d = Math.pow(b, 2) - 4.0 * a * c;

            if (d < 0) {
                System.out.println("Нет корней");
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("Один корень: " + x);
            } else {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Два корня: " + x1 + " " + x2);
            }
            System.out.println("Хотите выйти? Y/N");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    break;
            }
        }while(!scanner.nextLine().equalsIgnoreCase("Y"));



    }

}
