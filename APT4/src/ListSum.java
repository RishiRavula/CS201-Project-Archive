public class ListSum {
    public class ListNode {
        int info;
        ListNode next;
        ListNode(int x){
            info = x;
        }
        ListNode(int x, ListNode node){
            info = x;
            next = node;
        }
    }


    public int sum(ListNode list, int thresh) {
        int sum = 0;
        while(list != null){
            if(list.info > thresh){
                sum += list.info;
            }
            list = list.next;
        }
        return sum;
    }
}
