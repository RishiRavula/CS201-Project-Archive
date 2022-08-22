import java.util.ArrayList;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String temp[] = str.split(" ");
        ArrayList<Integer> values = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < temp.length; j++){
                if(words[i].equals(temp[j])){
                    count++;
                }
            }
            values.add(count);
            count = 0;
        }
        int[] analyze = new int[values.size()];
        for(int i = 0; i < values.size(); i++){
            analyze[i] = values.get(i);
        }


        return analyze;
    }
}
