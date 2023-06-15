package com.akmalzarkasyi.PBO.pertemuan4.Unguided;

public class Buku {
    private String judul;
    private String pengarang;

    public Buku(){}
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
    }
}
