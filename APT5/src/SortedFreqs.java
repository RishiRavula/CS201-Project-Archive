import java.util.*;
public class SortedFreqs {
    public int[] freqs(String[] data) {
        TreeMap<String, Integer> frequency = new TreeMap<>();
        for(int i = 0; i < data.length; i++){
            frequency.putIfAbsent(data[i],0);
            frequency.put(data[i], frequency.get(data[i]) + 1);
        }
        ArrayList<Map.Entry<String,Integer>> sorted = new ArrayList<>(frequency.entrySet());
        Collections.sort(sorted, Comparator.comparing(Map.Entry :: getKey));

        int[] freq = new int[sorted.size()];
        for (int i = 0; i < sorted.size(); i++) {
            freq[i] = sorted.get(i).getValue();
        }
        return freq;

    }
}
