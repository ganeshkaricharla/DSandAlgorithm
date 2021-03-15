class TraverseCLL
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
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head.next.next.next = head;

        printCList(head);
    }
}