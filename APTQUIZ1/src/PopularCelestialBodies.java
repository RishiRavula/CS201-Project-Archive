import java.util.*;
import java.util.Arrays;


public class PopularCelestialBodies {
    public String[] superStars(String[] favs) {
        ArrayList<String> space = new ArrayList<>();
        for (int i = 0; i < favs.length; i++) {
            if (space.isEmpty()) {
                space.addAll(Arrays.asList(favs[i].split(" ")));
            } else {
                space.retainAll(Arrays.asList(favs[i].split(" ")));

            }

        }
        Collections.sort(space);
        String[] favourite = new String[space.size()];
        String [] repeat = new String[space.size()];
        int next = 0;
        for (int i = 0; i < space.size(); i++) {
            favourite[next] = space.get(i);
            next++;
        }
        return favourite;


    }
}
