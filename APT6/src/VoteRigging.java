import java.util.*;
public class VoteRigging {
    public int minimumVotes(int[] votes){
       if(votes.length == 1){
           return 0;
       }
       int req = 0;
       int ourCount = votes[0];

       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i = 1; i < votes.length; i++){
           pq.add(votes[i]);
       }
       int winCount = pq.remove();
       while(ourCount <= winCount){
           winCount--;
           pq.add(winCount);
           ourCount++;
           req++;
           winCount = pq.remove();
       }
       return req;
    }
}
