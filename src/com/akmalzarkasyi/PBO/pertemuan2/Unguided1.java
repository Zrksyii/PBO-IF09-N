package com.akmalzarkasyi.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided1 {
    public static void main(String[] args) {
        // Username dan password yang valid
        String username = "akmal";
        String password = "123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        } else if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil! Silakan masuk.");
        } else {
            System.out.println("Username dan password Anda salah.");
        }

        scanner.close();
    }
}

