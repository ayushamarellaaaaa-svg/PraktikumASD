package Jobsheet5;

public class MahasiswaBerprestasi05 {
    Mahasiswa05 listMhs[];
    int idx;

    MahasiswaBerprestasi05(int n) {
        listMhs = new Mahasiswa05[n];
        idx = 0;
    }

    void tambah(Mahasiswa05 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa05 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int min = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[min].ipk) {
                    min = j;
                }
            }
            Mahasiswa05 tmp = listMhs[min];
            listMhs[min] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // void insertionSort() {
    // for (int i = 1; i < idx; i++) {
    // Mahasiswa05 temp = listMhs[i];
    // int j = i;
    // while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
    // listMhs[j] = listMhs[j - 1];
    // j--;
    // }
    // listMhs[j] = temp;
    // }
    // }

    void insertionSortDesc() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa05 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("data mahasiswa dengan ipk " + x + " tidak dtemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;

            if (listMhs[mid].ipk == cari) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, mid +1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
}
