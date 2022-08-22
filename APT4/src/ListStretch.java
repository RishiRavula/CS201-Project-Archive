public class ListStretch
{
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

    public ListNode stretch (ListNode list, int amount){
        ListNode stretched = list;
        while (list != null){
            for (int i = 0; i < amount - 1; i++) {
                list.next = new ListNode(list.info, list.next);
                list = list.next;
            }
            list = list.next;
        }
        return stretched;
    }
}
