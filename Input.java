import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Input {

    public static List<String> getWords(int wordCount) throws IOException {
        List<String> mList = new LinkedList<String>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите " + wordCount + " слов через пробел: ");
            String[] str = br.readLine().trim().split("[\\s]+"); //Используем регулярное выражение: \s - знак пробела, "+" - несколько повторений предыдущих пробелов, дополнительный \ - экранирование мета-символа

            if (str.length != wordCount) {
                throw new ArrayIndexOutOfBoundsException();
            }

            for (int i = 0; i < wordCount; i++) {
                mList.add(str[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неправильное количество слов! Повторите ввод!");
            mList = getWords(wordCount);
        }

        return mList;
    }

    public static int getWordCount () {
        int wordCount = 0;
        try {
            Scanner scInt = new Scanner(System.in);
            System.out.println("Введите количество слов: ");
            wordCount = scInt.nextInt();
            if (wordCount <= 0) {
                throw new InputMismatchException();
            }

        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат! Введите число!");
            wordCount = getWordCount();
        }
        return wordCount;
    }
}