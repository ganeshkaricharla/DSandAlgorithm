class AddNodeAtBegining
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
    static Node insertAtBegining(Node head,int val)
    {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        Node one = new Node(10);
        one.next = new Node(20);
        one.next.next = new Node(30);
        Node head = one;
        head = insertAtBegining(head,5);
        printList(head);
    }
}