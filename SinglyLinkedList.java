public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        Node head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        if (head == null) {
            System.out.println("Singly Linked List is empty.");
        }
        else {
            Node runner = head;
            Node previous = head;
            while (runner.next != null) {
                previous = runner;
                runner = runner.next;
            }
            previous.next = null;
        }
    }
    public void printValues() {
        if (head == null) {
            System.out.println("Singly Linked List is empty.");
        }
        else {
            String printString = "";
            Node runner = head;
            while (runner != null) {
                int value = runner.getValue();
                printString += value;
                printString += ">";
                runner = runner.next;
            }
            System.out.println(printString);
        }
    }
}
