package View;

import Controller.Controller_Barang;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MBarang extends javax.swing.JFrame {
   
    Controller_Barang controller;
    
    public MBarang() {
        initComponents();
        setLocationRelativeTo(this);
        controller = new Controller_Barang(this);           
        controller.reset();
    }

    public JComboBox getCmbkategori() {
        return cmbkategori;
    }

    public JComboBox getCmbsatuan() {
        return cmbsatuan;
    }

    public JTable getTblbarang() {
        return tblbarang;
    }

    public JTextField getTxtharga() {
        return txtharga;
    }

    public JTextField getTxtkatakunci() {
        return txtkatakunci;
    }

    public JTextField getTxtkdbarang() {
        return txtkdbarang;
    }

    public JTextField getTxtnmbarang() {
        return txtnmbarang;
    }

    public JTextField getTxtnmkategori() {
        return txtnmkategori;
    }

    public JTextField getTxtstok() {
        return txtstok;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmdbatal = new javax.swing.JButton();
        cmdsimpan = new javax.swing.JButton();
        cmdubah = new javax.swing.JButton();
        cmdhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbarang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnmkategori = new javax.swing.JTextField();
        cmbsatuan = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtkdbarang = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnmbarang = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        cmbkategori = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtkatakunci = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        cmdbatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdbatal.setText("BATAL");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });
        jPanel1.add(cmdbatal);
        cmdbatal.setBounds(20, 210, 110, 50);

        cmdsimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdsimpan.setText("SIMPAN");
        cmdsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsimpanActionPerformed(evt);
            }
        });
        cmdsimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdsimpanKeyPressed(evt);
            }
        });
        jPanel1.add(cmdsimpan);
        cmdsimpan.setBounds(20, 20, 110, 50);

        cmdubah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdubah.setText("UBAH");
        cmdubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdubahActionPerformed(evt);
            }
        });
        jPanel1.add(cmdubah);
        cmdubah.setBounds(20, 80, 110, 50);

        cmdhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdhapus.setText("HAPUS");
        cmdhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdhapusActionPerformed(evt);
            }
        });
        jPanel1.add(cmdhapus);
        cmdhapus.setBounds(20, 140, 110, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(620, 80, 150, 280);

        tblbarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblbarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblbarang.setRowHeight(23);
        tblbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbarang);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 410, 740, 140);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Kode Kategori");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 20, 130, 20);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Nama Kategori");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 60, 130, 20);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(180, 60, 20, 20);

        txtnmkategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnmkategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtnmkategori);
        txtnmkategori.setBounds(210, 60, 340, 30);

        cmbsatuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbsatuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Pilih-", "Pcs", "Buah", "Stel", "Lusin", "Box" }));
        cmbsatuan.setBorder(null);
        cmbsatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbsatuanKeyPressed(evt);
            }
        });
        jPanel2.add(cmbsatuan);
        cmbsatuan.setBounds(210, 180, 200, 30);

        jLabel11.setBackground(new java.awt.Color(0, 0, 153));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("**Pilih Kategori");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(360, 20, 130, 30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Kode Barang");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 100, 130, 20);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(180, 100, 20, 20);

        txtkdbarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdbarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtkdbarang);
        txtkdbarang.setBounds(210, 100, 140, 30);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Nama Barang");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 140, 130, 20);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(180, 140, 20, 20);

        txtnmbarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnmbarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnmbarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmbarangKeyPressed(evt);
            }
        });
        jPanel2.add(txtnmbarang);
        txtnmbarang.setBounds(210, 140, 340, 30);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Satuan");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 180, 130, 20);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(180, 180, 20, 20);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Harga (Rp.)");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 220, 130, 20);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(":");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(180, 220, 20, 20);

        txtharga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthargaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthargaKeyReleased(evt);
            }
        });
        jPanel2.add(txtharga);
        txtharga.setBounds(210, 220, 140, 30);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Stok");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(360, 220, 50, 20);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(":");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(400, 220, 20, 20);

        txtstok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtstok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtstokKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstokKeyReleased(evt);
            }
        });
        jPanel2.add(txtstok);
        txtstok.setBounds(420, 220, 80, 30);

        cmbkategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbkategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Pilih-" }));
        cmbkategori.setBorder(null);
        cmbkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbkategoriItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbkategori);
        cmbkategori.setBounds(210, 20, 140, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(180, 20, 20, 20);

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("**Generate dari kode kategori");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(360, 100, 240, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 80, 570, 280);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRY DATA BARANG");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 370, 29);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(200, 10, 390, 50);

        jLabel22.setBackground(new java.awt.Color(0, 0, 153));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Kata Kunci Pencarian");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(30, 370, 160, 20);

        jLabel23.setBackground(new java.awt.Color(0, 0, 153));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(":");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(190, 370, 20, 20);

        txtkatakunci.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkatakunci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkatakunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkatakunciKeyReleased(evt);
            }
        });
        getContentPane().add(txtkatakunci);
        txtkatakunci.setBounds(220, 370, 140, 30);

        jLabel24.setBackground(new java.awt.Color(0, 0, 153));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("**Isikan kode barang");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(370, 370, 240, 30);

        setSize(new java.awt.Dimension(797, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        controller.reset();     
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
        controller.insert();  
        controller.reset();  
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdsimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdsimpanKeyPressed
        controller.insert(); 
        controller.reset(); 
    }//GEN-LAST:event_cmdsimpanKeyPressed

    private void cmdubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdubahActionPerformed
        controller.update();            
        controller.reset();     
    }//GEN-LAST:event_cmdubahActionPerformed

    private void cmdhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdhapusActionPerformed
        controller.delete(); 
        controller.reset(); 
    }//GEN-LAST:event_cmdhapusActionPerformed

    private void tblbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbarangMouseClicked
        controller.isiField(tblbarang.getSelectedRow());
        this.txtnmbarang.requestFocus();
    }//GEN-LAST:event_tblbarangMouseClicked
    
    
    private void txtnmbarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmbarangKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
              this.cmbsatuan.requestFocus();   
          }        
    }//GEN-LAST:event_txtnmbarangKeyPressed

    private void txthargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
              this.txtstok.requestFocus();   
          }     
    }//GEN-LAST:event_txthargaKeyPressed

    private void txthargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyReleased
       char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) 
           || (karakter == KeyEvent.VK_DELETE)|| (karakter == KeyEvent.VK_ENTER)))){
             JOptionPane.showMessageDialog(null, "Inputan data harus berupa angka!");             
        }
    }//GEN-LAST:event_txthargaKeyReleased

    private void txtstokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
              this.cmdsimpan.requestFocus();   
          }     
    }//GEN-LAST:event_txtstokKeyPressed

    private void txtstokKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyReleased
         char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) 
           || (karakter == KeyEvent.VK_DELETE)|| (karakter == KeyEvent.VK_ENTER)))){
             JOptionPane.showMessageDialog(null, "Inputan data harus berupa angka!");             
        }
    }//GEN-LAST:event_txtstokKeyReleased

    private void cmbkategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbkategoriItemStateChanged
    
        if (getCmbkategori().getSelectedIndex() >0) { //mengantisipasi apabila terdapat data kosong
                 controller.tampilurutankode();                    
                 controller.tampilnamakategori();
                 txtnmbarang.requestFocus();  
        }        
    }//GEN-LAST:event_cmbkategoriItemStateChanged

    private void txtkatakunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkatakunciKeyReleased
        controller.isiTableCari();        
    }//GEN-LAST:event_txtkatakunciKeyReleased

    private void cmbsatuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbsatuanKeyPressed
           if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
              this.txtharga.requestFocus();   
          }
    }//GEN-LAST:event_cmbsatuanKeyPressed

    
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
            java.util.logging.Logger.getLogger(MBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbkategori;
    private javax.swing.JComboBox cmbsatuan;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdhapus;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton cmdubah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbarang;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkatakunci;
    private javax.swing.JTextField txtkdbarang;
    private javax.swing.JTextField txtnmbarang;
    private javax.swing.JTextField txtnmkategori;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}