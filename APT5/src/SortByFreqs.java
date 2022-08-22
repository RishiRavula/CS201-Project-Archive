import java.util.*;
public class SortByFreqs {
    public String[] sort(String[] data) {
        TreeMap<String, Integer> frequency = new TreeMap<>();
        for(int i = 0; i < data.length; i++){
            frequency.putIfAbsent(data[i],0);
            frequency.put(data[i], frequency.get(data[i]) + 1);
        }
        ArrayList<Map.Entry<String,Integer>> sorted = new ArrayList<>(frequency.entrySet());
        Collections.sort(sorted, Collections.reverseOrder(Comparator.comparing(Map.Entry :: getValue)));

        String[] sort = new String[sorted.size()];
        for (int i = 0; i < sorted.size(); i++) {
            sort[i] = sorted.get(i).getKey();
        }
        return sort;
    }
}
