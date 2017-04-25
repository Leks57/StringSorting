package comparators;

import counting.Counting;
import java.util.Comparator;

public class VovelsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Counting.vowel(o1) < Counting.vowel(o2) ? 1 : Counting.vowel(o1) > Counting.vowel(o2) ? -1 : 0;
    }
}