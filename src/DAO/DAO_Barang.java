package DAO;

import Koneksi.Database;
import Model.Barang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DAO_Barang implements Model_DAO<Barang> {

    public DAO_Barang() {
        connection = Database.KoneksiDB();
    }

    Connection connection;
    String INSERT = "INSERT INTO barang(kdbrg,nmbrg,satuan,hargabrg,stok,kdkategori) values(?,?,?,?,?,?)";
    String UPDATE = "UPDATE barang SET nmbrg=?,satuan=?, hargabrg=?,stok=?,kdkategori=? WHERE kdbrg=?";
    String DELETE = "DELETE FROM barang WHERE kdbrg=?";
    String SELECT = "SELECT a.*, b.* FROM barang a, kategori b where a.kdkategori=b.kdkategori order by kdbrg";
    String CARI = "SELECT a.*, b.* FROM barang a, kategori b where a.kdkategori=b.kdkategori and kdbrg like ?";
    String CARIKATEGORI = "SELECT * FROM kategori where kdkategori=?";
    String COMBO = "SELECT kdkategori from kategori order by convert(right(kdkategori,2),signed integer)";
    String COUNTER = "SELECT ifnull(max(convert(right(kdbrg,2),signed integer)),0) as kode,"
            + "ifnull(length(max(convert(right(kdbrg,2),signed integer))),0)as panjang "
            + "from barang where kdkategori=?";
//    String COUNTER = "SELECT max(convert(right(kdbrg,2),signed integer)) as kode, length(max(convert(right(kdbrg,2),signed integer))) as panjang from barang where kdkategori=?";

    @Override
    public int autonumber(Barang object) {
        return 0;
    }

     @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public void insert(Barang object) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CARI);
            statement.setString(1, object.getKodebarang());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) //jika data sudah pernah disimpan
            {
                JOptionPane.showMessageDialog(null, "Data sudah pernah di simpan!");
            } else {    //jika data belum pernah disimpan             
                PreparedStatement statement2 = null;
                statement2 = connection.prepareStatement(INSERT);
                statement2.setString(1, object.getKodebarang());
                statement2.setString(2, object.getNamabarang());
                statement2.setString(3, object.getSatuan());
                statement2.setInt(4, object.getHarga());
                statement2.setInt(5, object.getStok());
                statement2.setInt(6, object.getKodekategori());
                statement2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil di simpan!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(Barang object) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CARI);
            statement.setString(1, object.getKodebarang());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) //jika data sudah pernah disimpan
            {
                statement = connection.prepareStatement(UPDATE);
                statement.setString(1, object.getNamabarang());
                statement.setString(2, object.getSatuan());
                statement.setInt(3, object.getHarga());
                statement.setInt(4, object.getStok());
                statement.setInt(5, object.getKodekategori());
                statement.setString(6, object.getKodebarang());
                statement.executeUpdate();                    
                JOptionPane.showMessageDialog(null, "Data berhasil di ubah!");                
            } else {    //jika data belum pernah disimpan     
                JOptionPane.showMessageDialog(null, "Kode barang tersebut belum pernah di simpan!");    
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public void delete(String id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Barang> getAll() {
        List<Barang> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<Barang>();
            statement = connection.prepareStatement(SELECT);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Barang b = new Barang();
                b.setKodebarang(rs.getString("kdbrg"));
                b.setNamabarang(rs.getString("nmbrg"));
                b.setSatuan(rs.getString("satuan"));
                b.setHarga(rs.getInt("hargabrg"));
                b.setStok(rs.getInt("stok"));
                b.setKodekategori(rs.getInt("a.kdkategori"));
                b.setNamakategori(rs.getString("nmkategori"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Barang> getCari(String key) {
        List<Barang> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<Barang>();
            statement = connection.prepareStatement(CARI);
            statement.setString(1, "%"+key+"%");
            ResultSet rs = statement.executeQuery();
 
            while (rs.next()) {
            Barang b = new Barang();
            b.setKodebarang(rs.getString("kdbrg"));
            b.setNamabarang(rs.getString("nmbrg"));
            b.setSatuan(rs.getString("satuan"));
            b.setHarga(rs.getInt("hargabrg"));
            b.setStok(rs.getInt("stok"));
            b.setKodekategori(rs.getInt("a.kdkategori"));
            b.setNamakategori(rs.getString("nmkategori"));
            list.add(b);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String autonumber2(Integer id) {
        PreparedStatement statement = null;
        int nomor_berikutnya = 0;
        String urutan = "";
        try {

            statement = connection.prepareStatement(COUNTER);
            statement.setInt(1, id);
            ResultSet rs2 = statement.executeQuery();
            if (rs2.next()) {               
                 nomor_berikutnya = rs2.getInt("kode") + 1; 
                if (rs2.getInt("kode")!= 0) {//jika kode kategori sudah pernah ada                         
                            if (rs2.getInt("panjang") == 1) { //jika jumlah digitnya adalah 1
                                urutan = "B" + id + "0" + nomor_berikutnya;
                            } else if (rs2.getInt("panjang") == 2) { //jika jumlah digitnya adalah 2
                                urutan = "B" + id + nomor_berikutnya;
                            }
                    }
                    else {//jika kode kategori belum pernah ada                      
                        urutan = "B" + id + "01";
                } 

            }else
                 JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");              
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return urutan;
    }

    public List<Barang> IsiCombo() {
        PreparedStatement statement = null;
        List<Barang> list = null;
        try {
            list = new ArrayList<Barang>();
            statement = connection.prepareStatement(COMBO);
            ResultSet rs = statement.executeQuery();              
            while (rs.next()) {
                Barang b = new Barang();  
                b.setKodekategori(rs.getInt("kdkategori"));
                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

     public List<Barang> getDataKategori(Integer id) {
        PreparedStatement statement = null;
        List<Barang> list = null;
        try {
            list = new ArrayList<Barang>();
            statement = connection.prepareStatement(CARIKATEGORI);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Barang b = new Barang();
                b.setNamakategori(rs.getString("nmkategori"));
                list.add(b);            
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }     
}
