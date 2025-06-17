import java.util.ArrayList;


public class revLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    //head
    private Node head=null;
    //insetAtbeg()
    public void insertAtbeg(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    }
    //display
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println(" null");
    }

    public static void main(String[] args){
        revLinkedList rv=new revLinkedList();
        rv.insertAtbeg(5);
        rv.insertAtbeg(10);
        rv.insertAtbeg(4);
        rv.insertAtbeg(15);
        rv.display();
        

    }
}
