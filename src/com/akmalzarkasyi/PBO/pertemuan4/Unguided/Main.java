package com.akmalzarkasyi.PBO.pertemuan4.Unguided;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n== Manajemen Perpustakaan ==");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Lihat Daftar Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Judul: ");
                String judul = scanner.next();
                System.out.print("Pengarang: ");
                String pengarang = scanner.next();
                System.out.print("Genre: ");
                String genre = scanner.next();

                BukuFiksi bukuFiksi = new BukuFiksi(judul, pengarang, genre);
                daftarBuku.add(bukuFiksi);

                System.out.println("Buku Fiksi berhasil ditambahkan!");
            } else if (pilihan == 2) {
                System.out.print("Judul: ");
                String judul = scanner.next();
                System.out.print("Pengarang: ");
                String pengarang = scanner.next();
                System.out.print("Topik: ");
                String topik = scanner.next();

                BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, pengarang, topik);
                daftarBuku.add(bukuNonFiksi);

                System.out.println("Buku Non-Fiksi berhasil ditambahkan!");
            } else if (pilihan == 3) {
                System.out.println("\n== Daftar Buku ==");
                if (daftarBuku.isEmpty()) {
                    System.out.println("Tidak ada buku yang tersedia.");
                } else {
                    for (Buku buku : daftarBuku) {
                        buku.displayInfo();
                        System.out.println("------------");
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
