public class MyLinkedList<T>{
    private MyListNode<T> first;
    private MyListNode<T> last;
    int size=0;
    public MyLinkedList(){
        first=null;
        last=null;
    }
    public void addFirst(T data){
        MyListNode<T>temp = new MyListNode<>(data);
        if(first==null&&last==null){
            first =temp;
            last=temp;
        }
        else {
            temp.setNext(first);
            first=temp;
        }
    }
    public void addLast(T data){
        MyListNode<T>temp = new MyListNode<>(data);
        if(first==null&&last==null){
            first=temp;
            last=temp;
        }
        else{
            last.setNext(temp);
            last=temp;
        }
    }
   /* public T removeLast(){
        for(int i=0; i<getSize();i++){

        }
    }
    */

    public int getSize(){
        return size;
    }
    public String toString() {
        String out ="";
        MyListNode<T>current=first;
        while(current!=null){
            out+=current.getData()+"=>";
            current= current.getNext();
        }
        out+="null";
        return out;
    }
}
