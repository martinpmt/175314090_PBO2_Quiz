/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import model.Dokter;

/**
 *
 * @author jarkom
 */
public class TambahDokterDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JLabel nomorPegawaiLabel;
    private JTextField nomorPegawaiText;
    private JToggleButton tambahButton;

    public TambahDokterDialog() {
        init();
    }

    public TambahDokterDialog(JFrame parent, boolean model) {
        super(parent, model);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Formulir Penambahan Dokter");
        judulLabel.setBounds(100, 25, 500, 20);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(30, 100, 150, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 100, 250, 25);
        this.add(namaText);

        nomorPegawaiLabel = new JLabel("Nomor Pegawai");
        nomorPegawaiLabel.setBounds(30, 140, 150, 25);
        this.add(nomorPegawaiLabel);

        nomorPegawaiText = new JTextField();
        nomorPegawaiText.setBounds(150, 140, 250, 25);
        this.add(nomorPegawaiText);

        tambahButton = new JToggleButton("Tambah");
        tambahButton.setBounds(150, 180, 100, 30);
        this.add(tambahButton);

        tambahButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
            Dokter baru = new Dokter();
            baru.setNama(namaText.getText());
            baru.setNomorPegawai(nomorPegawaiText.getText());
            DokterTableModel dokterModel = new DokterTableModel(FrameUtama.rumahSakit.getDaftarDokter());
            FrameUtama.rumahSakit.tambahDokter(baru);
            FrameUtama.lihatDokter.setDokterTableModel(dokterModel);
            FrameUtama.lihatDokter.updateTable();
            this.dispose();
        }

    }

}
