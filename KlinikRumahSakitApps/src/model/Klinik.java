/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jarkom
 */
public class Klinik {

    private String namaKlinik;
    private String idKlinik;
    private ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();

    public Klinik(String idKlinik, String namaKlinik) {
        this.namaKlinik = namaKlinik;
        this.idKlinik = idKlinik;
    }

    public String getNamaKlinik() {
        return namaKlinik;
    }

    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }

    public String getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

    public void tambahDokter(Dokter dokter) {
        RumahSakit a = new RumahSakit();
        if (a.cariDokter(dokter.getNama()) == -1) {
            a.tambahDokter(dokter);
        } else {
            JOptionPane.showMessageDialog(null, "Dokter " + dokter.getNama() + " Sudah Ada !");
        }

    }
}
