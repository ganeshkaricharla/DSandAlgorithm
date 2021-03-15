class InsertAtGivenPosition
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

    static Node insertAtGivenPosition(Node head,int pos,int val)
    {
        Node temp = new Node(val);
        if(pos == 1)
        {
            temp.next = head;
            head = temp;
            return head;
        }

        Node curr = head;
        int i = 1;
        while(i != (pos-1)  && curr != null)
        {
            curr = curr.next;
            i++;
        }
        if(curr == null)
        {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
    public static void main(String[] args)
    {
        Node one = new Node(10);
        one.next = new Node(20);
        one.next.next = new Node(40);
        one.next.next.next = new Node(50);
        Node head = one;
        head = insertAtGivenPosition(head,3,30);
        printList(head);

    }
}