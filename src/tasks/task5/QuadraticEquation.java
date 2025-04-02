package tasks.task5;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        System.out.println("Введите коэффициент а: ");
        Scanner scannera = new Scanner(System.in);
        double a = scannera.nextDouble();
        System.out.println("Введите коэффициент b: ");
        Scanner scannerb = new Scanner(System.in);
        double b = scannerb.nextDouble();
        System.out.println("Введите коэффициент c: ");
        Scanner scannerc = new Scanner(System.in);
        double c = scannerc.nextDouble();

        double d = Math.pow(b,2) - 4.0 * a * c ;
        if(d < 0){
            System.out.println("Нет корней");
        }else if(d == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корень: " + x);
        }else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Два корня: " + x1 + " " + x2);


        }

    }


}
