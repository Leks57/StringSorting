import java.util.List;

public class Output {
    public static void PrintOut (List<String> List) {
        System.out.println();
        System.out.println("Отсортированный список: ");
        for (String t: List) {
            System.out.println(t);
        }
    }
}