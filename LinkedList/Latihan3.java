package LinkedList;

public class Latihan3 {

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

    // Hapus node terakhir
    static void removeLast() {
        if (head == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        if (head.next == null) {
            // Hanya 1 node
            System.out.println("Lagu dihapus: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Lagu dihapus: " + temp.next.data);
        temp.next = null; // putus sambungan ke node terakhir
    }

    // Cetak semua isi linked list
    static void print() {
        Node temp = head;
        System.out.print("Isi playlist: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Playlist awal: LaguA -> LaguB -> LaguC
        addLast("LaguA");
        addLast("LaguB");
        addLast("LaguC");
        System.out.print("Sebelum penghapusan -> ");
        print();

        // Hapus lagu terakhir (LaguC)
        removeLast();
        System.out.print("Setelah penghapusan -> ");
        print();
    }
}
