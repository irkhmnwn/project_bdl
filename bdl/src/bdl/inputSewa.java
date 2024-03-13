/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bdl;

import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import presistt.Kendaraan;
import presistt.Penyewaan;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import presistt.DetailPenyewaan;
import presistt.DetailPenyewaanPK;
import presistt.Pegawai;
import presistt.Pelanggan;
import presistt.Sopir;

/**
 *
 * @author Irkhamnawan
 */
public class inputSewa extends javax.swing.JFrame {

    /**
     * Creates new form inputBuku
     */
    
//    boolean tambah = true;
    JTable jTable1;
    public inputSewa() {
        initComponents();
//        tampil1();
//        tampil2();
    }
    public inputSewa(JTable jTable1) {
        initComponents();
//        tampil1();
//        tampil2();
        this.jTable1 = jTable1;
    }
//    public Penyewaan(Penyewaan p, JTable jTable1) {
//        initComponents();
//        tampil1();
//        tampil2();
//        this.jTable1 = jTable1;
//        tambah = false;
//        idpenyewaan.setText(p.getIdPenyewaan());
//        idpegawai.setText(p.getIdPelanggan().getIdPelanggan());
//        jeniskendaraan.setText(p.getIdPegawai().getIdPegawai());
//        jTextField4.setText(p.getTotalBiaya());
//        idkendaraan.setText(p.getTanggalPenyewaan());
//        idkendaraan.setText(p.getTanggalKembali());
//        idkendaraan.setText(p.getJumlahHari());
//    }
//    
//    private void tampil1() {
//        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("SELECT p FROM penyewaan p");
//        List<Penyewaan> results = query.getResultList();
//        entityManager.getTransaction().commit();
////        
//        DefaultTableModel tbl = (DefaultTableModel) tabelpegawai.getModel();
//        tbl.setRowCount(0);
//        for(Penyewaan is : results){
//            Object[] ob = new Object[7];
//            ob[0] = is.getIdPenyewaan();
//            ob[1] = is.getIdPelanggan();
//            ob[2] = is.getIdPegawai();
//            ob[3] = is.getTotalBiaya();
//            ob[4] = is.getTanggalPenyewaan();
//            ob[5] = is.getTanggalKembali();
//            ob[6] = is.getJumlahHari();
//         
//            tbl.addRow(ob);
//        }
//        entityManager.close();        
//    }
//    
//    private void tampil2() {
//        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("SELECT k FROM Kendaraan k");
//        List<Kendaraan> results = query.getResultList();
//        entityManager.getTransaction().commit();
////        
//        DefaultTableModel tbl = (DefaultTableModel) tabelkendaraan.getModel();
//        tbl.setRowCount(0);
//        for(Kendaraan k : results){
//            Object[] ob = new Object[6];
//            ob[0] = k.getIdKendaraan();
//            ob[1] = k.getJenisKendaraan();
//            ob[2] = k.getTipeKendaraan();
//            ob[3] = k.getNoPlat();
//            ob[4] = k.getBiayaHarian();
//            ob[5] = k.getStatus();
//            tbl.addRow(ob);
//        }
//        entityManager.close();        
//    }
    private void tampilkan() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT p FROM Penyewaan p");
        List<Penyewaan> results = query.getResultList();
        entityManager.getTransaction().commit();
//        
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        tbl.setRowCount(0);
        for(Penyewaan p : results){
            Object[] ob = new Object[7];
            ob[0] = p.getIdPenyewaan();
            ob[1] = p.getIdPelanggan().getIdPelanggan();
            ob[2] = p.getIdPegawai().getIdPegawai();
            ob[3] = p.getTotalBiaya();
            ob[4] = p.getTanggalPenyewaan();
            ob[5] = p.getTanggalKembali();
            ob[6] = p.getJumlahHari();
            tbl.addRow(ob);
        }
        entityManager.close();        
    }
 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idpenyewaan = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totalbiaya = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tgl2 = new com.toedter.calendar.JDateChooser();
        harikendaraan = new javax.swing.JTextField();
        bersih = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tgl1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 229, 210));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID Penyewaan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Pegawai ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID Kendaraan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        idpenyewaan.setBackground(new java.awt.Color(255, 255, 255));
        idpenyewaan.setForeground(new java.awt.Color(0, 0, 0));
        idpenyewaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenyewaanActionPerformed(evt);
            }
        });
        jPanel1.add(idpenyewaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 183, -1));

        idpegawai.setBackground(new java.awt.Color(255, 255, 255));
        idpegawai.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(idpegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 143, -1));

        jeniskendaraan.setBackground(new java.awt.Color(255, 255, 255));
        jeniskendaraan.setForeground(new java.awt.Color(0, 0, 0));
        jeniskendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniskendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(jeniskendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 183, -1));

        idkendaraan.setBackground(new java.awt.Color(255, 255, 255));
        idkendaraan.setForeground(new java.awt.Color(0, 0, 0));
        idkendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idkendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(idkendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 145, -1));

        simpan.setBackground(new java.awt.Color(230, 149, 128));
        simpan.setForeground(new java.awt.Color(0, 0, 0));
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 87, 31));

        batal.setBackground(new java.awt.Color(230, 149, 128));
        batal.setForeground(new java.awt.Color(0, 0, 0));
        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel1.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 93, 31));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nama Pegawai");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        namapegawai.setBackground(new java.awt.Color(255, 255, 255));
        namapegawai.setForeground(new java.awt.Color(0, 0, 0));
        namapegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namapegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(namapegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 183, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jenis Kendaraan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID Pelanggan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        idpelanggan.setBackground(new java.awt.Color(255, 255, 255));
        idpelanggan.setForeground(new java.awt.Color(0, 0, 0));
        idpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpelangganActionPerformed(evt);
            }
        });
        jPanel1.add(idpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 144, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nama Pelanggan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        namapelanggan.setBackground(new java.awt.Color(255, 255, 255));
        namapelanggan.setForeground(new java.awt.Color(0, 0, 0));
        namapelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namapelangganActionPerformed(evt);
            }
        });
        jPanel1.add(namapelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 183, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tanggal Pinjam");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tanggal Kembali");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Jumlah Hari");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total Biaya");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        totalbiaya.setBackground(new java.awt.Color(204, 204, 204));
        totalbiaya.setForeground(new java.awt.Color(0, 0, 0));
        totalbiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbiayaActionPerformed(evt);
            }
        });
        totalbiaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalbiayaKeyReleased(evt);
            }
        });
        jPanel1.add(totalbiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 242, 48));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Biaya Harian");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        noplat.setBackground(new java.awt.Color(255, 255, 255));
        noplat.setForeground(new java.awt.Color(0, 0, 0));
        noplat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noplatActionPerformed(evt);
            }
        });
        jPanel1.add(noplat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 183, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID Sopir");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        idsopir.setBackground(new java.awt.Color(255, 255, 255));
        idsopir.setForeground(new java.awt.Color(0, 0, 0));
        idsopir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsopirActionPerformed(evt);
            }
        });
        jPanel1.add(idsopir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nama Sopir");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel1.add(tgl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        namasopir.setBackground(new java.awt.Color(255, 255, 255));
        namasopir.setForeground(new java.awt.Color(0, 0, 0));
        namasopir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namasopirActionPerformed(evt);
            }
        });
        jPanel1.add(namasopir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 183, -1));

        harikendaraan.setBackground(new java.awt.Color(255, 255, 255));
        harikendaraan.setForeground(new java.awt.Color(0, 0, 0));
        harikendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harikendaraanActionPerformed(evt);
            }
        });
        harikendaraan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                harikendaraanKeyReleased(evt);
            }
        });
        jPanel1.add(harikendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 183, -1));

        bersih.setBackground(new java.awt.Color(230, 149, 128));
        bersih.setForeground(new java.awt.Color(0, 0, 0));
        bersih.setText("BERSIH");
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });
        jPanel1.add(bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 87, 31));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 20, 20));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 20, -1));

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 20, -1));

        jButton5.setBackground(new java.awt.Color(230, 149, 128));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("HAPUS");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, 30));

        tarif.setBackground(new java.awt.Color(255, 255, 255));
        tarif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarifKeyReleased(evt);
            }
        });
        jPanel1.add(tarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 180, -1));

        tarifMbl.setBackground(new java.awt.Color(255, 255, 255));
        tarifMbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarifMblKeyReleased(evt);
            }
        });
        jPanel1.add(tarifMbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 20, 20));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tgl1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("No Plat");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Biaya Harian");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bersihActionPerformed

    private void harikendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harikendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harikendaraanActionPerformed

    private void namasopirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namasopirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namasopirActionPerformed

    private void idsopirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsopirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idsopirActionPerformed

    private void totalbiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalbiayaActionPerformed

    private void namapelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namapelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namapelangganActionPerformed

    private void idpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpelangganActionPerformed

    private void namapegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namapegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namapegawaiActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        dispose();
    }//GEN-LAST:event_batalActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed

        String idPenyewaan = idpenyewaan.getText();
        String idPelanggan = idpelanggan.getText().trim();
        String idPegawai = idpegawai.getText().trim();
        String jumlahHari = harikendaraan.getText();
        double totalBiaya = Double.parseDouble(totalbiaya.getText());

        try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);

            // Tanggal Awal
            Date tanggalPenyewaan = tgl1.getDate();
            System.out.println(tanggalPenyewaan);

            // Tanggal Akhir
            Date tanggalKembali = tgl2.getDate();
            System.out.println(tanggalKembali);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String idKendaraan = idkendaraan.getText();
        String idSopir = idsopir.getText();

        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Pelanggan pl = entityManager.find(Pelanggan.class, idPelanggan);
            Pegawai pg = entityManager.find(Pegawai.class, idPegawai);

            Penyewaan p = new Penyewaan();
            p.setIdPenyewaan(idPenyewaan);
            p.setIdPelanggan(pl);
            p.setIdPegawai(pg);
            p.setTanggalPenyewaan(tgl1.getDate());
            p.setTanggalKembali(tgl2.getDate());
            p.setJumlahHari(jumlahHari);
            p.setTotalBiaya(totalBiaya);
            entityManager.persist(p);

            Kendaraan k = entityManager.find(Kendaraan.class, idKendaraan);
            Sopir s = entityManager.find(Sopir.class, idSopir);

            DetailPenyewaan dp = new DetailPenyewaan();
            DetailPenyewaanPK dpk = new DetailPenyewaanPK();

            dpk.setIdKendaraan(idKendaraan);
            dpk.setIdPenyewaan(idPenyewaan);
            dpk.setIdSopir(idSopir);

            dp.setDetailPenyewaanPK(dpk);

            // Perbaikan: Jangan lupa untuk menyimpan objek DetailPenyewaan
            entityManager.persist(dp);

            transaction.commit();
            JOptionPane.showMessageDialog(null, "Input data berhasil");
            this.dispose();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
            tampilkan();
        }

    }//GEN-LAST:event_simpanActionPerformed

    private void idkendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idkendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idkendaraanActionPerformed

    private void noplatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noplatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noplatActionPerformed

    private void jeniskendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniskendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeniskendaraanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dataSpr p = new dataSpr(new javax.swing.JFrame(), true);
            p.tampilSpr();
            p.setVisible(true);
            
        Object[] selectedData = p.getSelectedData();
            if (selectedData != null) {
                String id = selectedData[0].toString();
                idsopir.setText(id);
                String jenis = selectedData[1].toString();
                namasopir.setText(jenis);
                String plat = selectedData[2].toString();
                tarif.setText(plat);
            
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dataPlgn b = new dataPlgn(new javax.swing.JFrame(), true);
            b.tampilPlgn();
            b.setVisible(true);
            
            Object[] selectedData = b.getSelectedData();
            if (selectedData != null) {
                String id = selectedData[0].toString();
                idpelanggan.setText(id);
                String jenis = selectedData[1].toString();
                namapelanggan.setText(jenis);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dataKnd a = new dataKnd(new javax.swing.JFrame(), true);
            a.tampilKnd();
            a.setVisible(true);
            
            Object[] selectedData = a.getSelectedData();
            if (selectedData != null) {
                String id = selectedData[0].toString();
                idkendaraan.setText(id);
                String jenis = selectedData[1].toString();
                jeniskendaraan.setText(jenis);
                String plat = selectedData[2].toString();
                noplat.setText(plat);
                String tarif = selectedData[3].toString();
                tarifMbl.setText(tarif.toString());
            }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idpenyewaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpenyewaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpenyewaanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dataPgw b = new dataPgw(new javax.swing.JFrame(), true);
            b.tampilPgw();
            b.setVisible(true);
            
            Object[] selectedData = b.getSelectedData();
            if (selectedData != null) {
                String id = selectedData[0].toString();
                idpegawai.setText(id);
                String jenis = selectedData[1].toString();
                namapegawai.setText(jenis);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tarifMblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarifMblKeyReleased
        hitungTotalBiaya();
    }//GEN-LAST:event_tarifMblKeyReleased

    private void tarifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarifKeyReleased
        hitungTotalBiaya();
    }//GEN-LAST:event_tarifKeyReleased

    private void harikendaraanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harikendaraanKeyReleased
        hitungTotalBiaya();
    }//GEN-LAST:event_harikendaraanKeyReleased

    private void totalbiayaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalbiayaKeyReleased
        hitungTotalBiaya();
    }//GEN-LAST:event_totalbiayaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inputSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputSewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bersih;
    private javax.swing.JTextField harikendaraan;
    public final javax.swing.JTextField idkendaraan = new javax.swing.JTextField();
    public final javax.swing.JTextField idpegawai = new javax.swing.JTextField();
    public final javax.swing.JTextField idpelanggan = new javax.swing.JTextField();
    private javax.swing.JTextField idpenyewaan;
    public final javax.swing.JTextField idsopir = new javax.swing.JTextField();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public final javax.swing.JTextField jeniskendaraan = new javax.swing.JTextField();
    public final javax.swing.JTextField namapegawai = new javax.swing.JTextField();
    public final javax.swing.JTextField namapelanggan = new javax.swing.JTextField();
    public final javax.swing.JTextField namasopir = new javax.swing.JTextField();
    public final javax.swing.JTextField noplat = new javax.swing.JTextField();
    private javax.swing.JButton simpan;
    public final javax.swing.JTextField tarif = new javax.swing.JTextField();
    public final javax.swing.JTextField tarifMbl = new javax.swing.JTextField();
    private com.toedter.calendar.JDateChooser tgl1;
    private com.toedter.calendar.JDateChooser tgl2;
    private javax.swing.JTextField totalbiaya;
    // End of variables declaration//GEN-END:variables

    
        private void hitungTotalBiaya() {
        try {
            double hargaMobil = tarifMbl.getText().isEmpty() ? 0 : Double.parseDouble(tarifMbl.getText());

            // Mengambil nilai dari JTextField tarif
            double hargaSopir = tarif.getText().isEmpty() ? 0 : Double.parseDouble(tarif.getText());

            // Mengambil nilai dari JTextField harikendaraan
            int jumlahHari = harikendaraan.getText().isEmpty() ? 0 : Integer.parseInt(harikendaraan.getText());

            double totalBiaya = (hargaMobil + hargaSopir) * jumlahHari;

            totalbiaya.setText(String.valueOf(totalBiaya));

        } catch (NumberFormatException e) {
            System.err.println("Format angka tidak valid");
        }
    }
}


