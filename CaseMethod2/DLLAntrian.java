package CaseMethod2;

public class DLLAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int size;

    public DLLAntrian() {
        this.head = null;
        this.tail = null;
        this.size = 0;

        tambahAntrian("Ainra","08224500000");
        tambahAntrian("Danra", "08224511111");
        tambahAntrian("Sanri", "08224522222");
        tambahAntrian("Vania", "082245333333");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int tambahAntrian(String namaPembeli, String noHp) {
        int noAntrian = size + 1;
        Pembeli pembeli = new Pembeli(noAntrian, namaPembeli, noHp);
        NodeAntrian newNode = new NodeAntrian(pembeli);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return noAntrian;
    }

    public void renumberateAntrian() {
        NodeAntrian current = head;
        int noAntrian = 1;
        while (current != null) {
            current.data.noAntrian = noAntrian++;
            current = current.next;
        }
    }

    public Pembeli hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli Dilayani = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        renumberateAntrian();
        return Dilayani;
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("----------------------");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama Pembeli", "No HP");
        NodeAntrian current = head;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
        System.out.println("");
    }
}
