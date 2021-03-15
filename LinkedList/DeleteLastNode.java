class DeleteLastNode
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
    static Node deleteLastNode(Node head)
    {
        if(head == null) return head;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node list = new Node(10);
        list.next = new Node(20);
        list.next.next = new Node(40);
        Node head = list;
        head = deleteLastNode(head);
        printList(head);
    }
}