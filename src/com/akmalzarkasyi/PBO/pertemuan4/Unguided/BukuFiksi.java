package com.akmalzarkasyi.PBO.pertemuan4.Unguided;

class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(){}
    public BukuFiksi(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}