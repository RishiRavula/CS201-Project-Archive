import java.util.*;
public class UniqueNewYork {
    public int seen(String[] records) {
        int k = 0;
        HashSet<String> unique = new HashSet<>();
        for(int i = 0; i < records.length; i++) {
            String[] set = records[i].split(",");
            for (int j = 0; j < set.length; j++) {
                if (!unique.contains(set[j])) {
                    unique.add(set[j]);
                    k++;
                }
            }
        }
        return k;
    }
}