class Traverse
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
    public static void main(String[] args) {
        Node one = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);

        one.next = two;
        two.next = three;

        printList(one);
    }
}