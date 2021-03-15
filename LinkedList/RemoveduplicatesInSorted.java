class RemoveDuplicatesInSorted
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

    static Node removeDuplicates(Node head)
    {
        Node curr = head;
        while(curr.next != null && curr != null)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            else
            {
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head = removeDuplicates(head);
        printList(head);
    }
}