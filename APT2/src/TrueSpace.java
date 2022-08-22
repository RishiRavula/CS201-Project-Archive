public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long total = 0;
        int n = 0;
        for(int x : sizes) {
            if (x != 0) {
                n = x / clusterSize;
                if (x % clusterSize != 0){
                    n+=1;
                }
                total += clusterSize*n;


            }

        }
        return total;
    }
}
