class SearchInLLRecursion
{
    static boolean searchInLLRecursion(Node head,int target)
    {
        if(head == null) return false;
        if(head.data == target)
        {
            return true;
        }
        else
        {
            return searchInLLRecursion(head.next,target);
        }
    }
    public static void main(String[] args)
    {
        Node one = new Node(10);
        one.next = new Node(20);
        one.next.next = new Node(30);
        one.next.next.next = new Node(40);
        Node head = one;
        System.out.print(searchInLLRecursion(head,50));
    }
}