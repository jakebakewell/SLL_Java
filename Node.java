public class Node {
    public int value;
    public Node next;
    public Node () {}
    public Node (int value) {
        this.value = value;
    }
    public Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
}
