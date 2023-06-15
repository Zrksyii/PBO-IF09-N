package com.akmalzarkasyi.PBO.pertemuan3.unguided;

import java.util.Scanner;

public class LayananHotel {
    public static void main(String[] args) {
        // Inisialisasi paket-paket wisata
        PaketKamar paket1 = new PaketKamar("Paket Hemat", "kamar standar, sarapan gratis setiap pagi, akses gratis ke fasilitas kolam renang", 1000000);
        PaketKamar paket2 = new PaketKamar("Paket Romantis", "kamar suite dengan pemandangan laut, Makan malam romantis di restoran hotel, Fasilitas spa gratis untuk 2 orang", 2000000);
        PaketKamar paket3 = new PaketKamar("Paket Keluarga", "Kamar keluarga, Sarapan gratis setiap pagi untuk seluruh keluarga, Aktivitas keluarga di area bermain anak-anak, Akses gratis ke klub pantai", 3000000);
        PaketKamarVIP paket4 = new PaketKamarVIP("Paket Hemat", "kamar standar, sarapan gratis setiap pagi, akses gratis ke fasilitas kolam renang", 1500000);
        PaketKamarVIP paket5 = new PaketKamarVIP("Paket Romantis", "kamar suite dengan pemandangan laut, Makan malam romantis di restoran hotel, Fasilitas spa gratis untuk 2 orang", 2500000);
        PaketKamarVIP paket6 = new PaketKamarVIP("Paket Keluarga", "Kamar keluarga, Sarapan gratis setiap pagi untuk seluruh keluarga, Aktivitas keluarga di area bermain anak-anak, Akses gratis ke klub pantai pribadi", 3500000);

        // Menampilkan informasi paket layanan
        tampilkanPaket(paket1);
        tampilkanPaket(paket2);
        tampilkanPaket(paket3);
        tampilkanPaketVIP(paket4);
        tampilkanPaketVIP(paket5);
        tampilkanPaketVIP(paket6);

        // Mengambil dua paket dan menjumlahkan biaya
        int totalBiaya = (paket1.getHarga() + paket2.getHarga() + paket3.getHarga() + paket4.getHarga() + paket5.getHarga() + paket6.getHarga());
        System.out.println("Total semua biaya: " + totalBiaya);
    }

    public static void tampilkanPaket(PaketKamar paket) {
        System.out.println("PAKET KAMAR REGULER");
        System.out.println("Nama paket: " + paket.getNamaPaket());
        System.out.println("Benefit: " + paket.getBenefit());
        System.out.println("Harga: " + paket.getHarga());
        System.out.println();
    }

    public static void tampilkanPaketVIP(PaketKamarVIP paket) {
        System.out.println("PAKET KAMAR VIP");
        System.out.println("Nama paket: " + paket.getNamaPaket());
        System.out.println("Benefit: " + paket.getBenefit());
        System.out.println("Harga: " + paket.getHarga());
        System.out.println();
    }
}

