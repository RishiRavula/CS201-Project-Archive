
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class FavoriteDinosaur {
    public String theBest (String[] dinos){
        HashMap<String, ArrayList<String>> parse = new HashMap<>();
        for(int i = 0; i < dinos.length; i++){
            String[] dinoName = dinos[i].split(":");
            List<String> name = new ArrayList<String>(Arrays.asList(dinoName[0]));
            if(!parse.containsKey(dinoName[1])){
                parse.put(dinoName[1],new ArrayList(name)); //first time seeing key, value pair
            }
            else{
                ArrayList<String> updatedValue = new ArrayList<>(parse.get(dinoName[1]));
                updatedValue.add(name.get(0)); // old array list contents + new array list contents
                Collections.sort(updatedValue); //alphabetical name values
                parse.put(dinoName[1], updatedValue); //Put all items into a hashmap with Keys as dinosaur and values as a list of names
            }
        }
        HashMap.Entry<String, ArrayList<String>> max = null;

        for (HashMap.Entry<String,ArrayList<String>> next : parse.entrySet()){
            if(max == null || next.getValue().size() > max.getValue().size()){
                max = next;
            }

        }

        String maxKey = max.getKey();
        ArrayList<String> maxValue = max.getValue();
        String maxValueString = "";
        for(int i = 0; i < maxValue.size(); i++){
            maxValueString += maxValue.get(i) + " ";
        }
        String answer = maxKey + " " + maxValueString;
        answer = answer.substring(0, answer.length()-1);
        return answer;

    }
}

