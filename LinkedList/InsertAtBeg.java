class InsertAtBeg
{
    static void printCList(Node head)
    {
        Node curr = head;
        System.out.println("[ " + curr + "]  (" + curr.data + " ," +curr.next + " )");
        curr = curr.next;
        while(curr != head)
        {
            System.out.println("[ " + curr + "]  ("+ curr.data + " ," + curr.next + " )");
            curr = curr.next;
        }
    }
    static Node insertAtBeg(Node head,int val)
    {
        Node temp  = new Node(val);
        if(head == null)
        {
            temp.next = temp;
            head = temp;
        }
        else
        {
            Node curr = head;
            while(curr.next != head)
            {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            head = temp;
        }
        return head;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head  = insertAtBeg(head,5);
        printCList(head);
    }
}