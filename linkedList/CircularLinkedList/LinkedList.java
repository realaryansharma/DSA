
import java.util.Scanner;

public class LinkedList {

    private Node head;
    private Node current;

    public static void main(String args[]) {

        LinkedList list = new LinkedList();
        Node obj = list.createLinkedList();
        list.traverseLinkedList(obj);

    }

    public Node createLinkedList() {
        System.out.println("--------------------------------");
        System.out.println("Circular Linked List");
        System.out.println("--------------------------------");

        System.out.print("Enter the number of nodes you want: ");
        Scanner input = new Scanner(System.in);

        int numOfNodes = input.nextInt();
        int start = 0;
        int data;

        this.head = null;
        this.current = null;

        while (start != numOfNodes) {
            System.out.println("Enter the data for node " + (start + 1));
            data = input.nextInt();

            Node newNode = new Node(data);

            if (start == 0) {
                head = newNode;
                current = head;
                head.next = null;
            } else {
                current.next = newNode;
                current = newNode;
                newNode.next = head;
            }

            start++;
        }
        return head;
    }

    public void traverseLinkedList(Node head) {
        System.err.println("------------------------Printing Linked List-----------------------------");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
