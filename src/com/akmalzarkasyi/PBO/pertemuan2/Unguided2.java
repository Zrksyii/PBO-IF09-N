package com.akmalzarkasyi.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan gaji: ");
        double gaji = scanner.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = scanner.nextDouble();

        double pajak = 7.65;
        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * (pajak / 100);
        double gajiBersih = gajiKotor - pajakNegara;

        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Gaji kotor: " + gajiKotor);
        System.out.println("Pajak yang dipotong: " + pajakNegara);
        System.out.println("Gaji bersih: " + gajiBersih);

        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih + ".");

        scanner.close();
    }
}
