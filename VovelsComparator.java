import java.util.Comparator;

public class VovelsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Comparation.Vowel(o1) < Comparation.Vowel(o2) ? 1 : Comparation.Vowel(o1) > Comparation.Vowel(o2) ? -1 : 0;
    }
}