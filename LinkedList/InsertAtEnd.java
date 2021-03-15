class InsertAtEnd
{
    
    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.println("[" + curr + "] --> " + "( " + curr.data +" , " + curr.next + " )");
            curr = curr.next;
        }
    }
    static Node insertAtEnd(Node head,int val)
    {
        Node temp = new Node(val);
        if(head == null)    return temp;
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static void main(String[] args) {
        
        Node one = new Node(10);
        one.next = new Node(20);
        one.next.next = new Node(40);

        Node head = one;
        head = insertAtEnd(head,80);
        printList(head);
    }
}