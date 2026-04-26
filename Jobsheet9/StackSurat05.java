package Jobsheet9;

public class StackSurat05 {
    Surat05[] stack;
    int size;
    int top;

    public StackSurat05(int size) {
        this.size = size;
        stack = new Surat05[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat05 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack sudah penuh! Tidak bisa menerima surat lagi");
        }
    }

    public Surat05 pop() {
        if (!isEmpty()) {
            Surat05 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses");
            return null;
        }
    }

    public Surat05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada surat yang masuk");
        } else {
            for (int i = top; i >= 0; i--) {
                String jenis = (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 'I') ? "Sakit" : "Izin";
                System.out.printf("%-15s %-20s %-10s %-10s %-15s\n", stack[i].idSurat, stack[i].namaMahasiswa, stack[i].kelas, stack[i].jenisIzin, stack[i].durasi);
            }
        }
    }
}
