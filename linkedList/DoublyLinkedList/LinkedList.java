
import java.util.Scanner;

public class LinkedList {

    private Node head;
    private Node current;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node obj = list.createLinkedList();
        list.traverseLinkedList(obj);
    }

    public Node createLinkedList() {
        System.out.println("--------------------------------");
        System.out.println("Doubly Linked List");
        System.out.println("--------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to create: ");
        int needNodes = scanner.nextInt();
        int start = 0;

        if (needNodes > 0) {
            this.head = null;
            this.current = null;
            
            while (start != needNodes) {
                System.out.println("Enter the data for node " + (start));
                int data = scanner.nextInt();

                Node newNode = new Node(data);

                if (start == 0) {
                    head = newNode;
                    current = newNode;
                } else {
                    current.next = newNode;
                    newNode.prev = current;
                    current = newNode;
                }
                start++;
            }

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

    class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

}
