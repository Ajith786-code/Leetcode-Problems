/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ArrayList<Integer> list=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }

        Collections.sort(list);

        current=head;
        int index=0;
        while(current!=null){
            current.val=list.get(index);
            index++;
            current=current.next;
        }
        return head;
    }
}