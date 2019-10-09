/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan28.ganti.kata;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Ganti Kata
 */

public class IF0110118016Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String kataBaru;
        
        //masukkan
        System.out.println("_____PROGRAM MENGGANTI KATA_____");
        System.out.print("Masukkan Kalimat\t: ");
        Scanner tempKalimat = new Scanner(System.in);
        kalimatAwal = tempKalimat.nextLine();
        
        System.out.print("Ganti Kata\t\t: ");
        Scanner tempGkata = new Scanner(System.in);
        gantiKata =  tempGkata.nextLine();
        
        System.out.print("Menjadi Kata\t\t: ");
        Scanner tempBkata = new Scanner(System.in);
        kataBaru = tempBkata.nextLine();
        System.out.println();
        
        //keluaran
        kalimatBaru = kalimatAwal.replaceAll(gantiKata,kataBaru);
        System.out.println("******HASIL FORMATTING******");
        System.out.println("Kalimat awal  : " + kalimatAwal);
        System.out.println("Kalimat baru  : " + kalimatBaru);
    }
    
}
