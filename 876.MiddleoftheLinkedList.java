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
    /*
    Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
    */
    public ListNode middleNode(ListNode head) {
        // find the size of the Linked list
        int count = 0;
        ListNode currnet = head;
        while(currnet!=null){
            count++;
            currnet= currnet.next;
        }
        
        // find the middle if it has two mids returns the second
        int mid =0;
        int now=0;
        if(count%2==0){
            mid=(count/2) +1;
        }else if(count%2!=0){
            mid =count/2;
            now=-1;
        }
        
        //iterate when reach the mid to return it
        currnet= head;   
        while(currnet!=null){
            now++;
            if(now==mid){
                return currnet;
            }
            currnet= currnet.next;
        }     
        return null; 
    }
}
