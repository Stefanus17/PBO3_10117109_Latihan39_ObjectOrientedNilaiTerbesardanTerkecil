/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan39_obejctorientednilaiterbesardanterkecil;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan nilai terbesar dan terkecil yang di input oleh user 
 * dengan konsep OOP
 */
public class PBO3_10117109_Latihan39_ObejctOrientedNilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int jmlMahasiswa;

        Nilai hasil = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMahasiswa = scn.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMahasiswa);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMahasiswa);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
