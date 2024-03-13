/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bdl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import presistt.Pegawai;
import java.util.Vector;

/**
 *
 * @author Irkhamnawan
 */
public class pegawai extends javax.swing.JPanel {

    /**
     * Creates new form pelanggan
     */
    ArrayList<Pegawai> dataPegawai;
    public pegawai() {
        initComponents();
        tampilkan();
    }
    
    private void tampilkan() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT p FROM Pegawai p");
        List<Pegawai> results = query.getResultList();
        entityManager.getTransaction().commit();
//        
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        tbl.setRowCount(0);
        for(Pegawai pg : results){
            Object[] ob = new Object[5];
            ob[0] = pg.getIdPegawai();
            ob[1] = pg.getNamaPegawai();
            ob[2] = pg.getJabatanPegawai();
            ob[3] = pg.getAlamatPegawai();
            ob[4] = pg.getTelpPegawai();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 229, 210));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(220, 167, 163));

        jTable1.setBackground(new java.awt.Color(220, 167, 163));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pegawai", "Nama", "Jabatan", "Alamat", "Telepon"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 75, 463, 242));

        jButton2.setBackground(new java.awt.Color(230, 149, 128));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 172, 88, -1));

        jButton5.setBackground(new java.awt.Color(230, 149, 128));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("IMPORT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 213, 88, -1));

        jButton3.setBackground(new java.awt.Color(230, 149, 128));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 131, 88, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "Jabatan", "Alamat", "Telepon" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 25, -1, -1));

        jButton4.setBackground(new java.awt.Color(230, 149, 128));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("REPORT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 25, -1, -1));

        jButton1.setBackground(new java.awt.Color(230, 149, 128));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("INPUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 90, 88, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 25, 173, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inputPgw ipg = new inputPgw(jTable1);
        ipg.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser filechooser = new JFileChooser();

                int i = filechooser.showOpenDialog(null);
                if (i == JFileChooser.APPROVE_OPTION) {
                    
                    EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
                    entityManager.getTransaction().begin();

                    
                    File f = filechooser.getSelectedFile();
                    String filepath = f.getPath();
                    String fi = f.getName();
                    //Parsing CSV Data
                    System.out.print(filepath);
                    DefaultTableModel csv_data = new DefaultTableModel();

                    try {

                        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                        org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                        for (CSVRecord csvRecord : csvParser) {

                        Pegawai p = new Pegawai();
                        p.setIdPegawai(csvRecord.get(0));
                        p.setNamaPegawai(csvRecord.get(1));
                        p.setJabatanPegawai(csvRecord.get(2));
                        p.setAlamatPegawai(csvRecord.get(3));
                        p.setTelpPegawai(csvRecord.get(4));
                        entityManager.persist(p);
                        
                        }
                        
                    } catch (Exception ex) {
                        System.out.println("Error in Parsing CSV File");
                    }
                    
                    entityManager.getTransaction().commit();
                    tampilkan();
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
//        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
//        entityManager.getTransaction().begin();
//            Pegawai pg = entityManager.find(Pegawai.class, s);
//            entityManager.remove(pg);
//        entityManager.getTransaction().commit();
//        tampilkan();
        
        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin menghapus data?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        	entityManager.getTransaction().begin();
                	Pegawai p = entityManager.find(Pegawai.class, s);
                	entityManager.remove(p);
                entityManager.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                tampilkan();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        entityManager.getTransaction().begin();
            Pegawai pg = entityManager.find(Pegawai.class, s);
        entityManager.getTransaction().commit();        
        inputPgw ipg = new inputPgw(pg,jTable1);
        ipg.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
        EntityManager entityManager = Persistence.createEntityManagerFactory("bdlPU").createEntityManager();
        entityManager.getTransaction().begin();

        int row = jTable1.getSelectedRow();
        String tabel_klik = (jTable1.getModel().getValueAt(row, 0).toString());

    // Ubah kode di bawah ini untuk mencari data yang diinginkan
    Pegawai pg = entityManager.find(Pegawai.class, tabel_klik);
    if (pg != null) {
        String idPegawaw = pg.getIdPegawai();
        String namaPegawai = pg.getNamaPegawai();
        String jabaatanPegawai = pg.getJabatanPegawai();
        String alamatPegawai = pg.getAlamatPegawai();
        String telpPegawai = pg.getTelpPegawai();
    }

    entityManager.getTransaction().commit();
} catch (Exception e) {
    // Handle exceptions appropriately
}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            String selection = (String) jComboBox1.getSelectedItem();
            String searchTerm = jTextField1.getText().trim().toLowerCase();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM Pegawai p WHERE ";

            switch (selection) {
                case "ID":
                    queryString += "LOWER(p.idPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case "Nama":
                    queryString += "LOWER(p.namaPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case "Jabatan":
                    queryString += "LOWER(p.jabatanPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case "Alamat":
                    queryString += "LOWER(p.alamatPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case "Telepon":
                    queryString += "LOWER(p.telpPegawai) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdlPU");
            EntityManager em = emf.createEntityManager();

            TypedQuery<Pegawai> query = em.createQuery(queryString, Pegawai.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Pegawai> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("ID Pegawai");
            dataModel.addColumn("Nama");
            dataModel.addColumn("Jabatan");
            dataModel.addColumn("Alamat");
            dataModel.addColumn("Telepon");

            // Add rows to the model
            for (Pegawai result : results) {
                Object[] rowData = {
                    result.getIdPegawai(),
                    result.getNamaPegawai(),
                    result.getJabatanPegawai(),
                    result.getAlamatPegawai(),
                    result.getTelpPegawai()
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            jTable1.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String reportPath = "src/bdl/reportPgw.jrxml";
            String selection = ((String) jComboBox1.getSelectedItem());
            String searchTerm = jTextField1.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM Pegawai p WHERE ";

                      switch (jComboBox1.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(p.idPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(p.namaPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(p.jabatanPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(p.alamatPegawai) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(p.telpPegawai) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdlPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Pegawai> cq = cb.createQuery(Pegawai.class);
            Root<Pegawai> p = cq.from(Pegawai.class);
            cq.select(p);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Pegawai> q = em.createQuery(cq);
            List<Pegawai> list = q.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Pegawai> results = query.getResultList();
            Map<String,Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);
            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Pegawai result : results) {
                Object[] rowData = {
                    result.getIdPegawai(),
                    result.getNamaPegawai(),
                    result.getJabatanPegawai(),
                    result.getAlamatPegawai(),
                    result.getTelpPegawai()
                };
                    data.add(rowData);
                }
             em.getTransaction().commit();
           em.close();
            emf.close();

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
   
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);
            
            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, dataSource);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);

        } catch (JRException ex) {
                Logger.getLogger(pegawai.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
