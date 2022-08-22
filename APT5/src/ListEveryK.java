public class ListEveryK {
    public int sumTheKth(ListNode list, int k){
        int sum = 0;
        while(list.next != null){
            for(int i = 0; i < k-1; i++){
               if(list.next = null){
                   list = list.next.next;
               }
            }
            if(list = null) {
                sum += list.info;
            }
           list = list.next;
        }
        return sum;
    }
}
