import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class SetAside {
    public String common(String[] list) {
        HashSet<String> parse = new HashSet<>();
        parse.addAll(Arrays.asList(list[0].split(" ")));
        for(int i = 1; i < list.length; i++){
            parse.retainAll(Arrays.asList(list[i].split(" ")));
        }
        ArrayList<String> sort = new ArrayList<>(parse);
        Collections.sort(sort);
        String common = String.join(" ",sort);



        return common;
    }
}