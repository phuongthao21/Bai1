/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTable;
import Model.SanPham;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class CustomTable extends AbstractTableModel{

    private String name[]={"Mã sản phẩm","Tên sản phẩm","Nhà sản xuất","Mã loại sản phẩm"};
    private Class classes[]={String.class,String.class,String.class,String.class};
    ArrayList<SanPham> listSP=new ArrayList<SanPham>();
    public CustomTable(ArrayList<SanPham> listSP)
   {
       this.listSP=listSP;
   }
 
    @Override
    public int getRowCount()
    {
        return listSP.size();
    }
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return listSP.get(rowIndex).getMaSp();
            case 1: return listSP.get(rowIndex).getTenSP();
            case 2: return listSP.get(rowIndex).getNhaSX();
            case 3: return listSP.get(rowIndex).getMaLoaiSp();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
