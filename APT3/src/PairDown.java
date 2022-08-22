public class PairDown {
    public int[] fold(int[] list) {
        if(list.length% 2 == 1){ //ODD
            int i = 0;
            int index = 0;
            int [] pairs = new int[(list.length +1)/2];
            while(i < list.length - 1){
                pairs[index] = list[i] + list[i+1];
                index++;
                i += 2;
            }
            pairs[pairs.length - 1] = list[list.length - 1] + 0;
            return pairs;
        }
        else{ //EVEN
            int [] pairs = new int[(list.length)/2];
            int index = 0;
            for(int i = 0; i < list.length; i += 2){
                pairs[index] = list[i] + list[i+1];
                index++;
            }
            return pairs;


        }

    }
}
