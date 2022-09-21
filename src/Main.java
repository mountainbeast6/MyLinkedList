public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list);
        list.addFirst(5);
        list.addFirst(53);
        list.addFirst(54);
        list.removeInt(3);
        System.out.println(list);
        list.addIndex(1,2);
        System.out.println(list);
    }
}
