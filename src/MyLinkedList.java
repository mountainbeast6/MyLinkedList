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
        size++;
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
        size++;
    }
   public T removeLast(){
       MyListNode<T>temp1 = first;
       MyListNode<T>temp2 = temp1.getNext();
       for(int i=0; i<size-2;i++){
            temp1=temp2;
            temp2=temp2.getNext();
        }
       temp1.setNext(null);
       size--;
       return temp2.getData();
    }
    public void addIndex(int loc, T data){
        MyListNode<T>temp1 = first;
        MyListNode<T>temp2 = temp1.getNext();
        MyListNode<T>temp3 = new MyListNode<>(data);
        if(loc==1) {
            addFirst(data);
        }
        else if(loc==size+1) {
            addLast(data);
        }
        else {
            for (int i = 0; i < loc - 2; i++) {
                temp1 = temp2;
                temp2 = temp2.getNext();
            }
            temp1.setNext(temp3);
            temp3.setNext(temp2);
        }
        size++;
    }

    public T removeFirst(){
        MyListNode<T>temp1 = first;
        first=first.getNext();
        size--;
        return temp1.getData();
    }

    public T removeInt(int loc){
        if(size==loc){
            return removeLast();

        }
        else if(loc>size){
         throw new NullPointerException("Too big of a number dumbass");
        }
        else if (loc<=0){
            throw new NullPointerException("Too small of a number dumbass");
        }
        else if(loc==1){
            return(removeFirst());
        }
        else if(size<3){
            MyListNode<T> temp1 = first.getNext();
            first.setNext(last);
            return temp1.getData();
        }
        else {
            MyListNode<T> temp1 = first;
            MyListNode<T> temp2 = temp1.getNext();
            MyListNode<T> temp3 = temp2.getNext();
            for (int i = 0; i < loc - 2; i++) {
                temp1 = temp2;
                temp2 = temp2.getNext();
                temp3 = temp3.getNext();
            }
            temp1.setNext(temp3);
            size--;
            return temp2.getData();
        }
    }

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
