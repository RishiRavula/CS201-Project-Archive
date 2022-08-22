import java.util.Locale;

public class ContainsList {
    public String check(ListNode first, ListNode second){
        String s1 = "";
        String s2 = "";
        while(first.next != null){
            s1 += first.info;
            first = first.next;
        }
        while(second.next != null){
            s2 += second.info;
            second = second.next;
        }
        s1.toLowerCase();
        s2.toLowerCase();
        boolean test = s1.contains(s2);
        if(test == true){
            return "YES";
        }
        else{
            return "NO";
        }

    }

}

