package Jobsheet5;

public class Sorting05 {
    int data[];
    int jmlData;

    Sorting05(int dt[], int jml) {
        data = dt;
        jmlData = jml;
    }

    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 1; j < jmlData - i; j++) {
                if (data[j] < data[j - 1]) {
                    int tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jmlData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < jmlData; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }
}
