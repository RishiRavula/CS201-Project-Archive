import java.util.ArrayList;
public class Starter {
    public int begins(String[] words, String first){
        ArrayList<String> ret = new ArrayList<String>();
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(first.charAt(0) == (words[i].charAt(0))){
                if(!ret.contains(words[i])) {
                    ret.add(words[i]);
                    count++;
                }



            }
        }
        return count;

    }
}
