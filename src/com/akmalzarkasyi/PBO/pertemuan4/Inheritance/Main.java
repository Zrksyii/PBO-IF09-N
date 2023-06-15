package com.akmalzarkasyi.PBO.pertemuan4.Inheritance;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();

        manajer.nip = 20102224;
        manajer.nama = "Akmal Zarkasyi";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(1000000);
    }
}
