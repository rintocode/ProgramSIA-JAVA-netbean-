/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 7
 */
public class pembelian extends javax.swing.JFrame {
private String sql;
private Connection con;
    public static ResultSet rs;
static java.sql.Statement stat;
   private String tgl;
    /**
     * Creates new form pembelian
     */
    public pembelian() {
        initComponents();
         new dbconnect().dbconnecte("no_faktur_beli", "pembelian", 4,"F");
        nofak.setText(dbconnect.penomoran);
     jButton9.setEnabled(false);
        cikan();
    tampil_pelanggan();
        cikin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        nm = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel37 = new javax.swing.JPanel();
        jumlah = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kode = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        kode3 = new javax.swing.JTextField();
        nofak = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        stok = new javax.swing.JTextField();
        kodebar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel29.setText("TOKO KOPI SEDUH");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 700, 5));

        jPanel34.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 700, 10));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "suplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("ID PEMASOK");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("NAMA PEMASOK");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nm)
                    .addComponent(jComboBox1, 0, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(38, 38, 38))
        );

        jPanel2.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, 130));

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "pembelian barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumlahKeyPressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("KODE BARANG");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("NAMA BARANG");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("HARGA BARANG");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("JUMLAH BARANG");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(harga, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jumlah)
                            .addComponent(kode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 330, 260));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("TANGGAL");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("TOTAL HARGA");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 155, 30));

        kode3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        kode3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kode3KeyPressed(evt);
            }
        });
        jPanel2.add(kode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 240, 70));
        jPanel2.add(nofak, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("NO FAKTUR");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("SUB TOTAL");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "tabel data pembelian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 2, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMOR", "KODE BARANG", "NAMA BARANG", "HARGA ", "JUMLAH"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 690, 100));

        jButton9.setText("SIMPAN");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 30));

        jButton10.setText("BARU");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, 30));

        jButton11.setText("KELUAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 80, 30));
        jPanel2.add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 150, 30));
        jPanel2.add(kodebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 413, -1, 0));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    String amanda;
        try {
            Object tampil=jComboBox1.getSelectedItem();
            amanda=tampil.toString();
           dbconnect();
            sql="SELECT * FROM suplier WHERE idpemasok='"+amanda+"'";
            stat=con.createStatement();
            rs = stat.executeQuery(sql);
            while(rs.next()) {
                jComboBox1.setSelectedItem(rs.getString("idpemasok"));
                nm.setText(rs.getString("nama"));
                 
            }
        } catch (Exception e) {
            jComboBox1.setSelectedItem("");
             nm.setText("");
          
        }            // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyPressed

      
             // TODO add your handling code here:
    }//GEN-LAST:event_jumlahKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton9.setEnabled(true); 
 
 
        float jumlah_beli, stok_awal, jum_stok,harga_beli, subtotal, total;
        String sub_total, stok_akhir;

        harga_beli = Float.parseFloat(harga.getText());
        jumlah_beli = Float.parseFloat(jumlah.getText());

        

        subtotal = harga_beli * jumlah_beli;
        sub_total = String.valueOf(subtotal);
        stok.setText(sub_total);

        try{
                dbconnect();
                
                sql="INSERT Into rincian_pembelian values('"
 +nofak.getText()+"','"                        
                       
                       +kode.getSelectedItem()+"','" 
                        +nama.getText()+"','" 
                        +harga.getText()+"','"      
                        +jumlah.getText()+"','"      
                        +stok.getText()+"')";                       
                        
                stat=con.createStatement();
                stat.execute(sql);
                        JOptionPane.showMessageDialog(null, "Success!!");
      nama.setText("");
      harga.setText("");
      jumlah.setText("");
       total_harga();
              
        tambah();
            } catch (Exception e) {
                total_harga();
                
            } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 String tgl="";
        try{
                dbconnect();
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                tgl=String.valueOf(format.format(jDateChooser2.getDate()));
                sql="INSERT Into pembelian values('"
 +nofak.getText()+"','"                        
                        +tgl+"','"
                       +jComboBox1.getSelectedItem()+"','" 
                        +stok.getText()+"')";                       
                        
                stat=con.createStatement();
                stat.execute(sql);
                        JOptionPane.showMessageDialog(null, "Success!!");
      
       
        tampil_pelanggan();
        nm.setText("");
        
            } catch (Exception e) {
                
            } 
         
       
        
            
       
            
        nofak.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jComboBox1.setEnabled(false);
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
if (jDateChooser1.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
            tgl=format.format(jDateChooser1.getDate());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
  new dbconnect().dbconnecte("no_faktur_beli", "pembelian", 4,"F");
        nofak.setText(dbconnect.penomoran);
        kodebar.setText("");
        nama.setText("");
    
     
        harga.setText(""); 
jumlah.setText(""); 
  nofak.setEnabled(true);
        jDateChooser1.setEnabled(true);
        jComboBox1.setEnabled(true);
        nm.setEnabled(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void kode3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode3KeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_kode3KeyPressed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
 String amanda;
        try {
            Object tampil=kode.getSelectedItem();
            amanda=tampil.toString();
           dbconnect();
            sql="SELECT * FROM barang WHERE kodebarang='"+amanda+"'";
            stat=con.createStatement();
            rs = stat.executeQuery(sql);
            while(rs.next()) {
               
                nama.setText(rs.getString("nmbarang"));
                 harga.setText(rs.getString("hargabeli"));
                 
            }
        } catch (Exception e) {
            kode.setSelectedItem("");
             nama.setText("");
          
        }                  // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

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
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JComboBox kode;
    private javax.swing.JTextField kode3;
    private javax.swing.JTextField kodebar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField nofak;
    private javax.swing.JTextField stok;
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



  private void cikan(){
        jComboBox1.removeAllItems();
        jComboBox1.addItem("PILIH");
        jComboBox1.setSelectedItem("PILIH");
        try {
            dbconnect();
            sql="SELECT * FROM suplier";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);

            while(rs.next())
            {
                jComboBox1.addItem(rs.getString("idpemasok"));
            }
            rs.close();
        } catch (Exception e) {
        }
    }
  private void cikin(){
        kode.removeAllItems();
        kode.addItem("PILIH");
        kode.setSelectedItem("PILIH");
        try {
            dbconnect();
            sql="SELECT * FROM barang";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);

            while(rs.next())
            {
                kode.addItem(rs.getString("kodebarang"));
            }
            rs.close();
        } catch (Exception e) {
        }
    }


private void simpanikan(){
   String tgl="";
        try{
                dbconnect();
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                tgl=String.valueOf(format.format(jDateChooser2.getDate()));
                 sql="insert into pembelian values('"  
                                                  
                                                 +nofak.getText()+"','"
                                                 +tgl+"','"                                  
                                                 +jComboBox1.getSelectedItem()+"','" 
                                                 +stok.getText()+ "')";
                  
                stat=con.createStatement();
                stat.execute(sql);
                     
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "gagal");
            }
}
private void total_harga(){
     try {
         dbconnect();
             sql = "select sum(subtotal) from rincian_pembelian where no_faktur_beli = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nofak.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kode3.setText(rs.getString(1));
            }
        } catch (SQLException se) {
        }
    }

private void harga(){
    
int a, b, c;
        String d;

        a = Integer.parseInt(harga.getText());
        b = Integer.parseInt(jumlah.getText());
        c = a;
        d = String.valueOf(c);
        try {
            String SQL = "update barang set hargabeli=" + d + " where kodebarang ='" +kodebar.getText()+ "'";
            stat = con.createStatement();
            int data = stat.executeUpdate(SQL);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(this, " gagal" + se.getMessage());
        }
    }
 
    private void tampil_pelanggan()
    {
     DefaultTableModel tableModel=new DefaultTableModel();
        tableModel.addColumn("NOMOR");
        tableModel.addColumn("KODE BARANG");
        tableModel.addColumn("NAMA BARANG");
        tableModel.addColumn("HARGA");
        tableModel.addColumn("JUMLAH");
 
    
        
        int no=1;
        try{
           Class.forName("sun.jdbc.odbc.JdbcOdbc");
            con=DriverManager.getConnection("jdbc:odbc:dstoko");
            String sql="select * from rincian_pembelian ";
            Statement stat=con.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                tableModel.addRow(new Object[]{(""+no++),
                rs.getString("kodebarang"),
                rs.getString("nama"),
               rs.getString("harga_barang"),
                rs.getString("jumlah_beli")});
            }
            jTable1.setModel(tableModel);
        }catch(Exception e){  
        }  
    }
private void tambah(){
      
                try {
                    dbconnect();
                    String sql ="update barang set stok = stok + '"+jumlah.getText()

                    +"'where kodebarang ='"+kode.getSelectedItem()+"'";

                    stat=con.createStatement();
                    stat.execute(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");

                   
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        }


