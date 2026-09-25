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
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        l1=Reverse(l1);
        l2=Reverse(l2);
        ListNode ans=Add(l1, l2);
        return Reverse(ans);
    }
    public ListNode Reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode Add(ListNode l1, ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int d1=l1!=null?l1.val:0;
            int d2=l2!=null?l2.val:0;

            int sum=d1+d2+carry;
            ListNode nn=new ListNode(sum%10);
            carry=sum/10;

            temp.next=nn;
            temp=nn;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}