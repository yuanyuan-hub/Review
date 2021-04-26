public class ListReverse {
    public static  Node reverse(Node head) {
        Node newHead = null;
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node cueNext = cur.next;
            if(cueNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = cueNext;
        }
        return newHead;
    }
    public static void main(String[] args) {
        //构造链表
        Node head = new Node();
        head.val = 1;

        head.next = new Node();
        head.next.val = 2;

        head.next.next = new Node();
        head.next.next.val = 3;

        head.next.next.next = new Node();
        head.next.next.next.val = 4;
        //逆置链表
        Node reverseHead = reverse(head);

        //打印链表
        Node cur = reverseHead;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
