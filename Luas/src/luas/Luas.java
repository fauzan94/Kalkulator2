package luas;

import java.util.Scanner;

public class Luas {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 9;
        do{
            System.out.println("\n\n");
            System.out.println("Menu Menghitung Luas");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Segitiga");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            switch(pilihan){
               case 1:
                   System.out.println("Hitung Luas Persegi");
                   System.out.print("Masukkan sisi :");
                   int sisi = input.nextInt();
            int luuas = sisi*sisi;
                   System.out.print("Luasnya adalah  : " + luuas);
            break;
            case 2:
                   System.out.println("Hitung Luas Persegi Panjang");
                   System.out.print("Masukkan panjang :");
                   int panjang = input.nextInt();
                   System.out.print("Masukkan lebar :");
                   int lebar = input.nextInt();
            int luas1 = panjang*lebar;
                   System.out.print("Luasnya adalah  : " + luas1);
            break;
            case 3:
                   System.out.println("Hitung Luas Segitiga");
                   System.out.print("Masukkan alas :");
                   int alas = input.nextInt();
                   System.out.print("Masukkan tinggi :");
                   int tinggi = input.nextInt();
            int luass = (alas*tinggi)/2;
                   System.out.print("Luasnya adalah  : " + luass);
            break;
            default:
               System.out.println("Terimakasih");
            }
        }
        while(pilihan!=1-3);
    
    
            
            }
    }
    
        
            
            