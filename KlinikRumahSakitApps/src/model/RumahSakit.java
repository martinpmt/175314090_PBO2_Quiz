/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class RumahSakit {

    private String nama;
    private ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private ArrayList<Klinik> daftarKLinik = new ArrayList<Klinik>();

    public RumahSakit(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public void tambahDokter(Dokter dokter) {
        if (cariDokter(dokter.getNama()) == -1) {
            daftarDokter.add(dokter);
        } else {
            System.out.println(dokter.getNama() + " Sudah Tedaftar");
        }
    }

    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

    public void tambahKlinik(Klinik klinik) {
        daftarKLinik.add(klinik);
    }

    public void setDaftarKLinik(ArrayList<Klinik> daftarKLinik) {
        this.daftarKLinik = daftarKLinik;
    }

    public int cariDokter(String nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).getNama().equalsIgnoreCase(nama));
            return i;
        }
        return -1;
    }

    public int cariKlinik(String nama) {
        for (int i = 0; i < daftarKLinik.size(); i++) {
            if (daftarKLinik.get(i).getNamaKlinik().equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Klinik> getDaftarKLinik() {
        return daftarKLinik;
    }
}
