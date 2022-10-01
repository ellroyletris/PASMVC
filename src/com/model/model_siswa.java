/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;
import com.controller.controller_siswa;
import com.koneksi.koneksi;
import com.view.abjr;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab 1
 */
public class model_siswa implements controller_siswa{
    String jk;

    @Override
    public void Simpan(abjr abumat) throws SQLException {
//             if (abumat.rbLaki.isSelected()) {
//            jk = "Laki-Laki";
//        }else {
//            jk = "Perempuan";
//        }
//        try {
//            Connection con = koneksi.getCon();
//            String sql = "Insert Into abumat Values(?,?,?,?)";
//            PreparedStatement prepare = con.prepareStatement(sql);
//            prepare.setString(1, abumat.txtNIS.getText());
//            prepare.setString(2, abumat.txtNama.getText());
//            prepare.setString(3, jk);
//            prepare.setString(4, (String)abumat.cbJurusan.getSelectedItem());
//            prepare.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
//            prepare.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }finally {
//            Tampil(abumat);
//            abumat.setLebarKolom();
//    }
    }

    @Override
    public void Ubah(abjr abumat) throws SQLException {
//       if (abumat.rbLaki.isSelected()) {
//           jk = "laki-laki";
//       } else {
//           jk = "Perempuan";
//       }
//       try {
//           Connection con = koneksi.getCon();
//           String sql = "UPDATE abumat SET nama=?, jenis _kelamin=?," + "jurusan=? WHERE nis=?";
//           PreparedStatement prepare = con.prepareStatement(sql);
//           prepare.setString (1, abumat.txtNIS.getText());
//           prepare.setString (2, abumat.txtNama.getText());
//           prepare.setString (3, jk);
//           prepare.setString (4, (String) abumat.cbJurusan.getSelectedItem());
//           prepare.executeUpdate();
//           JOptionPane.showMessageDialog(null, "Data berhasil diubah");
//           prepare.close();
//       } catch (Exception e) {
//           System.out.println(e);
//       } finally {
//           Tampil(abumat);
//           abumat.setLebarKolom();
//           Baru(abumat);
//       }
    }

    @Override
    public void Hapus(abjr abumat) throws SQLException {
//        try {
//            Connection con = koneksi.getCon();
//            String sql = "DELETE FROM abumat WHERE nis = ?";
//            PreparedStatement prepare = con.prepareStatement(sql);
//            prepare.setString(1, abumat.txtNIS.getText());
//            prepare.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
//            prepare.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }finally{
//            Tampil(abumat);
//            abumat.setLebarKolom();
//            Baru(abumat);
//        }
    }

    @Override
    public void Tampil(abjr abumat) throws SQLException {
//       abumat.tblModel.getDataVector().removeAllElements();
//       abumat.tblModel.fireTableDataChanged();
//        try {
//            Connection con = koneksi.getCon();
//            Statement stt = con.createStatement();
//            String sql = "SELECT * FROM abumat ORDER BY nis ASC";
//            ResultSet res = stt.executeQuery(sql);
//            while (res.next()){
//                Object[] ob = new Object[8];
//                ob[0] = res.getString(1);
//                ob[1] = res.getString(2);
//                ob[2] = res.getString(3);
//                ob[3] = res.getString(4);
//                abumat.tblModel.addRow(ob);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    @Override
    public void Baru(abjr abumat) throws SQLException {
//        abumat.txtNIS.setText("");
//        abumat.txtNama.setText("");
//        abumat.rbLaki.setSelected(true);
//        abumat.cbJurusan.setSelectedIndex(0);
    }

    @Override
    public void KlikTabel(abjr abumat) throws SQLException {
        try {
            int pilih = abumat.tabel.getSelectedRow();
            if (pilih == -1) {
                return;
                
            }
            abumat.txtNIS.setText(abumat.tblModel.getValueAt(pilih, 0).toString());
            abumat.txtNama.setText(abumat.tblModel.getValueAt(pilih, 1).toString());
            abumat.cbJurusan.setSelectedItem(abumat.tblModel.getValueAt(pilih, 3).toString());
            jk = String.valueOf(abumat.tblModel.getValueAt(pilih, 2));
        } catch (Exception e) {
            
        }
        if (abumat.rbLaki.getText().equals(jk)) {
            abumat.rbLaki.setSelected(true);
            
        }else {
            abumat.rbPerempuan.setSelected(true);
        }
    }

  

}
