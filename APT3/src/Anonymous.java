public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int howMany = 0;
        int[] available = getCounts(headlines);
        for(int i = 0; i < messages.length; i++){
            boolean works = true;
            int[] needs = getCounts(messages[i].split(" "));
            for(char c = 'a'; c <= 'z'; c++){
                if(needs[c] > available[c]){
                    works = false;
                }

            }
            if(works == true){
                howMany++;
            }

        }
        return howMany;


    }
    private int[] getCounts(String[] headlines) {
        int[] counts = new int[300];
        for(String s : headlines) {
            for(char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
        return counts;

    }
}
