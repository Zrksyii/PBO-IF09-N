package com.akmalzarkasyi.PBO.pertemuan4.Inheritance;

public class Manajer extends Pegawai {
    public void bonus(int bonus) {
        System.out.println("Pegawai dengan nama : " + nama + "(" + nip + ") mendapat bonus sebesar Rp " + bonus);
    }
}
