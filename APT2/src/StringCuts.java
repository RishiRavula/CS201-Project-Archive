import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
       ArrayList<String> filt = new ArrayList<>();
        for(String s : list){
            if(s.length() >= minLength){
                if(!filt.contains(s)){
                    filt.add(s);
                }
            }
        }
        String[] filtered = new String[filt.size()];
        filtered = filt.toArray(filtered);
        return filtered;
    }
}
