class DeleteAtStartCLL
{
        static void printCList(Node head)
        {
            Node curr = head;
            System.out.println("[ " + curr + "]  (" + curr.data + " ," +curr.next + " )");
            curr = curr.next;
            while(curr != head)
            {
                System.out.println("[ " + curr + "]  ("+ curr.data + " ," + curr.next + " )");
                curr = curr.next;
            }
        }
        static Node deleteAtStartCLL(Node head,int val)
        {

            if(head == null || head.next== null) return null;
            head.data = head.next.data;
            head.next = head.next.next;
                        
            return head;
        }
        public static void main(String[] args)
        {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = head;
            head  = deleteAtStartCLL(head,5);
            printCList(head);
        }
}