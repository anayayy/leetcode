class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    Node head=new Node(0);
    int size=0;

    public MyLinkedList() {}

    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp=head.next;
        for(int i=0;i<index;i++) temp=temp.next;
        return temp.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index>size) return;
        if(index<0) index=0;
        Node temp=head;
        for(int i=0;i<index;i++) temp=temp.next;
        Node n=new Node(val);
        n.next=temp.next;
        temp.next=n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        Node temp=head;
        for(int i=0;i<index;i++) temp=temp.next;
        temp.next=temp.next.next;
        size--;
    }
}