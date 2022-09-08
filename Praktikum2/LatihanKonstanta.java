/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanvariabel;

/**
 *
 * @author HP
 */
public class LatihanKonstanta {

    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";

    public static void main(String args[]) {
        //KURS_DOLLAR = 13500; 

        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/* 

Apa yang salah dengan source code tersebut?

Yang salah adalah source code tersebut menggunakan final, 
yang dimana nilai final adalah constant (sekali definisi).
Jadi apabila didefinisikan lebih dari sekali akan terjadi 
error dan dalam source code tersebut variabel KURS_DOLLAR
didefinisikan lebih dari sekali.




Apa maksud penggunaan keyword static sebelum keyword 
final pada deklarasi variabel tersebut?

Penggunaan keyword static adalah untuk memanggil variabel 
dalam class tertentu tanpa membuat objek dari class tersebut.

 */
