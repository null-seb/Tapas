package offer.easy;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head,int k){
        ListNode former=head,latter=head;
        for (int i=0;i<k;i++){
            if (former==null) return null;
            former=former.next;
        }
        while (former!=null){
            former=former.next;
            latter=latter.next;
        }
        return latter;
    }
}
