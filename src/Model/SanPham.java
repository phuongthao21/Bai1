/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class SanPham {
    private String MaSp;
    private String TenSP;
    private String NhaSX;
    private String MaLoaiSp;

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
    }

    public String getMaLoaiSp() {
        return MaLoaiSp;
    }

    public void setMaLoaiSp(String MaLoaiSp) {
        this.MaLoaiSp = MaLoaiSp;
    }

    public SanPham(String MaSp, String TenSP, String NhaSX, String MaLoaiSp) {
        this.MaSp = MaSp;
        this.TenSP = TenSP;
        this.NhaSX = NhaSX;
        this.MaLoaiSp = MaLoaiSp;
    }

    public SanPham() {
    }
    
    
}
