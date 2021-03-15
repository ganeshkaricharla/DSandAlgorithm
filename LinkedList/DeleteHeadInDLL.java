class DeleteHeadInDLL
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
    static DNode deleteHeadInDLL(DNode head)
    {
        if(head == null || head.next == null) return null;

        head = head.next;
        head.prev = null;
        return head;
    }
    public static void main(String[] args)
    {
        DNode head = new DNode(10);
        head.next  = new DNode(20);
        head.next.prev = head;
        head.next.next = new DNode(30);
        head.next.next.prev = head.next;
        head = deleteHeadInDLL(head);
        printDList(head);
    }
}