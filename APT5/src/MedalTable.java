import java.util.*;
    public class MedalTable {

        public class Medals {

            private String myName;
            private int myGold;
            private int mySilver;
            private int myBronze;

            public Medals(String name) {
                myName = name;
            }

            public int getGold() {
                return myGold;
            }

            public int getSilver() {
                return mySilver;
            }

            public int getBronze() {
                return myBronze;
            }

            public String getName() {
                return myName;
            }

            @Override
            public String toString() {
                return myName + " " + myGold + " " + mySilver + " " + myBronze;
            }
        }

        public String[] generate(String[] results) {
            Map<String, Medals> map = new HashMap<>();
            for (String s : results) {
                String[] data = s.split(" ");
                for (int k = 0; k < 3; k++) {
                    map.putIfAbsent(data[k], new Medals(data[k]));
                }
                map.get(data[0]).myGold += 1;
                map.get(data[1]).mySilver += 1;
                map.get(data[2]).myBronze += 1;
            }
            ArrayList<Medals> list = new ArrayList<>(map.values());
            Comparator<Medals> gold = Comparator.comparing(Medals :: getGold).reversed();
            Comparator<Medals> silver = Comparator.comparing(Medals :: getSilver).reversed();
            Comparator<Medals> bronze = Comparator.comparing(Medals :: getBronze).reversed();
            Comparator<Medals> country = Comparator.comparing(Medals :: getName);
            Comparator<Medals> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(country);
            Collections.sort(list,comp);

            String[] generate = new String[list.size()];
            for (int k = 0; k < generate.length; k++) {
                generate[k] = list.get(k).toString();
            }
            return generate;

        }
    }
