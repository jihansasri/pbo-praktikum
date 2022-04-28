import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        String menu = input.nextLine();
        switch (menu) {
            case "1":
                double sisi= input.nextDouble();
                int luas1 = (int) luaspersegi(sisi);
                System.out.println(luas1);
                break;
            case "2":
                double alas = input.nextDouble();
                double tinggi = input.nextDouble();
                int luas2 = (int) luassegitiga(alas, tinggi);
                System.out.println(luas2);
                break;
            case "3":
                double r = input.nextDouble();
                System.out.println(luaslingkaran(r));
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
    }
    }
    public static double luaspersegi(double sisi){
        double luas = sisi*sisi;
        return luas;
    }
    
    public static double luassegitiga(double alas, double tinggi){
        double luas = (alas*tinggi)/2;
        return luas;
    }
    
    public static double luaslingkaran(double r){
        
        double luas = 0;
            if(r % 7 == 0){
                luas = 22/7*r*r;
            } else{
                luas = (int) (3.14*r*r);
            }
        return luas;
    }
}
    
