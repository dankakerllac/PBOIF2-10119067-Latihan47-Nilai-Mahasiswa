/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan47.nilai.mahasiswa;
import java.util.Scanner;
/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi: Nilai Mahasiswa
 */
public class PBOIF210119067Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        int quis,uts,uas;
        
        System.out.print("QUIZ\t:");
        quis = scanner.nextInt();
        System.out.print("QUIZ\t:");
        uts = scanner.nextInt();
        System.out.print("QUIZ\t:");
        uas = scanner.nextInt();
        
        nilai.setQuis(quis);
        nilai.setUts(uts);
        nilai.setUas(uas);
        System.out.println();
        System.out.println("Nilai Akhir\t:" + nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas()));
        System.out.println();
        System.out.println("Index = " + nilai.menentukanIndex(nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas())));
        System.out.println("Ketarangan =" + nilai.menentukanKeterangan(nilai.menentukanIndex(nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas()))));
        
    }
    
}