class MyLinkedList {

    private Node head;
    private Node  tail;
    private int size;


    private static class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val=val;
        }
    }

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;  
    }

    public Node node(int index){
        if(index< (size/2)){
            Node  current=head;

            for(int i=0; i<index; i++){
                current= current.next;
            }
            return current;
        }else{
            Node current=tail;

            for(int i=size-1;  i>index; i--){
                current=current.prev;
            }
            return current;
        }
    }
    
    public int get(int index) {
        if(index<0  ||  index>=size){
            return -1;
        }
        return node(index).val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);

        if(size==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode= new Node(val);


        if(tail==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }if(index==size){
            addAtTail(val);
            return;
        }

        Node nextNode=node(index);
        Node prevNode=nextNode.prev;

        Node newNode= new Node(val);

        newNode.next=nextNode;
        newNode.prev=prevNode;

        prevNode.next=newNode;
        nextNode.prev=newNode;

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 ||  index>=size){
            return;
        }
        if(size==1){
            head=null;
            tail=null;
        }else if(index==0){
            head=head.next;
            head.prev=null;
        }else if(index==size-1){
            tail=tail.prev;
            tail.next=null;
        }else{
            Node deleteNode=node(index);


            deleteNode.next.prev=deleteNode.prev;
            deleteNode.prev.next=deleteNode.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */