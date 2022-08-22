import java.util.*;
public class SerialNumbers {
    public String[] sortSerials(String[] numbers) {
        SerialNumberComparator comp = new SerialNumberComparator();
        Arrays.sort(numbers,comp);
        return numbers;
    }
    public class SerialNumberComparator implements Comparator<String>{
        public int compare(String o1, String o2) {
            if(o1.length() < o2.length()){
                return -1;

            }
            else if(o1.length() > o2.length()){
                return 1;
            }
            else {
                if(sum(o1.toCharArray()) < sum(o2.toCharArray()))
                return -1;
                else if(sum(o1.toCharArray()) > sum(o2.toCharArray())){
                return 1;
                }
                else{
                    return o1.compareTo(o2);
                }
            }
        }
    }

    public int sum(char[] nums){
        int sum = 0;
        for(char i:nums){
            if(Character.isDigit(i)){
                sum += Character.getNumericValue(i);
            }
        }
        return sum;
    }
}
