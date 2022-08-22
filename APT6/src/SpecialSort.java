package APT6.src;

import java.util.*;

public class SpecialSort {
    public String[] sort(String[] data, String[] special) {
        ArrayList<String> specialList = new ArrayList<String>();
        for(String str: data) {
            for(int i = 0; i < special.length;i++) {
                if(str.equals(special[i])) {
                    specialList.add(str);
                }
            }
        }
        Collections.sort(specialList);
        ArrayList<String> secondList = new ArrayList<String>();
        for(int i = 0; i<data.length;i++) {
            if(!specialList.contains(data[i])) {
                secondList.add(data[i]);
            }
        }
        Collections.sort(secondList);
        String[] returnList = new String[data.length];
        for(int i = 0; i < specialList.size();i++) {
            returnList[i] = specialList.get(i);
        }
        for(int i = specialList.size(); i < specialList.size()+secondList.size();i++) {
            returnList[i] = secondList.get(i-specialList.size());
        }
        return returnList;
    }
}
