package com.akmalzarkasyi.PBO.pertemuan3;

public class SepedaMotor {
    private String merk;
    private String tipe;
    private int harga;

    public SepedaMotor() {
    }

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public SepedaMotor(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void showInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Merk : " + tipe);
        System.out.println("Merk : " + harga);
        System.out.println();
    }
}
