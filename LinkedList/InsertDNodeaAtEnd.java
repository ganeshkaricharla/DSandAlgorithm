class InsertDNodeAtEnd
{
    static void printDList(DNode head)
    {
        DNode curr = head;
        while(curr != null)
        {
            System.out.print("[" + curr +" ]");
            System.out.print(" ( " + curr.prev + " ," + curr.data +" ," + curr.next + " )");
            System.out.println();
            curr = curr.next;
        }
    }
    static DNode insertDNodeAtEnd(DNode head,int val)
    {
        DNode temp = new DNode(val);
        if(head == null)
        {
            return temp;
        }
        DNode curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;

        return temp;
    }
    public static void main(String[] args)
    {
        DNode head = new DNode(10);
        head.next = new DNode(20);
        head.next.prev = head;
        head.next.next = new DNode(30);
        head.next.next.prev = head.next;
        insertDNodeAtEnd(head,40);
        printDList(head);
    }
}