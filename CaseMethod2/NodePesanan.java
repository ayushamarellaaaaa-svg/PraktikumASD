package CaseMethod2;

public class NodePesanan {
    Pesanan data;
    NodePesanan next;
    NodePesanan prev;

    public NodePesanan(Pesanan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
