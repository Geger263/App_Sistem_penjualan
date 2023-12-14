
package View;
import Controller.Controller_Kategori;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;


public class MKategoriBarang extends javax.swing.JFrame {
    
    Controller_Kategori controller;
    //konstruktor
    public MKategoriBarang() {
        initComponents();
        setLocationRelativeTo(this);
        controller = new Controller_Kategori(this);    
        controller.isiTable();
        controller.reset();          
        }
          
    public JTable getTblkategori() {
        return tblkategori;
    }

    public JTextField getTxtkdkategori() {
        return txtkdkategori;
    }

    public JTextField getTxtnmkategori() {
        return txtnmkategori;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkdkategori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnmkategori = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkategori = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmdbatal = new javax.swing.JButton();
        cmdsimpan = new javax.swing.JButton();
        cmdubah = new javax.swing.JButton();
        cmdhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRY KATEGORI BARANG");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 20, 400, 42);

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Kode Kategori");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 90, 130, 42);

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 90, 20, 42);

        txtkdkategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdkategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkdkategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkdkategoriKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkdkategoriKeyReleased(evt);
            }
        });
        getContentPane().add(txtkdkategori);
        txtkdkategori.setBounds(190, 100, 160, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nama Kategori");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 130, 42);

        jLabel8.setBackground(new java.awt.Color(0, 0, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 130, 20, 42);

        txtnmkategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnmkategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnmkategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmkategoriKeyPressed(evt);
            }
        });
        getContentPane().add(txtnmkategori);
        txtnmkategori.setBounds(190, 140, 290, 30);

        tblkategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblkategori.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblkategori.setModel(new javax.swing.table.DefaultTableModel(
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
        tblkategori.setRowHeight(23);
        tblkategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkategori);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 610, 150);

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
        cmdbatal.setBounds(477, 12, 110, 30);

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
        cmdsimpan.setBounds(14, 12, 110, 30);

        cmdubah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdubah.setText("UBAH");
        cmdubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdubahActionPerformed(evt);
            }
        });
        jPanel1.add(cmdubah);
        cmdubah.setBounds(142, 12, 110, 30);

        cmdhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdhapus.setText("HAPUS");
        cmdhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdhapusActionPerformed(evt);
            }
        });
        jPanel1.add(cmdhapus);
        cmdhapus.setBounds(270, 12, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 200, 610, 60);

        setSize(new java.awt.Dimension(671, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
        controller.insert();        
        controller.reset();        
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdubahActionPerformed
        controller.update();        
        controller.reset();        
    }//GEN-LAST:event_cmdubahActionPerformed

    private void cmdhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdhapusActionPerformed
        controller.delete();        
        controller.reset();        
    }//GEN-LAST:event_cmdhapusActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        controller.reset();        
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void tblkategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkategoriMouseClicked
        controller.isiField(tblkategori.getSelectedRow());
        this.txtkdkategori.requestFocus();
    }//GEN-LAST:event_tblkategoriMouseClicked

    private void cmdsimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdsimpanKeyPressed
         controller.insert();         
         controller.reset();            
    }//GEN-LAST:event_cmdsimpanKeyPressed

    private void txtkdkategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdkategoriKeyPressed
    if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(txtkdkategori.getText().isEmpty()){
                controller.reset();  
            }
            else
                controller.isiTable();
                controller.isiTableCari();    
                this.txtnmkategori.requestFocus();        
    }//GEN-LAST:event_txtkdkategoriKeyPressed
    }
    
    private void txtnmkategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmkategoriKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        this.cmdsimpan.requestFocus();   
    }  
    }//GEN-LAST:event_txtnmkategoriKeyPressed

    private void txtkdkategoriKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdkategoriKeyReleased
        controller.isiTableCari(); 
        txtnmkategori.setText("");
    }//GEN-LAST:event_txtkdkategoriKeyReleased
    
        
   
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
            java.util.logging.Logger.getLogger(MKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MKategoriBarang().setVisible(true);                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdhapus;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton cmdubah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblkategori;
    private javax.swing.JTextField txtkdkategori;
    private javax.swing.JTextField txtnmkategori;
    // End of variables declaration//GEN-END:variables
}
