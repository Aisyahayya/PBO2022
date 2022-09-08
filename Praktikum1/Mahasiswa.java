/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mahasiswa;

/**
 *
 * @author HP
 */
public class Mahasiswa {
String NIM;
String Nama;
String Jenis_Kelamin;
String Alamat;

    void isiData(String Nama, String NIM, String Jenis_Kelamin, String Alamat) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Jenis_Kelamin = Jenis_Kelamin;
        this.Alamat = Alamat;
    }

    void printData() {
        System.out.println(this.Nama);
        System.out.println(this.NIM);
        System.out.println(this.Jenis_Kelamin);
        System.out.println(this.Alamat);
    }

    public static void main(String[] args) {
        Mahasiswa Aisyah = new Mahasiswa();
    
        Aisyah.isiData("Aisyah Hayya Imani", "M0521008", "Perempuan", "Nitikan Baru, Yogyakarta");
        Aisyah.printData();
    }
}
