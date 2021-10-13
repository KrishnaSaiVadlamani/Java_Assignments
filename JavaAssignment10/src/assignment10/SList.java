package assignment10;

public class SList <T>{
    private Node<T> head=new Node<T>(null);
    SListIterator<T> iterator() { return new SListIterator<T>(head); }
    public String toString() {
        if(head.next == null) return "SList: Empty";
        SListIterator<T> iterator = this.iterator();
        StringBuilder sb = new StringBuilder("SList: ");
        while(iterator.hasNext()) {
            sb.append(iterator.next().getData());
            if(iterator.hasNext())
                sb.append("->");

        }
        return sb.toString();
    }
}
