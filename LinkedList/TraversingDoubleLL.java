class TraversingDoubleLL
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
    public static void main(String[] args)
    {   
        DNode one = new DNode(10);
        DNode two = new DNode(20);
        DNode three = new DNode(30);
        one.next = two;
        two.next = three;
        two.prev = one;
        three.prev = two;

        DNode head = one;
        printDList(head);
    }
}