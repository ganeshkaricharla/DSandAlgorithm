class DeleteKthNodeCLL
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
    static Node deleteKthNode(Node head,int pos)
    {
        if(head == null || head.next == null) return null;

        if(pos == 1)
        {
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }
        else
        {
            Node curr = head;
            for(int i = 0;i < (pos-2); i++)
            {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            return head;
        }
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head  = deleteKthNode(head,2);
        printCList(head);
    }
}