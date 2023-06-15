package com.akmalzarkasyi.PBO.pertemuan4.Unguided;

class BukuNonFiksi extends Buku {
    private String topik;

    public BukuNonFiksi(){}
    public BukuNonFiksi(String judul, String pengarang, String topik) {
        super(judul, pengarang);
        this.topik = topik;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Topik: " + topik);
    }
}
