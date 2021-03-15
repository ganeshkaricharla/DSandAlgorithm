class ReverseDLL
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
    static DNode reverseDLL(DNode head)
    {
        if(head == null || head.next == null) return head;

        DNode curr = head;
        DNode inf = null;
        while(curr != null)
        {
            inf =  curr.prev;
            curr.prev = curr.next;
            curr.next = inf;
            curr = curr.prev; 
        }
        return inf.prev;
    }
    public static void main(String[] args) {
        DNode head = new DNode(10);
        head.next = new DNode(20);
        head.next.prev = head;
        head.next.next = new DNode(30);
        head.next.next.prev = head.next;
        printDList(head);
        head = reverseDLL(head);
        printDList(head);
    }
}