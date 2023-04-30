
package nothesap;

import java.util.Scanner;


public class NotHesap {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float mat,fizik,kimya,turkce,tarih,muzik,toplam,ort;
        
        System.out.print("Matematik Notu: ");
        mat=scan.nextInt();
        
        System.out.print("Fizik Notu: ");
        fizik=scan.nextInt();
        
        System.out.print("Kimya Notu: ");
        kimya=scan.nextInt();
        
        System.out.print("Türkçe Notu: ");
        turkce=scan.nextInt();
        
        System.out.print("tarih Notu: ");
        tarih=scan.nextInt();
        
        System.out.print("Müzik Notu: ");
        muzik=scan.nextInt();
        
        
        toplam = mat+fizik+kimya+turkce+tarih+muzik;
        ort=toplam/6;
        System.out.println("Ortalamanız:"+ort);
        System.out.println(ort>=60 ? "Sınıfı Geçti":"Sınıfta Kaldı");
        
    }
    
}
