package CaseMethod2;

public class DLLPesanan {
    NodePesanan head;
    NodePesanan tail;

    public DLLPesanan() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kodePesanan, String namaPesanan, String namaPembeli, int harga) {
        Pesanan pesanan = new Pesanan(kodePesanan, namaPesanan, namaPembeli, harga);
        NodePesanan newNode = new NodePesanan(pesanan);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int getSize() {
        int jumlah = 0;
        NodePesanan current = head;
        while (current != null) {
            jumlah++;
            current = current.next;
        }
        return jumlah;
    }

    public void sortByNamaPesanan() {
        int n = getSize();

        for (int i = 0; i < n - 1; i++) {
            NodePesanan current = head;
            for (int j = 0; j < n - i - 1; j++) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
        }
    }

    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortByNamaPesanan();

        System.out.println("Laporan Pesanan");
        System.out.println("----------------------");
        System.out.printf("%-15s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan current = head;
        int totalHarga = 0;

        while (current != null) {
            current.data.tampilInformasi();
            totalHarga += current.data.harga;
            current = current.next;
        }
        System.out.printf("\nTotal Penjualan: " + totalHarga + "");
        System.out.println("");
    }
    
}
