package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class sll {
    Node head;
    sll(){
        head = null;
    }

    void delete_end(){
        Node temp = head;
        if (head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    void delete_front(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        head=head.next;
    }

    void delete_at_pos(int pos){
        if(pos == 1){
            delete_front();
            return;
        }
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        int count=1;
        Node prev=null;
        while(temp != null && count<pos) {
            prev = temp;
            temp = temp.next;
            count += 1;
        }
        if(temp == null){
            System.out.println("invalid pos");
            return;
        }
        prev.next = temp.next;
    }
    public void insert_end(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newnode;
    }

    void print(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void insert_front(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void main(String[] args) {
        sll l = new sll();
        l.insert_end(10);
        l.insert_end(100);
        l.insert_end(50);
        l.print();
        l.insert_front(70);
        l.insert_front(60);
        l.print();
        l.delete_front();
        l.delete_end();
        l.print();
        l.delete_at_pos(2);
        l.print();
    }
}

