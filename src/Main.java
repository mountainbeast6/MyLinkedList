public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println(list);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(53);
        list.addIndex(2, 2);
        System.out.println(list);
        list.removeInt(4);
        System.out.println(list);

    }
}
