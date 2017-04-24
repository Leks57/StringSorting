import java.lang.String;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class StringSorting {

    public static void main(String[] args) throws IOException {

        int wordCount = Input.getWordCount();
        List<String> myList = Input.getWords(wordCount);

        //Сортировка с помощью 3-х компараторов
        Collections.sort(myList, new VovelsComparator().thenComparing(new LetterNumberComparator()).thenComparing(new ReversedComparator()));

        Output.PrintOut(myList);
    }
}

//Проверка работы программы
// Строка для ввода: "Кашалот Катафалк Шар Трактор Яблоко"