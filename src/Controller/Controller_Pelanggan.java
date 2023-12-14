package Controller;

import DAO.DAO_Pelanggan;
import DAO.Model_DAO;
import Model.Pelanggan;
import View.MPelanggan;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controller_Pelanggan {

    MPelanggan form;
    Model_DAO<Pelanggan> model;
    List<Pelanggan> list; //deklarasi method "List" yang sudah dibuat pada interface MODEL_DAO
    String[] header; //deklarasi variable untuk membuat judul kolom pada objek JTable
    
    //konstruktor
    public Controller_Pelanggan(MPelanggan form){
        this.form = form;
        model = new DAO_Pelanggan();
        list = model.getAll();
        header = new String[]{"KODE", "NAMA PELANGGAN", "ALAMAT", "TELEPON"};
        
        form.getTblplg().setShowGrid(true);
        form.getTblplg().setShowVerticalLines(true);
        form.getTblplg().setGridColor(Color.blue);        
    }
    
   //method untuk menampilkan kode pelanggan berikutnya
    public void tampilurutankode(){            
            Pelanggan p = new Pelanggan();      
            model.autonumber(p); 
            form.getTxtkdplg().setText(String.valueOf(model.autonumber(p)));          
   }
   
    //method untuk membersihkan objek inputan yang ada pada Form   
    public void reset(){
        form.getTxtkdplg().setText("");
        form.getTxtnmplg().setText("");
        form.getTxtalamat().setText("");
        form.getTxttelp().setText("");     
        form.getTxtnmplg().requestFocus();
        tampilurutankode();    
        isiTable();
        
    }
     
    //method untuk menampilkan semua data kedalam JTabel
    public void isiTable(){
        list = model.getAll();
        
         //Script agar jtable tidak bisa di edit
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header) {
            public boolean isCellEditable(int rowIndex, int columnIndex) { 
                return false;
             }
        };
        
        Object[] data = new Object[header.length];
        for (Pelanggan p : list) {
            data[0] = p.getKode();
            data[1] = p.getNama();
            data[2] = p.getAlamat();
            data[3] = p.getTelp();
            tblModel.addRow(data);
        }
        form.getTblplg().setModel(tblModel);       
    }
  
  //method untuk meletakkan data ke dalam text berdasatkan data yang dipilih dari JTabel 
  public void isiField(int row){
        form.getTxtkdplg().setText(String.valueOf(list.get(row).getKode()));
        form.getTxtnmplg().setText(list.get(row).getNama());
        form.getTxtalamat().setText(list.get(row).getAlamat());
        form.getTxttelp().setText(list.get(row).getTelp());
    }
   
  
  //method untuk simpan data
  public void insert(){
        Pelanggan p = new Pelanggan();
        p.setKode(Integer.parseInt(form.getTxtkdplg().getText()));
        p.setNama(form.getTxtnmplg().getText());
        p.setAlamat(form.getTxtalamat().getText());
        p.setTelp(form.getTxttelp().getText());
        
        model.insert(p);
    }
  
  //method untuk mengubah data
   public void update(){
        Pelanggan p = new Pelanggan();
        p.setKode(Integer.parseInt(form.getTxtkdplg().getText()));
        p.setNama(form.getTxtnmplg().getText());
        p.setAlamat(form.getTxtalamat().getText());
        p.setTelp(form.getTxttelp().getText());
        
        model.update(p);
    }
   
   //method untuk menghapus data
    public void delete(){
        if(!form.getTxtkdplg().getText().trim().isEmpty()){
            int kode =Integer.parseInt(form.getTxtkdplg().getText());
            model.delete(kode);
        }else{
            JOptionPane.showMessageDialog(form, "Pilih data yang akan dihapus");
        }
    }
        
    //method ini akan dipakai untuk memfilter data berdasarkan inputan yg ada pada text kode pelanggan
    public void isiTableCari(){
        list = model.getCari(form.getTxtkdplg().getText().trim());
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header);
        Object[] data = new Object[header.length];
        for (Pelanggan p : list) {
            data[0] = p.getKode();
            data[1] = p.getNama();
            data[2] = p.getAlamat();
            data[3] = p.getTelp();
            tblModel.addRow(data);//menampilkan ke JTable 
            
            form.getTxtnmplg().setText(p.getNama());   //menampilkan ke text
            form.getTxtalamat().setText(p.getAlamat());   //menampilkan ke text
            form.getTxttelp().setText(p.getTelp());   //menampilkan ke text         
        }
        form.getTblplg().setModel(tblModel);
    }

}