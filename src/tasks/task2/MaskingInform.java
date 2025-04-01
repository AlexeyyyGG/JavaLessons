package tasks.task2;


import java.util.Scanner;

public class MaskingInform {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String text = scanner.nextLine();
        System.out.println(searchAndReplaceDiamonds(text, "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        String subStr = text.substring(text.indexOf("<"), text.indexOf(">") + 1);
        return text.replace(subStr, placeholder);
    }
}

// Изменить метод
//String searchAndReplaceDiamonds(String text, String placeholder),
//который будет заменять в переданной строке String text всё содержимое скобок <> и сами скобки на переданную строку в String placeholder, используя регулярные выражения.