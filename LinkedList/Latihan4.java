package LinkedList;

public class Latihan4 {

    static class Node {
        String data;
        Node prev;
        Node next;

        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // Tambah node di akhir DLL
    static void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Tampilkan dari depan ke belakang
    static void printForward() {
        Node temp = head;
        System.out.print("Maju  (head->tail): ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Tampilkan dari belakang ke depan menggunakan pointer prev
    static void printReverse() {
        Node temp = tail; // mulai dari tail
        System.out.print("Mundur (tail->head): ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.prev != null) System.out.print(" -> ");
            temp = temp.prev; // gunakan pointer prev
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Riwayat lagu: Rock <-> Jazz <-> Pop
        addLast("Rock");
        addLast("Jazz");
        addLast("Pop");

        printForward();
        printReverse();
    }
}
