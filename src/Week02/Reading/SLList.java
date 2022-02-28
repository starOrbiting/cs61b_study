package Week02.Reading;

// 链表
public class SLList {
    public IntNode first;
    public SLList(int x){
        first = new IntNode(x, null);

    }
    public int getFirst(){
        return first.item;
    }
    public void addFirst(int x){
        first = new IntNode(x, first);

    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
    }
}
