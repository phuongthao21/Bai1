/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import ConnectDB.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;
import ConnectDB.Database;
/**
 *
 * @author ASUS
 */
public class SanPhamController {
    public static int ThemSPDB(String MaSP, String TenSP, String NhaSX, String MaLoaiSP) throws SQLException
    {
        String sql ="INSERT INTO SanPham VALUES(?,?,?,?)";
        PreparedStatement ps = Database.getPrepareStatement(sql);
        //try{
            ps.setString(1,MaSP);
            ps.setString(2,TenSP);
            ps.setString(3,NhaSX);
            ps.setString(4,MaLoaiSP);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        //}catch (Exception e) {
           //JOptionPane.showMessageDialog(null, "Lỗi. Thêm thất bại");
           //System.out.println(e);
              
        //}
        return 0;
    }
}
