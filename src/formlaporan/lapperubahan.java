/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formlaporan;

import Class.ClassDatabase;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author pc
 */
public class lapperubahan extends javax.swing.JFrame {
 private String sql;
private Connection con;
    public static ResultSet rs;
static java.sql.Statement stat;
    /**
     * Creates new form lapperubahan
     */
    public lapperubahan() {
        initComponents();
        hasil();
        total_harga();
       
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sisa = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        modal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        modal1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kredit = new javax.swing.JTextField();
        debit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 258, 111, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LAPORAN PERUBAHAN MODAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 243, -1, -1));

        sisa.setText("SISA LABA");
        jPanel1.add(sisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, -1));

        jTextField2.setText("PRIVE");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, -1));

        jTextField3.setText("PENAMBAHAN MODAL");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, -1));

        modal.setText("MODAL AWAL");
        jPanel1.add(modal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        jButton3.setText("PROSES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        modal1.setText("P001");
        jPanel1.add(modal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel2.setText("nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel3.setText("kode");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(kredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 60, -1));
        jPanel1.add(debit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 60, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            String reportName = ClassDatabase.PathReport + "baranh.jasper";
            HashMap parameter = new HashMap();
            File reportFile = new File(reportName);

            JasperReport jReport = (JasperReport)JRLoader.loadObject(reportFile.getPath());
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameter, ClassDatabase.getkoneksi());
            JasperViewer.viewReport(jPrint,false);

        } catch (Exception ex) {
            System.out.println(ex);
        }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
         dbconnect();
             sql = "select sum(debit) from jurnal where kdperkiraan = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modal1.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modal.setText(rs.getString(1));
            }
        } catch (SQLException se) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(lapperubahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lapperubahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lapperubahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lapperubahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lapperubahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField debit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField kredit;
    private javax.swing.JTextField modal;
    private javax.swing.JTextField modal1;
    private javax.swing.JTextField sisa;
    // End of variables declaration//GEN-END:variables
private void dbconnect() {
         try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            con=DriverManager.getConnection("jdbc:odbc:dstoko");
            stat=con.createStatement();
        }catch (Exception ce) {JOptionPane.showMessageDialog(null,"Koneksi gagal..");
        }
    }
   private void total_harga(){
     try {
         dbconnect();
             sql = "select sum(debit) from jurnal ";
            PreparedStatement ps = con.prepareStatement(sql);
         
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                debit.setText(rs.getString(1));
            }
        } catch (SQLException se) {
        }
    }
      private void totalharga1(){
     try {
         dbconnect();
             sql = "select sum(kredit) from jurnal ";
            PreparedStatement ps = con.prepareStatement(sql);
         
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kredit.setText(rs.getString(1));
            }
        } catch (SQLException se) {
        }
    }
      
      private void hasil(){
           
   
  int totalharga,totalbayar,subtotal,subtotal1;
        String sub_total, stok_akhir,sub_total1,subtotalt;

        totalharga = Integer.parseInt(debit.getText());
        totalbayar = Integer.parseInt(kredit.getText());
      
        sub_total = String.valueOf(totalharga);
         subtotalt = String.valueOf(totalbayar);
        sisa.setText(sub_total);
        sisa.setText(subtotalt);
         
       subtotal1 = totalbayar-totalharga;
        sub_total1 = String.valueOf(subtotal1);
     
       
            if (totalbayar<totalharga){
        
                 sisa.setText(sub_total);
               
              
        }
        else {
                  sisa.setText(subtotalt);
                  
              
        
}
      }
}