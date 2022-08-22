import java.util.*;

public class TxMsg {
    public String getMessage(String original) {
        ArrayList<String> vowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
        String[] splitOriginal = original.split(" ");
        ArrayList<String> returnString = new ArrayList<String>(Arrays.asList(splitOriginal));
        String abbreviation = "";
        for(int i = 0;i<returnString.size();i++) {
            if(i==returnString.size()-1) {
                abbreviation = abbreviation + returnWord(returnString.get(i));
            }else{
                abbreviation = abbreviation + returnWord(returnString.get(i)) + " ";
            }
        }
        return abbreviation;
    }

    public String returnWord(String word) {
        ArrayList<String> vowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
        String[] splitOriginal = word.split("");
        ArrayList<String> returnString = new ArrayList<String>(Arrays.asList(splitOriginal));
        String abbreviation = "";
        for(int i = 0;i<returnString.size();i++) {
            if(!vowels.contains(returnString.get(i))) {
                abbreviation = abbreviation + returnString.get(i);
                while(!vowels.contains(returnString.get(i))&& i<returnString.size()-1) {
                    i++;
                }
            }
        }
        boolean good = false;
        for(int i = 0;i<abbreviation.length();i++) {
            if(!vowels.contains(Character.toString(abbreviation.charAt(i)))) {
                good = true;
            }
        }
        if(good == false) {
            return word;
        }
        return abbreviation;
    }
}
