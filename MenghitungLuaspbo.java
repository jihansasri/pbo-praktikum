import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
       int menu = input.nextInt();
        
        
        switch(menu){
            case 1:
                Persegi persegi = new Persegi();
                int sisi = input.nextInt();
                persegi.setSisi(sisi);
                System.out.println((int)persegi.hitungLuas());
                break;
            case 2:
                Segitiga segitiga = new Segitiga();
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                segitiga.setAlas(alas);
                segitiga.setTinggi(tinggi);
                System.out.println((int)segitiga.hitungLuas());
                break;
            case 3: 
                Lingkaran lingkaran = new Lingkaran();
                int jari = input.nextInt();
                lingkaran.setJari(jari);
                System.out.println((int)lingkaran.hitungLuas());
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
    }
    }
    
}

class Persegi {
    private double sisi;
    
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double hitungLuas(){
        return (sisi * sisi);
    }
}

class Segitiga {
    private double alas;
    private double tinggi;
    
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas = alas;
        
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }
}

class Lingkaran {
    private double jari;
    
    public double getJari(){
        return jari;
    }
    public void setJari(double jari){
        this.jari = jari;
    }
    public double hitungLuas(){
        
        double luas = 0;
        if(jari % 7 == 0){
                luas = 22/7*jari*jari;
            } else{
                luas = (3.14*jari*jari);
            }
        return luas;
    }
}

    
