package Controller;

import DAO.DAO_Kategori;
import DAO.Model_DAO;
import Model.Kategori;
import View.MKategoriBarang;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Controller_Kategori {
    MKategoriBarang form;
    Model_DAO<Kategori> model;
    List<Kategori> list; //deklarasi method "List" yang sudah dibuat pada interface MODEL_DAO
    String[] header; //deklarasi variable untuk membuat judul kolom pada objek JTable
           
     //konstruktor
    public Controller_Kategori(MKategoriBarang form){
        this.form = form;
        model = new DAO_Kategori();
        list = model.getAll();
        header = new String[]{"KODE KATEGORI", "NAMA KATEGORI"};
        
        form.getTblkategori().setShowGrid(true);
        form.getTblkategori().setShowVerticalLines(true);
        form.getTblkategori().setGridColor(Color.blue);        
    }
    
    //method untuk menampilkan kode kategori berikutnya
    public void tampilurutankode(){            
            Kategori k = new Kategori();      
            model.autonumber(k); 
            form.getTxtkdkategori().setText(String.valueOf(model.autonumber(k)));          
   }
   
    //method untuk membersihkan objek inputan yang ada pada Form   
    public void reset(){
        form.getTxtkdkategori().setText("");
        form.getTxtnmkategori().setText("");   
        form.getTxtnmkategori().requestFocus();        
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
        for (Kategori K : list) {
            data[0] = K.getKode();
            data[1] = K.getNama();
            tblModel.addRow(data);
        }
        form.getTblkategori().setModel(tblModel);       
    }
     
   //method untuk meletakkan data ke dalam text berdasatkan data yang dipilih dari JTabel  
    public void isiField(int row){
        form.getTxtkdkategori().setText(String.valueOf(list.get(row).getKode()));
        form.getTxtnmkategori().setText(list.get(row).getNama());       
    }
    
    //method untuk simpan data
    public void insert(){
      Kategori k = new Kategori();
      k.setKode(Integer.parseInt(form.getTxtkdkategori().getText()));
      k.setNama(form.getTxtnmkategori().getText());
      model.insert(k);
    }

    //method untuk mengubah data
    public void update(){
      Kategori k = new Kategori();
      k.setKode(Integer.parseInt(form.getTxtkdkategori().getText()));
      k.setNama(form.getTxtnmkategori().getText());
      model.update(k);
    }
    
    //method untuk menghapus data
    public void delete(){
      if(!form.getTxtkdkategori().getText().trim().isEmpty()){
          int id =Integer.parseInt(form.getTxtkdkategori().getText());
          model.delete(id);
      }else{
          JOptionPane.showMessageDialog(form, "Pilih data yang akan dihapus");
      }
    }
    
    //method ini akan dipakai untuk memfilter data berdasarkan inputan yg ada pada text kode kategori
    public void isiTableCari(){
      list = model.getCari(form.getTxtkdkategori().getText().trim());
       DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header);
       Object[] data = new Object[header.length];
       for (Kategori k : list) {
           data[0] = k.getKode();
           data[1] = k.getNama();
           tblModel.addRow(data);  //menampilkan ke JTable 
           
           form.getTxtnmkategori().setText(k.getNama());   //menampilkan ke text
       }
       form.getTblkategori().setModel(tblModel);  
       
    }
}
