package CaseMethod2;

public class NodeAntrian {
    Pembeli data;
    NodeAntrian next;
    NodeAntrian prev;

    public NodeAntrian(Pembeli data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
