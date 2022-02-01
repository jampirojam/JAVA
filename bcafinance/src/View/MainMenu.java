/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.ConfigSession;
import Hibernate.Saldo;
import Hibernate.Transaksi;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GEMBUL
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    String id, id_saldo;
    Vector<Saldo> ObjekSaldo;
    Vector<Transaksi> ObjekTransaksi;

    public MainMenu() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        initComponents();
        try {
            Session session = ConfigSession.getSessionFactory().openSession();
            session.beginTransaction();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime sekarang = LocalDateTime.now();
        System.out.println(dtf.format(sekarang));
        this.doQuerySaldo();
        this.doQueryTrans();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTrans = new javax.swing.JTable();
        updateTrans = new javax.swing.JButton();
        deleteTrans = new javax.swing.JButton();
        insertTans = new javax.swing.JButton();
        inputCari = new javax.swing.JTextField();
        searchTrans = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSaldo = new javax.swing.JTable();
        deleteSaldo = new javax.swing.JButton();
        insertSaldo = new javax.swing.JButton();
        updateSaldo = new javax.swing.JButton();
        searchSaldo = new javax.swing.JButton();
        cariSaldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelTrans);

        updateTrans.setText("UPDATE");
        updateTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTransActionPerformed(evt);
            }
        });

        deleteTrans.setText("DELETE");
        deleteTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTransActionPerformed(evt);
            }
        });

        insertTans.setText("INSERT");
        insertTans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTansActionPerformed(evt);
            }
        });

        searchTrans.setText("SEARCH");
        searchTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTransActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("TR-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(insertTans, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCari)
                .addGap(18, 18, 18)
                .addComponent(searchTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTrans)
                    .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertTans)
                    .addComponent(deleteTrans)
                    .addComponent(updateTrans))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TRANSAKSI", jPanel1);

        tabelSaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSaldoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSaldo);

        deleteSaldo.setText("DELETE");
        deleteSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSaldoActionPerformed(evt);
            }
        });

        insertSaldo.setText("INSERT");
        insertSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertSaldoActionPerformed(evt);
            }
        });

        updateSaldo.setText("UPDATE");
        updateSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSaldoActionPerformed(evt);
            }
        });

        searchSaldo.setText("SEARCH");
        searchSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSaldoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(insertSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 150, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cariSaldo)
                .addGap(18, 18, 18)
                .addComponent(searchSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchSaldo)
                    .addComponent(cariSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertSaldo)
                    .addComponent(deleteSaldo)
                    .addComponent(updateSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SALDO", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertTansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTansActionPerformed
        new InsertTransaksi(null, true).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_insertTansActionPerformed

    private void deleteTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTransActionPerformed
        if (!String.valueOf(id).trim().equalsIgnoreCase("null")) {
            new DeleteTransaksi(this, true, id).setVisible(true);
            this.doQueryTrans();
        }                // TODO add your handling code here:
    }//GEN-LAST:event_deleteTransActionPerformed

    private void updateTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTransActionPerformed
        if (!String.valueOf(id).trim().equalsIgnoreCase("null")) {
            new UpdateTransaksi(this, true, id).setVisible(true);
            this.doQueryTrans();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_updateTransActionPerformed

    private void tabelTransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransMouseClicked
        id = tabelTrans.getValueAt(tabelTrans.getSelectedRow(), 0).toString();     // TODO add your handling code here:
    }//GEN-LAST:event_tabelTransMouseClicked

    private void insertSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertSaldoActionPerformed
        new InsertSaldo(null, true).setVisible(true);
        this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_insertSaldoActionPerformed

    private void tabelSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSaldoMouseClicked
        id_saldo = tabelSaldo.getValueAt(tabelSaldo.getSelectedRow(), 0).toString();       // TODO add your handling code here:
    }//GEN-LAST:event_tabelSaldoMouseClicked

    private void deleteSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSaldoActionPerformed
        if (!String.valueOf(id_saldo).trim().equalsIgnoreCase("null")) {
            new DeleteSaldo(this, true, id_saldo).setVisible(true);
            this.doQuerySaldo();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSaldoActionPerformed

    private void updateSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSaldoActionPerformed
        if (!String.valueOf(id_saldo).trim().equalsIgnoreCase("null")) {
            new UpdateSaldo(this, true, id_saldo).setVisible(true);
            this.doQuerySaldo();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_updateSaldoActionPerformed

    private void searchSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSaldoActionPerformed
        this.doQuerySaldo();        // TODO add your handling code here:
    }//GEN-LAST:event_searchSaldoActionPerformed

    private void searchTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTransActionPerformed
         this.doQueryTrans();// TODO add your handling code here:
    }//GEN-LAST:event_searchTransActionPerformed

    // DATA TRANSAKSI
    private void CariTransaksi() {
        executeTransQuery(IDTRANSAKSI + "TR-" + inputCari.getText() + "%'");
    }

    private void CariTransKosong() {
        executeTransQuery(TRANSKOSONG);
    }

    private void displayResultTrans(List resultList) {
        ObjekTransaksi = new Vector();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("KODE");
        tableHeaders.add("NOMINAL");
        tableHeaders.add("JENIS");
        tableHeaders.add("TANGGAL");
        tableHeaders.add("ID NASABAH");
        for (Object o : resultList) {
            Transaksi b = (Transaksi) o;
            ObjekTransaksi.add(b);
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(b.getId());
            oneRow.add(b.getNominal());
            oneRow.add(b.getJenis());
            oneRow.add(b.getTanggal());
            oneRow.add(b.getId_saldo());
            tableData.add(oneRow);
        }
        tabelTrans.setModel(new DefaultTableModel(tableData, tableHeaders));

    }

    private void executeTransQuery(String hql) {

        try {
            Session session = ConfigSession.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            displayResultTrans(resultList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }

    }
    private static String IDTRANSAKSI = "from Transaksi b where b.id like '%";
    private static String TRANSKOSONG = "from Transaksi b";

    private void doQueryTrans() {
        if (!inputCari.getText().trim().equals("")) {
            CariTransaksi();
        } else {
            CariTransKosong();
        }
    }

    // DATA TRANSAKSI
    private void CariSaldo() {
        executeSaldoQuery(IDSALDO + "ID-"+ cariSaldo.getText() + "%'");
    }

    private void CariSaldoKosong() {
        executeSaldoQuery(SALDOKOSONG);
    }

    private void displayResultSaldo(List resultList) {
        ObjekSaldo = new Vector();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("ID NASABAH");
        tableHeaders.add("NAMA");
        tableHeaders.add("TOTAL");
        for (Object o : resultList) {
            Saldo b = (Saldo) o;
            ObjekSaldo.add(b);
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(b.getId_saldo());
            oneRow.add(b.getPemilik_saldo());
            oneRow.add(b.getTotal_saldo());
            tableData.add(oneRow);
        }
        tabelSaldo.setModel(new DefaultTableModel(tableData, tableHeaders));

    }

    private void executeSaldoQuery(String hql) {

        try {
            Session session = ConfigSession.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            displayResultSaldo(resultList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }

    }
    private static String IDSALDO = "from Saldo b where b.id_saldo like '%";
    private static String SALDOKOSONG = "from Saldo b";

    private void doQuerySaldo() {
        if (!cariSaldo.getText().trim().equals("")) {
            CariSaldo();
        } else {
            CariSaldoKosong();
        }
    }

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cariSaldo;
    private javax.swing.JButton deleteSaldo;
    private javax.swing.JButton deleteTrans;
    private javax.swing.JTextField inputCari;
    private javax.swing.JButton insertSaldo;
    private javax.swing.JButton insertTans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton searchSaldo;
    private javax.swing.JButton searchTrans;
    private javax.swing.JTable tabelSaldo;
    private javax.swing.JTable tabelTrans;
    private javax.swing.JButton updateSaldo;
    private javax.swing.JButton updateTrans;
    // End of variables declaration//GEN-END:variables
}