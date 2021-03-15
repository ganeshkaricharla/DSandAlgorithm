class DeleteFirstNode
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
    static Node deleteFirstNode(Node head)
    {
        if(head == null) return head;

        head = head.next;

        return head;
    }
    public static void main(String[] args)
    {
        Node one = new Node(10);
        one.next = new Node(20);
        one.next.next = new Node(40);
        Node head = one;
        head = deleteFirstNode(head);
        printList(head);
        
    }
}