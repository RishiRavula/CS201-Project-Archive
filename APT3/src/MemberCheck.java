import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        TreeSet<String> result = new TreeSet<>();
        TreeSet<String> s1 = new TreeSet<>(Arrays.asList(club1));
        TreeSet<String> s2 = new TreeSet<>(Arrays.asList(club2));
        TreeSet<String> s3 = new TreeSet<>(Arrays.asList(club3));
        result.addAll(intersection(s1,s2));
        result.addAll(intersection(s1,s3));
        result.addAll(intersection(s2,s3));
        String[] ret = result.toArray(new String[0]);
        return ret;



    }

    public HashSet<String> intersection(TreeSet<String> set, TreeSet<String> compareTo) {
        HashSet<String> intersect = new HashSet<>();
        intersect.addAll(set);
        intersect.retainAll(compareTo);
        return intersect;
    }


}
