public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList mySLL = new SinglyLinkedList();
        mySLL.add(20);
        mySLL.add(10);
        mySLL.add(5);
        mySLL.add(7);
        mySLL.add(13);
        mySLL.remove();
        mySLL.remove();
        mySLL.printValues();
    }
}