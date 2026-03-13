package Jobsheet5;

public class TugasMahasiswa {

    int uts[];
    int uas[];

    TugasMahasiswa(int uts[], int uas[]) {
        this.uts = uts;
        this.uas = uas;
    }

    int utsTertinggi(int l, int r) {
        if (l==r) {
            return uts[l];
        }

        int mid = (l + r) / 2;
        int kiri = utsTertinggi(l, mid);
        int kanan = utsTertinggi(mid + 1, r);

        if (kiri > kanan) {
            return kiri;
        } else {
            return kanan;
        }
    }

    int utsTerendah(int l, int r) {
        if (l==r) {
            return uts[l];
        }

        int mid = (l + r) / 2;
        int kiri = utsTerendah(l, mid);
        int kanan = utsTerendah(mid + 1, r);

        if (kiri < kanan) {
            return kiri;
        } else {
            return kanan;
        }
    }

    double rataUas() {
        double total = 0;

        for (int i = 0; i < uas.length; i++) {
            total = total + uas[i];
        }
        return total / uas.length;
    }
}
