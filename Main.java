import java.util.Deque;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Deque<ListNode> stack = new LinkedList<>();
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        for(int i = 0; i < n; i++){
            stack.pop();
        }
        ListNode pre = stack.peek();
        pre.next = pre.next.next;
        return dummy.next;
    }
}
