package Jobsheet3;

public class dataDosen05 {
    void dataSemuaDosen(dosen05[] arrayDosen) {
        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayDosen[i].cetakData();
            System.out.println("----------------------");
        } 
    }

    void jumlahDosenSetiapJenisKelamin(dosen05[] arrayDosen) {
        int pria = 0;
        int wanita = 0;

        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rataRataUsiaDosen(dosen05[] arrayDosen) {
        int totalUsiaPria = 0;
        int jumlahPria = 0;
        int totalUsiaWanita = 0;
        int jumlahWanita = 0;

        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].jenisKelamin) {
                totalUsiaPria += arrayDosen[i].usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += arrayDosen[i].usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0 ) {
            System.out.println("Rata-rata usia dosen pria  : " + totalUsiaPria / jumlahPria);
        } else {
            System.out.println("Tidak ada dosen pria");
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata-rata usia dosen wanita : " + totalUsiaWanita / jumlahWanita);
        } else {
            System.out.println("Tidak ada dosen wanita");
        }
    }

    void dosenPalingTua(dosen05[] arrayDosen) {
        int tertua = 0;

        for (int i = 1; i < arrayDosen.length; i++) {
            if (arrayDosen[i].usia > arrayDosen[tertua].usia) {
                tertua = i;
            }
        }

        System.out.println("Dosen Paling Tua");
        arrayDosen[tertua].cetakData();
    }

    void dosenPalingMuda(dosen05[] arrayDosen) {
        int termuda = 0;

        for (int i = 1; i < arrayDosen.length; i++) {
            if (arrayDosen[i].usia < arrayDosen[termuda].usia) {
                termuda = i;
            }
        }

        System.out.println("Dosen Paling Muda");
        arrayDosen[termuda].cetakData();
    }
}
