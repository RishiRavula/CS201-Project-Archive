public class DoubleList {
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

    public ListNode bigify(ListNode list) {
        ListNode bigify = list;
        while (list != null){
            list.next = new ListNode(list.info, list.next);
            list = list.next.next;
        }
        return bigify;

    }
}
