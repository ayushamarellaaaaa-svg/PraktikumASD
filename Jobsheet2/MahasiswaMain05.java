package Jobsheet2;

public class MahasiswaMain05 {
    public static void main(String[] args) {
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilInformasi();

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilInformasi();

        Mahasiswa05 mhs3 = new Mahasiswa05("Ayusha Marella", "254107060027", 4.00, "SIB 1C");
        mhs3.tampilInformasi();
    }
}
