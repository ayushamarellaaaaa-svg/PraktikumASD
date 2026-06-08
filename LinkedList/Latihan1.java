package LinkedList;

public class Latihan1 {

    // Node untuk Single Linked List
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Tambah node di akhir
    static void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Hitung total node
    static int countNodes() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Isi gerbong: A, B, C
        addLast("A");
        addLast("B");
        addLast("C");

        System.out.println("Isi rangkaian gerbong: A -> B -> C");
        System.out.println("Total jumlah gerbong: " + countNodes());
    }
}
