package tasks.task4;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию имя отчество");
        String name = scanner.nextLine();
        String[] result = name.split(" ");
        System.out.println("Фамилия: " + result[0]);
        System.out.println("Имя: " + result[1]);
        System.out.println("Отчество: " + result[2]);

    }
}

// Вводимая строка с фамилией, именем и отчеством должна разбиваться с использованием регулярного выражения.В консоль выводятся фамилия, имя, отчество каждое на новой строке