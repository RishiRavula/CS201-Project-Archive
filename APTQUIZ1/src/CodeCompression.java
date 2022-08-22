import java.lang.reflect.Array;
import java.util.*;

public class CodeCompression {
    public String compress(String message) {
        char[] letters = message.toCharArray();
        ArrayList<Integer> ints = new ArrayList<>();
        String compressed = "";

        for (int i = 0; i < message.length(); i++) {
            int x = 0;
            ints.add(x, 1);

            while ((letters[i] == letters[i + 1]) && (letters[i +1] != message.length())) {
                ints.add(x, ints.get(x) + 1);
                i++;
            }
            if(letters[i] != letters[i - 1]){
                compressed += message.charAt(i) + String.valueOf(ints.get(x));
                x++;
            }


        }




        return compressed;

    }
}


