/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kubus;

/**
 *
 * @author HP
 */
public class Kubus {
    int sisiKubus = 5;
    
    public Double hitungVolume(){
        Double volume = 1.0 * this.sisiKubus * this.sisiKubus * this.sisiKubus;
        return volume;
    }
    
    public int hitungLuasPermukaan(){
        int luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        
        System.out.println("sisi :" +kubus.sisiKubus);
        System.out.println("volume :"+kubus.hitungVolume());
        System.out.println("lua permukaan :"+kubus.hitungLuasPermukaan());
    }
}
