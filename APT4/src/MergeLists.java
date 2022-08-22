public class MergeLists {
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

    public ListNode weave (ListNode a, ListNode b) {
        ListNode weaved = a;
        while(a != null){
            a.next = new ListNode(b.info, a.next);
            b = b.next;
            a = a.next.next;
        }

        return weaved;
    }
}
