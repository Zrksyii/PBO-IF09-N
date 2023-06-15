package com.akmalzarkasyi.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 2000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 250000000);
        SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 235000000);

        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        System.out.println("Motor merk " + suzuki.getMerk() + "dengan tipe (before) :" + suzuki.getTipe());
        suzuki.setTipe("Satria FU");
        System.out.println("Motor merk " + suzuki.getMerk() + "dengan tipe (after) :" + suzuki.getTipe());
    }
}
