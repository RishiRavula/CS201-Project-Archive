public class PellSequence {
    public String isPellLike(int [] seq){
        for(int i = 2; i < seq.length; i++){
            if(seq[i] != ((2*seq[i-1]) + seq[i-2])){
                return "No";
            }
        }
        return "Yes";

    }

}
