class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    private Node head;

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Node getHead() {
        return head;
    }

    public static Node arrayToList(int[] nums) {
        Linkedlist list = new Linkedlist();
        for (int num : nums) {
            list.insertEnd(num);
        }
        return list.getHead();
    }
}

public class Main {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40};
        Node head = Linkedlist.arrayToList(nums);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}