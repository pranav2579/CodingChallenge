/**
 * Created by Pranav on 14/05/16.
 */

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

class LinkedList {
    public static  Node insert(Node head,int data)
    {
        //Complete this method
        if(head == null){
            Node nodeToInsert = new Node(data);
            head = nodeToInsert;
            return head;
        }
        Node start = head;
        while(start.next != null){
            start = start.next;
        }
        Node nodeToInsert = new Node(data);
        start.next = nodeToInsert;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
