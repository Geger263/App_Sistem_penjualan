/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAO_Petugas;
import DAO.Model_DAO;
import Model.Petugas;
import View.MPetugas;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Controller_Petugas {
    MPetugas form;
    Model_DAO<Petugas> model;
    List<Petugas> list;
    String[] header;
    
    public Controller_Petugas(MPetugas form) {
        this.form = form;
        model = new DAO_Petugas();
        list = model.getAll();
        header = new String[]{"KODE", "NAMA PETUGAS", "ALAMAT", "TELEPON"};
        
        form.getTblpetugas().setShowGrid(true);
        form.getTblpetugas().setShowVerticalLines(true);
        form.getTblpetugas().setGridColor(Color.blue);
    }
    
    public void tampilurutankode(){
        Petugas p = new Petugas();
        model.autonumber(p);
        form.getTxtkdpetugas().setText(String.valueOf(model.autonumber(p)));
    }
    
    public void reset(){
        form.getTxtkdpetugas().setText("");
        form.getTxtnmpetugas().setText("");
        form.getTxtalamat().setText("");
        form.getTxttelp().setText("");
        form.getTxtnmpetugas().requestFocus();
        tampilurutankode();
        isiTable();
    }

    public void isiTable(){
        list = model.getAll();
        
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        
        Object[] data = new Object[header.length];
        for (Petugas p : list) {
            data[0] = p.getKode(); 
            data[1] = p.getNama();
            data[2] = p.getAlamat();
            data[3] = p .getTelp();
            tblModel.addRow(data);
        }
        form.getTblpetugas().setModel(tblModel);
    }
    
    public void isiField(int row) {
        form.getTxtkdpetugas().setText(String.valueOf(list.get(row).getKode()));
        form.getTxtnmpetugas().setText(list.get(row).getNama());
        form.getTxtalamat().setText(list.get(row).getAlamat());
        form.getTxttelp().setText(list.get(row).getTelp());
    }

    public void insert() {
        Petugas p = new Petugas();
        p.setKode(Integer.parseInt(form.getTxtkdpetugas().getText()));
        p.setNama(form.getTxtnmpetugas().getText());
        p.setAlamat(form.getTxtalamat().getText());
        p.setTelp(form.getTxttelp().getText());
        model.insert(p);
    }
    public void update(){
        Petugas p = new Petugas ();
        p.setKode(Integer.parseInt(form.getTxtkdpetugas().getText()));
        p.setNama(form.getTxtnmpetugas().getText());
        p.setAlamat(form.getTxtalamat().getText());
        p.setTelp(form.getTxttelp().getText());
        model.update(p);
    }

    public void delete() {
         if(!form.getTxtkdpetugas().getText().trim().isEmpty()){
             int kode = Integer.parseInt(form.getTxtkdpetugas().getText());
             model.delete(kode);
         }else{
             JOptionPane.showMessageDialog(form, "Pilih data yang akan dihapus");
         }
    }

    public void isiTableCari(){
        list = model.getCari(form.getTxtkdpetugas().getText().trim());
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header);
        Object[] data = new Object[header.length];
        for (Petugas p : list) {
            data[0] = p.getKode();
            data[1] = p.getNama();
            data[2] = p.getAlamat();
            data[3] = p.getTelp();
            tblModel.addRow(data);
        }
        form.getTblpetugas().setModel(tblModel);
    }
}
