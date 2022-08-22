import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BigWord {
    public String most(String[] sentences) {
        String temp = "";
        for(String s : sentences){
            s = s.toLowerCase();
            temp += s + " ";
        }
       String[] sentance = temp.split(" ");

        Map<String,Integer> hsmap = new HashMap<String,Integer>();
        for (String s : sentance){
            if(hsmap.keySet().contains(s)){
                hsmap.put(s,hsmap.get(s)+1);
            }
            else{
                hsmap.put(s,1);
            }

        }
        String most = "";
        int max = 0;
        for(Map.Entry<String,Integer> entry : hsmap.entrySet()){
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > max){
                max = count;
                most = key;
            }
            else if(count == max){
                if (key.length() < most.length()){
                    most = key;
                }
            }
        }

        return most;
    }
}
