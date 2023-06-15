package com.akmalzarkasyi.PBO.pertemuan3.unguided;

public class PaketKamarVIP {
    private String namaPaket;
    private String benefit;
    private int harga;

    public PaketKamarVIP() {}

    public PaketKamarVIP(String namaPaket, String benefit, int harga) {
        this.namaPaket = namaPaket;
        this.benefit = benefit;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public String getBenefit() {
        return benefit;
    }

    public int getHarga() {
        return harga;
    }
}
