package APT6.src;

import java.util.*;

public class WeightSort {
    public String[] sort(String[] strs) {
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList(strs));
        String [] returnArray = new String[strs.length];
        int counter = 0;
        while(ar.size() != 0) {
            int smallIndex = 0;
            int min = getWeight(ar.get(0));
            for(int a = 0; a < ar.size();a++) {
                if (getWeight(ar.get(a)) < min) {
                    min = getWeight(ar.get(a));
                    smallIndex = a;
                }
                if(getWeight(ar.get(a)) == min && ar.get(a).compareTo(ar.get(smallIndex)) < 0) {
                    min = getWeight(ar.get(a));
                    smallIndex = a;
                }
            }
            returnArray[counter] = ar.get(smallIndex);
            counter++;
            ar.remove(smallIndex);
        }
        return returnArray;
    }

    public int getWeight(String str) {
        String [] splitString = str.split("");
        int returnWeight = 0;
        for(String a: splitString) {
            char convert = a.charAt(0);
            int convertInt = convert;
            returnWeight = returnWeight + convertInt - 64;
        }
        return returnWeight;
    }
}
