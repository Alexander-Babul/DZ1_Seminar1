package Seminar2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DZ2_6 {
    public static void main(String[] args) {
        String filePath = "fileDZ2_6.txt"; // Укажите путь к вашему файлу
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Читаем файл построчно
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line); // Добавляем каждую строку в ArrayList
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Преобразуем ArrayList в массив
        String[] linesArray = lines.toArray(new String[0]);

        // Выводим массив на экран
        for (String line : linesArray) {
            System.out.println(line);
        }
    }
}