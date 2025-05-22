package tasks.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("disneyPrincesses");
        List<Princesses> disneyPrincesses = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\\|");
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1];
            int age = Integer.parseInt(parts[2].trim());
            String hairColor = parts[3];
            String eyeColor = parts[4];
            Princesses princesses = new Princesses(id, name, age, hairColor, eyeColor);
            disneyPrincesses.add(princesses);
        }

        for (Princesses princesses : disneyPrincesses) {
            System.out.println(princesses);
        }

        scanner.close();
    }
}
