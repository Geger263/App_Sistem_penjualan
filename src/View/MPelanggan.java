
package View;

import Controller.Controller_Pelanggan;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MPelanggan extends javax.swing.JFrame {

    Controller_Pelanggan controller;

    public MPelanggan() {
        initComponents();
        setLocationRelativeTo(this);
        controller = new Controller_Pelanggan(this); 
        controller.reset(); 
      }

    public JTextArea getTxtalamat() {
        return txtalamat;
    }

    public JTextField getTxtkdplg() {
        return txtkdplg;
    }

    public JTextField getTxtnmplg() {
        return txtnmplg;
    }

    public JTextField getTxttelp() {
        return txttelp;
    }

    public JTable getTblplg() {
        return tblplg;
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        txtkdplg = new javax.swing.JTextField();
        txtnmplg = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblplg = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmdbatal = new javax.swing.JButton();
        cmdsimpan = new javax.swing.JButton();
        cmdubah = new javax.swing.JButton();
        cmdhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 153));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRY DATA PELANGGAN");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 10, 330, 42);

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nama Pelanggan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 130, 42);

        jLabel4.setBackground(new java.awt.Color(0, 0, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(":");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 240, 20, 42);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Alamat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 170, 130, 40);

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("No. Telepon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 130, 40);

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Kode Pelanggan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 90, 130, 42);

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 90, 20, 42);

        jLabel8.setBackground(new java.awt.Color(0, 0, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 130, 20, 42);

        jLabel9.setBackground(new java.awt.Color(0, 0, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(":");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 170, 20, 42);

        txttelp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txttelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelpKeyPressed(evt);
            }
        });
        getContentPane().add(txttelp);
        txttelp.setBounds(190, 240, 160, 30);

        txtkdplg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdplg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkdplg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkdplgKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkdplgKeyReleased(evt);
            }
        });
        getContentPane().add(txtkdplg);
        txtkdplg.setBounds(190, 100, 160, 30);

        txtnmplg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnmplg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnmplg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmplgKeyPressed(evt);
            }
        });
        getContentPane().add(txtnmplg);
        txtnmplg.setBounds(190, 140, 290, 30);

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtalamat.setRows(5);
        txtalamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtalamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtalamatKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtalamat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(190, 180, 330, 50);

        tblplg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblplg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblplg.setModel(new javax.swing.table.DefaultTableModel(
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
        tblplg.setRowHeight(23);
        tblplg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblplgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblplg);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 670, 140);

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
        cmdbatal.setBounds(10, 150, 110, 30);

        cmdsimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdsimpan.setText("SIMPAN");
        cmdsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(cmdsimpan);
        cmdsimpan.setBounds(10, 10, 110, 30);

        cmdubah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdubah.setText("UBAH");
        cmdubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdubahActionPerformed(evt);
            }
        });
        jPanel1.add(cmdubah);
        cmdubah.setBounds(10, 50, 110, 30);

        cmdhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdhapus.setText("HAPUS");
        cmdhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdhapusActionPerformed(evt);
            }
        });
        jPanel1.add(cmdhapus);
        cmdhapus.setBounds(10, 90, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(560, 90, 130, 190);

        setSize(new java.awt.Dimension(723, 493));
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

    private void tblplgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblplgMouseClicked
        controller.isiField(tblplg.getSelectedRow());
        this.txtnmplg.requestFocus();
    }//GEN-LAST:event_tblplgMouseClicked

    private void txtkdplgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdplgKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
            if(txtkdplg.getText().isEmpty()){
                controller.reset();  
            }
            else                   
                //controller.isiTable();
                controller.isiTableCari();
                this.txtnmplg.requestFocus();

    }   
    }//GEN-LAST:event_txtkdplgKeyPressed

    private void txtkdplgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdplgKeyReleased
        controller.isiTableCari();  
        txtnmplg.setText("");
        txtalamat.setText("");
        txttelp.setText("");
        
    }//GEN-LAST:event_txtkdplgKeyReleased

    private void txtnmplgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmplgKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
              this.txtalamat.requestFocus();   
          }           
    }//GEN-LAST:event_txtnmplgKeyPressed

    private void txtalamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalamatKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
            this.txttelp.requestFocus();   
        }   
    }//GEN-LAST:event_txtalamatKeyPressed

    private void txttelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelpKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){      
              this.cmdsimpan.requestFocus();   
          }       
    }//GEN-LAST:event_txttelpKeyPressed

   
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
            java.util.logging.Logger.getLogger(MPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MPelanggan().setVisible(true);                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdhapus;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton cmdubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblplg;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtkdplg;
    private javax.swing.JTextField txtnmplg;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables


}
