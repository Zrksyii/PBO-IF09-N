package com.akmalzarkasyi.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unguided {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = scanner.nextInt();

            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = scanner.nextInt();

            int hasil = bilangan1 / bilangan2;
            System.out.println("Hasil pembagian: " + hasil);
            System.out.println("Proses berhasil bruh :)");

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid! Masukkan angka saja_-");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan pembagian! Tidak dapat membagi dengan nol.");
        }
        scanner.close();
    }
}