package Jobsheet5;

public class MainTugasMahasiswa {
    public static void main(String[] args) {
        
        int uts[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int uas[] = {82, 88, 87, 79, 95, 85, 83, 84};

        TugasMahasiswa tm = new TugasMahasiswa(uts, uas);

        System.out.println("UTS Tertinggi: " + tm.utsTertinggi(0, uts.length-1));
        System.out.println("UTS Terendah: " + tm.utsTerendah(0, uts.length-1));
        System.out.println("Rata-rata UAS: " + tm.rataUas());
    }
}
