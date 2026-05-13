package CaseMethod2;

public class Pembeli {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public Pembeli(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    void tampilInformasi() {
        System.out.printf("%-15d %-20s %-15s%n", noAntrian, namaPembeli, noHp);
    }
}
