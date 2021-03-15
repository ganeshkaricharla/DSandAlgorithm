class DetectandRemoveLoopinLL
{
    static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.println("[" + curr + "] --> " + "( " + curr.data +" , " + curr.next + " )");
            curr = curr.next;
        }
    }

    static void removeLoopinLL(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        if(fast != slow) return;

        slow = head;
        while(fast.next != slow.next)
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        
        head.next.next.next.next.next.next = head.next.next;
        removeLoopinLL(head);
        printList(head);
    }
}