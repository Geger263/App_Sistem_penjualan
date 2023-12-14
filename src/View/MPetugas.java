package View;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Controller.Controller_Petugas;
import java.awt.event.KeyEvent;


public class MPetugas extends javax.swing.JFrame {

    /**
     * Creates new form MPetugas
     */
        Controller_Petugas controller;
    
    public MPetugas() {
        initComponents();
        setLocationRelativeTo(this);
        controller = new Controller_Petugas(this);
        controller.reset();
    }

    public JTable getTblpetugas() {
        return tblpetugas;
    }

    public JTextArea getTxtalamat() {
        return txtalamat;
    }

    public JTextField getTxtkatakunci() {
        return txtkatakunci;
    }

    public JTextField getTxtkdpetugas() {
        return txtkdpetugas;
    }

    public JTextField getTxtnmpetugas() {
        return txtnmpetugas;
    }

    public JTextField getTxttelp() {
        return txttelp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtkdpetugas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnmpetugas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpetugas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmdbatal = new javax.swing.JButton();
        cmdsimpan = new javax.swing.JButton();
        cmdubah = new javax.swing.JButton();
        cmdhapus = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtkatakunci = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRY DATA PETUGAS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 10, 400, 42);

        jLabel12.setBackground(new java.awt.Color(0, 0, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Kode Petugas");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 80, 130, 20);

        jLabel13.setBackground(new java.awt.Color(0, 0, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(230, 80, 20, 20);

        txtkdpetugas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtkdpetugas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkdpetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkdpetugasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkdpetugasKeyReleased(evt);
            }
        });
        getContentPane().add(txtkdpetugas);
        txtkdpetugas.setBounds(260, 80, 140, 30);

        jLabel14.setBackground(new java.awt.Color(0, 0, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Nama Petugas");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(90, 120, 130, 20);

        jLabel15.setBackground(new java.awt.Color(0, 0, 153));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(230, 120, 20, 20);

        txtnmpetugas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnmpetugas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnmpetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmpetugasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnmpetugasKeyReleased(evt);
            }
        });
        getContentPane().add(txtnmpetugas);
        txtnmpetugas.setBounds(260, 120, 400, 30);

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Alamat");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(90, 160, 130, 20);

        jLabel17.setBackground(new java.awt.Color(0, 0, 153));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(230, 160, 20, 20);

        txttelp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txttelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelpKeyReleased(evt);
            }
        });
        getContentPane().add(txttelp);
        txttelp.setBounds(260, 220, 200, 30);

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtalamat.setRows(5);
        txtalamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtalamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtalamatKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtalamat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(260, 160, 400, 50);

        jLabel18.setBackground(new java.awt.Color(0, 0, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("No. Telepon");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(90, 220, 130, 20);

        jLabel19.setBackground(new java.awt.Color(0, 0, 153));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(":");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(230, 220, 20, 20);

        tblpetugas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblpetugas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblpetugas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Kode Petugas", "Nama Petugas", "Alamat", "No. Telp"
            }
        ));
        tblpetugas.setRowHeight(23);
        tblpetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpetugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpetugas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 420, 670, 140);

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
        cmdubah.setBounds(170, 10, 110, 30);

        cmdhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdhapus.setText("HAPUS");
        cmdhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdhapusActionPerformed(evt);
            }
        });
        jPanel1.add(cmdhapus);
        cmdhapus.setBounds(330, 10, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 290, 610, 60);

        jLabel20.setBackground(new java.awt.Color(0, 0, 153));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("**inputkan kode atau nama petugas");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(440, 380, 250, 20);

        jLabel21.setBackground(new java.awt.Color(0, 0, 153));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(":");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(170, 380, 20, 20);

        txtkatakunci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtkatakunci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkatakunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkatakunciKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkatakunciKeyReleased(evt);
            }
        });
        getContentPane().add(txtkatakunci);
        txtkatakunci.setBounds(190, 380, 240, 30);

        jLabel22.setBackground(new java.awt.Color(0, 0, 153));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Kata Kunci Pencarian");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(30, 380, 130, 20);

        setSize(new java.awt.Dimension(733, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtkdpetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdpetugasKeyPressed
         // TODO add your handling code here
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if(txtkdpetugas.getText().isEmpty()){
                controller.reset();
            }
            else
                controller.isiTable();
            this.txtnmpetugas.requestFocus();
        }
    }//GEN-LAST:event_txtkdpetugasKeyPressed

    private void txtkdpetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdpetugasKeyReleased
          // TODO add your handling code here:
        controller.isiTableCari();
    }//GEN-LAST:event_txtkdpetugasKeyReleased

    private void txtnmpetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmpetugasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmpetugasKeyPressed

    private void txtnmpetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmpetugasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmpetugasKeyReleased

    private void txttelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelpKeyPressed

    private void txttelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelpKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelpKeyReleased

    private void txtalamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalamatKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.txttelp.requestFocus();
        }
    }//GEN-LAST:event_txtalamatKeyPressed

    private void tblpetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpetugasMouseClicked
      // TODO add your handling code here:
        controller.isiField(tblpetugas.getSelectedRow());
        this.txtnmpetugas.requestFocus();
    }//GEN-LAST:event_tblpetugasMouseClicked

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
 // TODO add your handling code here:
        
        controller.reset();
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
// TODO add your handling code here:
       controller.insert();        
        controller.reset();                   
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdsimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdsimpanKeyPressed

    }//GEN-LAST:event_cmdsimpanKeyPressed

    private void cmdubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdubahActionPerformed
 // TODO add your handling code here:
        controller.update();        
        controller.reset();  
    }//GEN-LAST:event_cmdubahActionPerformed

    private void cmdhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdhapusActionPerformed
  // TODO add your handling code here:
        controller.delete();
        controller.reset();
    }//GEN-LAST:event_cmdhapusActionPerformed

    private void txtkatakunciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkatakunciKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkatakunciKeyPressed

    private void txtkatakunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkatakunciKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkatakunciKeyReleased

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
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MPetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdhapus;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton cmdubah;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpetugas;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtkatakunci;
    private javax.swing.JTextField txtkdpetugas;
    private javax.swing.JTextField txtnmpetugas;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}
