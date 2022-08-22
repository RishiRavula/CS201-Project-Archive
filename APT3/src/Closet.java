import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Closet {
    public String anywhere(String[] list) {
        HashSet<String> parse = new HashSet<>();
        parse.addAll(Arrays.asList(list[0].split(" ")));
        for(int i = 1; i < list.length; i++){
            parse.addAll(Arrays.asList(list[i].split(" ")));
        }
        ArrayList<String> sort = new ArrayList<>(parse);
        Collections.sort(sort);
        String anywhere = String.join(" ",sort);
        return anywhere;
    }
}
