class SearchInLLInterative
{
    static boolean searchInLLIterative(Node head,int target)
    {
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == target)
            {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Node one = new Node(10);
        one.next = new Node(20);
        one.next.next = new Node(30);
        one.next.next.next = new Node(40);
        Node head = one;
        System.out.print(searchInLLIterative(head,40));
    }
}