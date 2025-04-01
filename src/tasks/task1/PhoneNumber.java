package tasks.task1;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String input = scanner.nextLine();
        String number = input.replaceAll("[^0-9]", "");
        if (number.length() > 11 || number.length() < 10) {
            System.out.println("Неверный формат номера");

        } else if (number.charAt(0) == '8') {
            number = number.replaceFirst("8", "7");
            System.out.println(number);

        } else if (number.length() == 10 && number.charAt(0) == '9') {
            System.out.println("7" + number);

        } else {
            System.out.println("Неверный формат номера");
        }
    }
}
