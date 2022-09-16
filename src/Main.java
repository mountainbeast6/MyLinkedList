public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list);
        list.addFirst(5);
        list.addFirst(53);
        list.addFirst(54);
        list.addFirst(51);
        list.addFirst(57);
        System.out.println(list);
        list.addLast(4);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

    }
}
