import java.util.*;
public class FruitPageant {
   String myName;
   int myFreqs;
   int mySize;
    public  FruitPageant(String name){
        myName = name;
        myFreqs = 1;
        mySize = name.length();
    }

    public int getMyFreqs() {
        return myFreqs;
    }

    public int getMySize() {
        return mySize;
    }

    public String getMyName() {
        return myName;
    }

    public static String[] theBest(String[] votes){
        TreeMap<String,FruitPageant> fruits = new TreeMap<>();
        for(String s : votes){
            String[] fruit = s.split(":");
            if(!fruits.containsKey(fruit[1])){
                fruits.put(fruit[1],new FruitPageant(fruit[1]));
            }
            else{
                fruits.get(fruit[1]).myFreqs+=1;
            }


        }

        //parse out minimums

        int max = 0;

        for(FruitPageant i : fruits.values()){
            if(max < i.myFreqs){
                max = i.myFreqs;
            }
        }
        ArrayList<FruitPageant> list = new ArrayList<>();
        for(FruitPageant i : fruits.values()){
            if(i.myFreqs == max){
                list.add(i);
            }
        }


        Comparator<FruitPageant> frequency = Comparator.comparing(FruitPageant :: getMyFreqs).reversed();
        Comparator<FruitPageant> length = Comparator.comparing(FruitPageant :: getMySize);
        Comparator<FruitPageant> alpha = Comparator.comparing(FruitPageant :: getMyName);

        Collections.sort(list, frequency.thenComparing(length.thenComparing(alpha)));
        String [] ret = new String[list.size()];
        for(int i = 0; i < ret.length; i++ ){
            ret[i] = list.get(i).getMyName();
            System.out.print(ret[i] + " ");
        }





        return ret;
    }

    public static void main(String args[]) {

        String[] votes = {"Vanessa:banana", "Kegan:strawberry", "Laura:orange"};
        theBest(votes);
    }
}