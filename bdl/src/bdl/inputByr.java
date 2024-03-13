/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bdl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import presistt.Pegawai;
import presistt.Pembayaran;
import presistt.Penyewaan;

/**
 *
 * @author Irkhamnawan
 */
public class inputByr extends javax.swing.JFrame {

    /**
     * Creates new form inputPlgn
     */
//    boolean tambah = true;
    JTable jTable2;
    public inputByr() {
        initComponents();
    }
    public inputByr(JTable jTable2) {
        initComponents();
        this.jTable2 = jTable2;
    }
//    public inputByr(Penyewaan pg, JTable jTable1) {
//        initComponents();
//        this.jTable1 = jTable1;
//        tambah = false;
//        nota.setText(pg.getIdPegawai());
//        idpenyewaan.setText(pg.getJabatanPegawai());
//        tanggalsewa.setText(pg.getNamaPegawai());
//        total.setText(pg.getAlamatPegawai());
//        jTextField4.setText(String.valueOf(pg.getTelpPegawai()));
//    }

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
        nota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tglA = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 229, 210));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NO.NOTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 37, -1, -1));

        nota.setBackground(new java.awt.Color(255, 255, 255));
        nota.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 59, 323, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Penyewaan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 87, -1, -1));

        idpenyewaan.setBackground(new java.awt.Color(255, 255, 255));
        idpenyewaan.setForeground(new java.awt.Color(0, 0, 0));
        idpenyewaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenyewaanActionPerformed(evt);
            }
        });
        jPanel1.add(idpenyewaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 109, 290, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sisa pembayaran");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalKeyReleased(evt);
            }
        });
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 323, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 193, -1, -1));

        simpan.setBackground(new java.awt.Color(230, 149, 128));
        simpan.setForeground(new java.awt.Color(0, 0, 0));
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, 35));

        cancel.setBackground(new java.awt.Color(230, 149, 128));
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, 35));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tanggal Penyewaan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 137, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNAS", "DP" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 215, 87, -1));

        total1.setBackground(new java.awt.Color(255, 255, 255));
        total1.setForeground(new java.awt.Color(0, 0, 0));
        total1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                total1KeyReleased(evt);
            }
        });
        jPanel1.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 275, 323, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 30, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total Pembayaran");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 253, -1, -1));
        jPanel1.add(tglA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
 
            String noNota = nota.getText();
            String idPenyewaan = idpenyewaan.getText().trim();
            
//            String dateString = tanggalsewa.getText().trim();
//            Date tanggalPembayaran = null;
            
            String statusPembayaran = (String) jComboBox1.getSelectedItem();
            double totalPembayaran = Double.parseDouble(total1.getText());
            double sisaBayar = Double.parseDouble(total.getText());
            
            try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);

            // Tanggal Awal
            Date tanggalPenyewaan = tglA.getDate();
            System.out.println(tanggalPenyewaan);

        } catch (Exception e) {
            e.printStackTrace();
        
}
            // awal persistence
            EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
            entityManager.getTransaction().begin();
            Penyewaan p = entityManager.find(Penyewaan.class, idPenyewaan);
            Pembayaran py = new Pembayaran();
            py.setNoNota(noNota);
            py.setIdPenyewaan(p);
            py.setTanggalPembayaran(tglA.getDate());
            py.setStatusPembayaran(statusPembayaran);
            py.setTotalPembayaran(totalPembayaran);
            py.setSisaBayar(sisaBayar);
            entityManager.persist(py);
            entityManager.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Input data berhasil");
            this.dispose();
         
        nota.setText("");
        idpenyewaan.setText("");
        total.setText("");
        tampilkan2();
    }//GEN-LAST:event_simpanActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void idpenyewaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpenyewaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpenyewaanActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        hitungPembayaran();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dataSewa2 c = new dataSewa2(new javax.swing.JFrame(), true);
            c.tampilSewa();
            c.setVisible(true);
            
            Object[] selectedData = c.getSelectedData();
            if (selectedData != null) {
                String id = selectedData[0].toString();
                idpenyewaan.setText(id);
                String total = selectedData[1].toString();
                total1.setText(total);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void total1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total1KeyReleased
        hitungPembayaran();
    }//GEN-LAST:event_total1KeyReleased

    private void totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyReleased
        hitungPembayaran();
    }//GEN-LAST:event_totalKeyReleased

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
            java.util.logging.Logger.getLogger(inputByr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputByr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputByr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputByr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new inputByr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    public final javax.swing.JTextField idpenyewaan = new javax.swing.JTextField();
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nota;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tglA;
    private javax.swing.JTextField total;
    public final javax.swing.JTextField total1 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
private void tampilkan2() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT p FROM Pembayaran p");
        List<Pembayaran> results = query.getResultList();
        entityManager.getTransaction().commit();
//        
        DefaultTableModel tbl = (DefaultTableModel) jTable2.getModel();
        tbl.setRowCount(0);
        for(Pembayaran py : results){
            Object[] ob = new Object[6];
            ob[0] = py.getNoNota();
            ob[1] = py.getIdPenyewaan().getIdPenyewaan();
            ob[2] = py.getTanggalPembayaran();
            ob[3] = py.getTotalPembayaran();
            ob[4] = py.getStatusPembayaran();
            ob[5] = py.getSisaBayar();
            tbl.addRow(ob);
        }
        entityManager.close();        
    }
private void hitungPembayaran() {
        try {
            double totalPembelian = Double.parseDouble(total1.getText());
            String selectedPaymentType = (String) jComboBox1.getSelectedItem();
            double pembayaran;

            if (selectedPaymentType.equals("DP")) {
                pembayaran = totalPembelian * 0.5;
            } else {
                pembayaran = 0;
            }

            total.setText(String.format("%.2f", pembayaran));
        } catch (NumberFormatException ex) {
            total.setText("Error");
        }
    }

}
