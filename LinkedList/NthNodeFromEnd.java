class NthNodeFromEnd
{
    static int nthNodeFrom(Node head,int k)
    {
        Node first = head;
        for(int i = 0;i < k; i++)
        {
            if(first == null) return -1;
            first = first.next;
        }
        Node second = head;
        while(first  != null)
        {
            second = second.next;
            first = first.next;
        }
        return second.data;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int k = 2;
        System.out.print(nthNodeFrom(head,k)); 
    }
}