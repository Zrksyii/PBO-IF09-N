package com.akmalzarkasyi.PBO.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array tisak segede itu");
        }
        System.out.println("Proses selesai!");
    }
}
