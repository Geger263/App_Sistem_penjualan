
package View;

public class MenuUtama extends javax.swing.JFrame {
   
    public MenuUtama() {
        initComponents();                 
        this.setSize(2000, 2000);
         jPanel1.setSize(2000, 2000);
         setLocationRelativeTo(this);
         Koneksi.Database.KoneksiDB();  
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MMenu = new javax.swing.JMenu();
        MPelanggan = new javax.swing.JMenuItem();
        MKategori = new javax.swing.JMenuItem();
        MBarang = new javax.swing.JMenuItem();
        MPetugas = new javax.swing.JMenuItem();
        MTransaksi = new javax.swing.JMenu();
        TBuktiPesan = new javax.swing.JMenuItem();
        MLaporan = new javax.swing.JMenu();
        LPelanggan = new javax.swing.JMenuItem();
        LBarang = new javax.swing.JMenuItem();
        LPendapatan = new javax.swing.JMenuItem();
        MExit = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 420);

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 255));

        MMenu.setText("File Master");
        MMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMenuActionPerformed(evt);
            }
        });

        MPelanggan.setText("Entry Data Pelanggan");
        MPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPelangganActionPerformed(evt);
            }
        });
        MMenu.add(MPelanggan);

        MKategori.setText("Entry Data Kategori");
        MKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKategoriActionPerformed(evt);
            }
        });
        MMenu.add(MKategori);

        MBarang.setText("Entry Data Barang");
        MBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBarangActionPerformed(evt);
            }
        });
        MMenu.add(MBarang);

        MPetugas.setText("Entry Data Petugas");
        MPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPetugasActionPerformed(evt);
            }
        });
        MMenu.add(MPetugas);

        jMenuBar1.add(MMenu);

        MTransaksi.setText("Transaksi");

        TBuktiPesan.setText("Bukti Pesanan");
        TBuktiPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBuktiPesanActionPerformed(evt);
            }
        });
        MTransaksi.add(TBuktiPesan);

        jMenuBar1.add(MTransaksi);

        MLaporan.setText("Laporan");

        LPelanggan.setText("Laporan Data Pelanggan");
        LPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPelangganActionPerformed(evt);
            }
        });
        MLaporan.add(LPelanggan);

        LBarang.setText("Laporan Data Barang");
        LBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBarangActionPerformed(evt);
            }
        });
        MLaporan.add(LBarang);

        LPendapatan.setText("Laporan Pendapatan");
        LPendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPendapatanActionPerformed(evt);
            }
        });
        MLaporan.add(LPendapatan);

        jMenuBar1.add(MLaporan);

        MExit.setText("Exit Program");
        MExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MExit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MExitMouseClicked
        System.exit(0);
         
    }//GEN-LAST:event_MExitMouseClicked

    private void MPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPelangganActionPerformed
         View.MPelanggan P = new View.MPelanggan();
         P.setVisible(true); 
         setLocationRelativeTo(this);
         P.getTxtnmplg().requestFocus();                                 
    }//GEN-LAST:event_MPelangganActionPerformed

    private void TBuktiPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBuktiPesanActionPerformed
         View.TBuktiPesan T = new View.TBuktiPesan();
         T.setVisible(true); 
         setLocationRelativeTo(this);
         T.getTxtkdplg().requestFocus();  
    }//GEN-LAST:event_TBuktiPesanActionPerformed

    private void MKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKategoriActionPerformed
         View.MKategoriBarang k = new View.MKategoriBarang();
         k.setVisible(true);   
         setLocationRelativeTo(this);
         k.getTxtnmkategori().requestFocus();
    }//GEN-LAST:event_MKategoriActionPerformed

    private void MBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBarangActionPerformed
         View.MBarang B = new View.MBarang();
         B.setVisible(true);   
         setLocationRelativeTo(this);
         B.getTxtnmbarang().requestFocus();
    }//GEN-LAST:event_MBarangActionPerformed

    private void LBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBarangActionPerformed
         View.LapStok B = new View.LapStok();
         B.setVisible(true);   
         setLocationRelativeTo(this);  
    }//GEN-LAST:event_LBarangActionPerformed

    private void LPendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPendapatanActionPerformed
         View.LapPendapatan P = new View.LapPendapatan();
         P.setVisible(true);   
         setLocationRelativeTo(this); 
         P.getTgl1().requestFocus();
    }//GEN-LAST:event_LPendapatanActionPerformed

    private void LPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPelangganActionPerformed
        View.LapPelanggan P = new View.LapPelanggan();  
        P.setVisible(true);
        setLocationRelativeTo(this);
    }//GEN-LAST:event_LPelangganActionPerformed

    private void MMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMenuActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_MMenuActionPerformed

    private void MPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPetugasActionPerformed
        // TODO add your handling code here:
            View.MPetugas P = new View.MPetugas();
         P.setVisible(true); 
         setLocationRelativeTo(this);
         P.getTxtnmpetugas().requestFocus();
    }//GEN-LAST:event_MPetugasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true); 
                //menu utama maximize otomatis
                /*MenuUtama P = new MenuUtama();
                P.setVisible(true);   
                P.setExtendedState(P.MAXIMIZED_BOTH);//untuk maximize otomatis*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LBarang;
    private javax.swing.JMenuItem LPelanggan;
    private javax.swing.JMenuItem LPendapatan;
    private javax.swing.JMenuItem MBarang;
    private javax.swing.JMenu MExit;
    private javax.swing.JMenuItem MKategori;
    private javax.swing.JMenu MLaporan;
    private javax.swing.JMenu MMenu;
    private javax.swing.JMenuItem MPelanggan;
    private javax.swing.JMenuItem MPetugas;
    private javax.swing.JMenu MTransaksi;
    private javax.swing.JMenuItem TBuktiPesan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
