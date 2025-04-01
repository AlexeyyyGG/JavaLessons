package tasks.task3;

public class Salary {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] sentences = text.split(",");
        int sum = 0;
        for(int i = 0; i < sentences.length; i++) {

            String result = sentences[i].replaceAll("\\D+","");
            int digits = Integer.parseInt(result);
            sum = sum + digits;
        }

        System.out.println("Сумма :" + sum);
    }
}

//Внесите изменения в проект StringExperiments, чтобы суммы заработка каждого человека извлекались из текста регулярным выражением, а в конце программы рассчитывалась и распечатывалась общая сумма заработка людей.