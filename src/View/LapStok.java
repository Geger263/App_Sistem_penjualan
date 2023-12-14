package View;
import Controller.Controller_LapStok;

public class LapStok extends javax.swing.JFrame {

    Controller_LapStok controller;
    
    public LapStok() {
        initComponents(); 
        controller = new Controller_LapStok(); 
    }

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPanel2 = new javax.swing.JPanel();
        cmdexcel = new javax.swing.JButton();
        cmdpreview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel1.setBackground(new java.awt.Color(0, 0, 255));
        JPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CETAK LAPORAN STOK");
        JPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 370, 29);

        getContentPane().add(JPanel1);
        JPanel1.setBounds(30, 10, 420, 50);

        JPanel2.setBackground(new java.awt.Color(0, 0, 255));
        JPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel2.setLayout(null);

        cmdexcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdexcel.setText("EXCEL");
        cmdexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexcelActionPerformed(evt);
            }
        });
        JPanel2.add(cmdexcel);
        cmdexcel.setBounds(300, 10, 100, 40);

        cmdpreview.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdpreview.setText("PREVIEW");
        cmdpreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpreviewActionPerformed(evt);
            }
        });
        JPanel2.add(cmdpreview);
        cmdpreview.setBounds(20, 10, 100, 40);

        getContentPane().add(JPanel2);
        JPanel2.setBounds(30, 120, 420, 60);

        setSize(new java.awt.Dimension(492, 261));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexcelActionPerformed
        controller.cetak_excel();
    }//GEN-LAST:event_cmdexcelActionPerformed

    private void cmdpreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpreviewActionPerformed
        controller.cetak_preview();
    }//GEN-LAST:event_cmdpreviewActionPerformed

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
            java.util.logging.Logger.getLogger(LapStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LapStok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JButton cmdexcel;
    private javax.swing.JButton cmdpreview;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
