
package View;
import Controller.Controller_BuktiPesan;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TBuktiPesan extends javax.swing.JFrame {
       
    Controller_BuktiPesan controller;   
 
    
    public TBuktiPesan() {
    initComponents();
    setLocationRelativeTo(this);
    controller = new Controller_BuktiPesan(this);  
    controller.reset();
}


    public JComboBox getCmbbarang() {
        return cmbbarang;
    }

    public JComboBox getCmbkategori() {
        return cmbkategori;
    }

    public JComboBox getCmbpelanggan() {
        return cmbpelanggan;
    }

    public JTable getTbldetil() {
        return tbldetil;
    }

    public JTextField getTxtharga() {
        return txtharga;
    }

    public JTextField getTxtkdbrg() {
        return txtkdbrg;
    }

    public JTextField getTxtkdkategori() {
        return txtkdkategori;
    }

    public JTextField getTxtkdplg() {
        return txtkdplg;
    }

    public JTextField getTxtnobp() {
        return txtnobp;
    }

    public JTextField getTxtqty() {
        return txtqty;
    }

    public JTextField getTxtstok() {
        return txtstok;
    }

    public JTextField getTxttglbp() {
        return txttglbp;
    }

    public JLabel getTxttotal() {
        return txttotal;
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttglbp = new javax.swing.JTextField();
        txtnobp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cmbpelanggan = new javax.swing.JComboBox();
        txtkdplg = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cmbkategori = new javax.swing.JComboBox();
        txtkdkategori = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbbarang = new javax.swing.JComboBox();
        txtharga = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtkdbrg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        cmdadd = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetil = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cmdbatal = new javax.swing.JButton();
        cmdsimpan = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CETAK BUKTI PESAN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 480, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(170, 10, 500, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(0, 0, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Tgl. Transaksi");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 50, 100, 20);

        jLabel9.setBackground(new java.awt.Color(0, 0, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("No. Transaksi");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 10, 100, 20);

        txttglbp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttglbp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txttglbp);
        txttglbp.setBounds(130, 50, 110, 30);

        txtnobp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnobp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtnobp);
        txtnobp.setBounds(130, 10, 110, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, 50, 20, 20);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(110, 10, 20, 20);

        jLabel32.setBackground(new java.awt.Color(0, 0, 153));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Year-Month-Date");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(250, 50, 100, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 60, 360, 90);

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(0, 0, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Nama Pelanggan");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 20, 120, 20);

        cmbpelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbpelanggan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Pilih-" }));
        cmbpelanggan.setBorder(null);
        cmbpelanggan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbpelangganItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbpelanggan);
        cmbpelanggan.setBounds(150, 20, 240, 30);

        txtkdplg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdplg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtkdplg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkdplg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkdplgKeyPressed(evt);
            }
        });
        jPanel3.add(txtkdplg);
        txtkdplg.setBounds(400, 20, 110, 30);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Kode :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(400, 0, 110, 20);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(":");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(130, 20, 20, 20);

        jLabel31.setBackground(new java.awt.Color(0, 0, 153));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("atau isikan kode pelanggan pada text kode");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(150, 50, 290, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 160, 540, 80);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(0, 0, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Nama Kategori");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 20, 120, 20);

        cmbkategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbkategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Pilih-" }));
        cmbkategori.setBorder(null);
        cmbkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbkategoriItemStateChanged(evt);
            }
        });
        jPanel4.add(cmbkategori);
        cmbkategori.setBounds(150, 20, 250, 30);

        txtkdkategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdkategori.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtkdkategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkdkategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkdkategoriKeyPressed(evt);
            }
        });
        jPanel4.add(txtkdkategori);
        txtkdkategori.setBounds(440, 20, 110, 30);

        jLabel15.setBackground(new java.awt.Color(0, 0, 153));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Harga");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(10, 120, 120, 20);

        cmbbarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbbarang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Pilih-" }));
        cmbbarang.setBorder(null);
        cmbbarang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbarangItemStateChanged(evt);
            }
        });
        jPanel4.add(cmbbarang);
        cmbbarang.setBounds(150, 60, 250, 30);

        txtharga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthargaKeyPressed(evt);
            }
        });
        jPanel4.add(txtharga);
        txtharga.setBounds(150, 120, 160, 30);

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Nama Barang");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 60, 120, 20);

        txtkdbrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdbrg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtkdbrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtkdbrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkdbrgKeyPressed(evt);
            }
        });
        jPanel4.add(txtkdbrg);
        txtkdbrg.setBounds(440, 60, 110, 30);

        jLabel17.setBackground(new java.awt.Color(0, 0, 153));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Qty");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(10, 160, 120, 20);

        txtqty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtqty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtqty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqtyKeyPressed(evt);
            }
        });
        jPanel4.add(txtqty);
        txtqty.setBounds(150, 160, 60, 30);

        jLabel18.setBackground(new java.awt.Color(0, 0, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Kode :");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(470, -10, 60, 40);

        txtstok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtstok.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtstok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtstok);
        txtstok.setBounds(380, 120, 60, 30);

        cmdadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd.setText("Add");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });
        cmdadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdaddKeyPressed(evt);
            }
        });
        jPanel4.add(cmdadd);
        cmdadd.setBounds(230, 160, 60, 30);

        jLabel19.setBackground(new java.awt.Color(0, 0, 153));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Stok");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(320, 120, 40, 20);

        jLabel26.setBackground(new java.awt.Color(0, 0, 153));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("**tambahkan ke Detil Belanja");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(300, 160, 220, 30);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(130, 20, 20, 20);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(":");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(130, 60, 20, 20);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(":");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(130, 120, 20, 20);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(":");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(130, 160, 20, 20);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText(":");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(360, 120, 20, 20);

        jLabel30.setBackground(new java.awt.Color(0, 0, 153));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("atau isikan kode kategori/barang pada text kode");
        jPanel4.add(jLabel30);
        jLabel30.setBounds(150, 90, 290, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 250, 570, 200);

        txttotal.setBackground(new java.awt.Color(0, 0, 102));
        txttotal.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 255, 255));
        txttotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttotal.setText("Rp. 0");
        txttotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txttotal.setOpaque(true);
        getContentPane().add(txttotal);
        txttotal.setBounds(440, 70, 330, 50);

        tbldetil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbldetil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbldetil.setModel(new javax.swing.table.DefaultTableModel(
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
        tbldetil.setRowHeight(23);
        tbldetil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldetilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldetil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 480, 760, 170);

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        cmdbatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdbatal.setText("BATAL");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });
        cmdbatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdbatalKeyPressed(evt);
            }
        });
        jPanel5.add(cmdbatal);
        cmdbatal.setBounds(10, 70, 110, 50);

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
        jPanel5.add(cmdsimpan);
        cmdsimpan.setBounds(10, 10, 110, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(640, 320, 130, 130);

        jLabel25.setBackground(new java.awt.Color(0, 0, 153));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("**Klik 2x pada baris data, untuk mengubah atau membatalkan pesanan");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(320, 460, 460, 20);

        jLabel27.setBackground(new java.awt.Color(0, 0, 153));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Detil Belanja :");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(20, 450, 240, 30);

        setSize(new java.awt.Dimension(805, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbpelangganItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbpelangganItemStateChanged
        if (getCmbpelanggan().getSelectedIndex() >0) { //mengantisipasi apabila terdapat data kosong
                 controller.tampilkdplg(); 
                 txtkdkategori.requestFocus();  
        }       
    }//GEN-LAST:event_cmbpelangganItemStateChanged

    private void cmbkategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbkategoriItemStateChanged
        if (getCmbkategori().getSelectedIndex() >0) { //mengantisipasi apabila terdapat data kosong               
                 controller.reset2();  
                 controller.tampilkdkategori();
                 controller.isicombobarang();     
        } 
    }//GEN-LAST:event_cmbkategoriItemStateChanged

    private void cmbbarangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbarangItemStateChanged
        if (getCmbbarang().getSelectedIndex() >0) { //mengantisipasi apabila terdapat data kosong                               
                controller.tampilkdbarang();                
                txtqty.requestFocus(); 
        }
    }//GEN-LAST:event_cmbbarangItemStateChanged

    private void tbldetilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldetilMouseClicked
         if (evt.getClickCount() == 2 ){    
                controller.resetrow();
                controller. hitung_grandtotal();
         }else {  
             controller.isiField(tbldetil.getSelectedRow());
         }
    }//GEN-LAST:event_tbldetilMouseClicked

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed
        controller.isiTable();
        controller. hitung_grandtotal();
        controller.reset3();
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdaddKeyPressed
        controller.isiTable();
        controller. hitung_grandtotal();
        controller.reset3();
    }//GEN-LAST:event_cmdaddKeyPressed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        
        controller.reset();   
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdbatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdbatalKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){ 
        
            controller.reset();
          }  
    }//GEN-LAST:event_cmdbatalKeyPressed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
        if ((!getTxtnobp().getText().isEmpty()) && (!getTxtkdplg().getText().isEmpty()) 
             && (getTbldetil().getRowCount()!=0)){   
            
                controller.simpan_transaksi();
                controller.simpan_detiltransaksi();
                controller.cetak();
                controller.reset();
            }
        else
            JOptionPane.showMessageDialog(null, "No. Transaksi atau Kode Pelanggan atau Detil Belanja, tidak boleh kosong!");                           
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdsimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdsimpanKeyPressed
        if ((!getTxtnobp().getText().isEmpty()) && (!getTxtkdplg().getText().isEmpty()) 
             && (getTbldetil().getRowCount()!=0)){ 
            
                controller.simpan_transaksi();
                controller.simpan_detiltransaksi();
                controller.cetak();
                controller.reset();
            }
        else
            JOptionPane.showMessageDialog(null, "No. Transaksi atau Kode Pelanggan atau Detil Belanja, tidak boleh kosong!");                           
    }//GEN-LAST:event_cmdsimpanKeyPressed

    private void txtkdplgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdplgKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){ 
              controller.tampilnmplg();     
              txtkdkategori.requestFocus();
          }  
    }//GEN-LAST:event_txtkdplgKeyPressed

    private void txtkdkategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdkategoriKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){ 
                txtkdbrg.setText("");
                txtharga.setText("");
                txtstok.setText("");
                txtqty.setText("");
                controller.tampilnmkategori();
                controller.isicombobarang();
                txtkdbrg.requestFocus();
          }  
    }//GEN-LAST:event_txtkdkategoriKeyPressed

    private void txtkdbrgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdbrgKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){             
  
             if ( getTxtkdbrg().getText().trim().isEmpty()){
                      txtharga.setText("");
                      txtstok.setText("");
                      txtqty.setText("");
                      controller.isicombobarang();                      
             }             
             else{
                      controller.tampilnmbarang();
                      controller.isicombobarang2();                            
             }             
          }  
    }//GEN-LAST:event_txtkdbrgKeyPressed

    private void txtqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){ 
            cmdadd.requestFocus();
        }
    }//GEN-LAST:event_txtqtyKeyPressed

    private void txthargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){  
              txtqty.requestFocus();
          }  
    }//GEN-LAST:event_txthargaKeyPressed

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
            java.util.logging.Logger.getLogger(TBuktiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TBuktiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TBuktiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TBuktiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TBuktiPesan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbbarang;
    private javax.swing.JComboBox cmbkategori;
    private javax.swing.JComboBox cmbpelanggan;
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdsimpan;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldetil;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkdbrg;
    private javax.swing.JTextField txtkdkategori;
    private javax.swing.JTextField txtkdplg;
    private javax.swing.JTextField txtnobp;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txttglbp;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
