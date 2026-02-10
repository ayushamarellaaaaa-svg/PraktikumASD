import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLong();

        n = (int) (nim % 100);

        System.out.println("Nilai n = " + n);
        System.out.print("Output : ");

        for (int i = 1; i <= n; i++) {
            if (i== 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}


