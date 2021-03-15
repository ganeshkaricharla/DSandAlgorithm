class SortedInsert
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

    static Node sortedInsert(Node head,int target)
    {   Node temp = new Node(target);
        if(head == null) return temp;
        if(head.data >= target)
        {
            temp.next = head;
            head = temp;
            return head;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data < target)
        {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;  
    }

    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = sortedInsert(head,25);
        printList(head);
    }
}