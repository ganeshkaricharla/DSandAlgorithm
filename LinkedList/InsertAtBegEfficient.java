class InsertAtBegEfficient
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
    static Node insertAtBegeff(Node head,int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            temp.next = temp;
            head = temp;
        }
        else
        {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
        }
        return head;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head  = insertAtBegeff(head,5);
        printCList(head);
    }
}