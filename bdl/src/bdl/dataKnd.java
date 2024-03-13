/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bdl;

import java.awt.Window;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import presistt.Kendaraan;

/**
 *
 * @author Irkhamnawan
 */
public class dataKnd extends javax.swing.JDialog {

    
    /**
     * Creates new form dataKnd
     */
    public dataKnd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampilKnd();
    }
    
    public void tampilKnd() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT k FROM Kendaraan k");
        List<Kendaraan> results = query.getResultList();
        entityManager.getTransaction().commit();
//        
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        tbl.setRowCount(0);
        for(Kendaraan k : results){
            Object[] ob = new Object[5];
            ob[0] = k.getIdKendaraan();
            ob[1] = k.getJenisKendaraan();
            ob[2] = k.getTipeKendaraan();
            ob[3] = k.getNoPlat();
            ob[4] = k.getBiayaHarian();
            
            tbl.addRow(ob);
        }
        entityManager.close();        
    }
    
//    

    // Method to get the selected data from the table
    public Object[] getSelectedData() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Assuming the first column contains the data you want
            Object[] rowData = new Object[4];

            // Mengasumsikan Anda ingin data dari kolom 0, 1, dan 4
            rowData[0] = jTable1.getModel().getValueAt(selectedRow, 0);
            rowData[1] = jTable1.getModel().getValueAt(selectedRow, 1);
            rowData[2] = jTable1.getModel().getValueAt(selectedRow, 3);
            rowData[3] = jTable1.getModel().getValueAt(selectedRow, 4);

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Kendaraan", "Jenis Kendaraan", "Tipe Kendaraan", "No Plat", "Biaya Harian"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 370, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
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
            Kendaraan k = entityManager.find(Kendaraan.class, tabel_klik);
            if (k != null) {
                String idKendaraan = k.getIdKendaraan();
                String jenisKendaraan = k.getJenisKendaraan();
                String tipeKendaraan = k.getTipeKendaraan();
                String noPlat = k.getNoPlat();
                double biayaHarian = k.getBiayaHarian();

                inputSewa sewa = new inputSewa();
                // Assuming jTextField1 is the JTextField
                sewa.idkendaraan.setText(idKendaraan);
                sewa.jeniskendaraan.setText(jenisKendaraan);
                sewa.noplat.setText(noPlat);
                sewa.tarifMbl.setText(Double.toString(biayaHarian));// Set the retrieved data to the JTextField
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
            java.util.logging.Logger.getLogger(dataKnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataKnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataKnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataKnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dataKnd dialog = new dataKnd(new javax.swing.JFrame(), true);
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
