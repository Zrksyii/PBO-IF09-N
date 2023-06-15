package com.akmalzarkasyi.PBO.pertemuan4.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 20102224;
        manajer.nama = "Akmal";

        pegawai.nip = 20102224;
        pegawai.nama = "Zarkasyi";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(1000000);
        manajer.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
