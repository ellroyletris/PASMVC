/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import com.view.abjr;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public interface controller_siswa {
    public void Simpan(abjr abumat) throws SQLException;
    public void Ubah(abjr abumat) throws SQLException;
    public void Hapus(abjr abumat) throws SQLException;
    public void Tampil(abjr abumat) throws SQLException;
    public void Baru(abjr abumat) throws SQLException;
    public void KlikTabel(abjr abumat) throws SQLException;
}
