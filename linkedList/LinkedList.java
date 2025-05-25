import java.util.Scanner;

public class LinkedList {
    private Node head;
    private Node current;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createLinkedList();
    }

    public void createLinkedList() {
        System.out.println("--------------------------------");
        System.out.println("Linked List");
        System.out.println("--------------------------------");

        System.out.println("How many nodes do you want to create?");
        Scanner scanner = new Scanner(System.in);
        int numberOfNodes = scanner.nextInt();

        for (int i = 0; i < numberOfNodes; i++) {
            System.out.println("Enter the data for node " + (i + 1) + ":");
            int data = scanner.nextInt();
            Node newNode = new Node(data);

            if (i == 0) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }

            System.out.println("Node " + (i + 1) + " created successfully");
            System.out.println("--------------------------------");
            System.out.println("Current List: ");
            this.displayList();
            System.out.println("--------------------------------");
        }
    }

    public void displayList() {
        Node traversNode = head;
        while (traversNode != null) {
            System.out.println(traversNode.data);
            traversNode = traversNode.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}