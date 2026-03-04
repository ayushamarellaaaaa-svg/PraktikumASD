package QuizPraktikum;

public class dataAksesoris05 {
    void dataSemuaAksesoris(Aksesoris05[] arrayAksesoris05) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Data Aksesoris ke-" + (i + 1));
            arrayAksesoris05[i].tampil();
            System.out.println("----------------------");
        }
    }

    void hitungTotalPenjualan(Aksesoris05[] arrayAksesoris05) {
        int totalHarga = 0;

        for (int i = 0; i < 5; i++) {
            totalHarga = arrayAksesoris05[i].harga * arrayAksesoris05[i].terjual;
        }

        System.out.println("Total Penjualan: " + totalHarga);
    }

    void aksesorisTerMahal(Aksesoris05[] arrayAksesoris05) {
        int terMahal = 0;

        for (int i = 1; i < 4; i++) {
            if (arrayAksesoris05[i].harga > arrayAksesoris05[terMahal].harga) {
                terMahal = i;
            }
        }

        System.out.println("Aksesoris Paling Mahal");
        arrayAksesoris05[terMahal].tampil();
    }

    void cekStok(Aksesoris05[] arrayAksesoris05) {
        for (int i = 0; i < 4; i++) {
            arrayAksesoris05[i].tampil();
            if (arrayAksesoris05[i].stok > 5) {
                System.out.println("Stok masih banyak");
            } else {
                System.out.println("Stok limited");
            }
            System.out.println();
        }
    }
}
