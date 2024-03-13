/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bdl;

import java.awt.Window;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import presistt.Penyewaan;

/**
 *
 * @author Irkhamnawan
 */
public class dataSewa extends javax.swing.JDialog {

    /**
     * Creates new form dataSewa
     */
    public dataSewa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampilSewa();
    }
    
    public void tampilSewa() {
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
    
    public Object[] getSelectedData() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Assuming the first column contains the data you want
            Object[] rowData = new Object[2];

            // Mengasumsikan Anda ingin data dari kolom 0, 1, dan 4
            rowData[0] = jTable1.getModel().getValueAt(selectedRow, 0);
            rowData[1] = jTable1.getModel().getValueAt(selectedRow, 3);
            return rowData;
        }
        return null;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 229, 210));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(220, 167, 163));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Penyewaan ", "ID Pelanggan", "ID Pegawai", "Total Biaya", "Tanggal Penyewaan", "Tanggal Kembali", "Jumlah Hari"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 520, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
    EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
    entityManager.getTransaction().begin();

    int row = jTable1.getSelectedRow();
    String tabel_klik = (jTable1.getModel().getValueAt(row, 0).toString());

    // Ubah kode di bawah ini untuk mencari data yang diinginkan
    Penyewaan sp = entityManager.find(Penyewaan.class, tabel_klik);
    if (sp != null) {
        String idSewa = sp.getIdPenyewaan();
        double totalBiaya = sp.getTotalBiaya();
        
        inputByr sewa = new inputByr();
        // Assuming jTextField1 is the JTextField
        sewa.idpenyewaan.setText(idSewa);
        sewa.total1.setText(Double.toString(totalBiaya));// Set the retrieved data to the JTextField
        // Set other fields if needed

        // Close the JDialog
        Window window = SwingUtilities.windowForComponent(jTable1);
        if (window instanceof JDialog) {
            ((JDialog) window).dispose();
        }
    }

    entityManager.getTransaction().commit();
} catch (Exception e) {
    // Handle exceptions appropriately
}
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(dataSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dataSewa dialog = new dataSewa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
