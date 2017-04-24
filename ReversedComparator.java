import java.util.Comparator;

public class ReversedComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length() && Comparation.Vowel(o1) == Comparation.Vowel(o2)) {
            return -1;
        }
        else return 1;
    }
}