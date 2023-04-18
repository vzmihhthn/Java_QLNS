/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBConnection;
import DTO.BaohiemDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author MI
 */
public class BaohiemDAO
{
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs= null;
    
    public static final int INDEX_LOAIBH = 0;
    
    public BaohiemDAO()
    {
    }
    public static void main(String[] args) {
        BaohiemDAO baohiemDAO = new BaohiemDAO();
        ArrayList<BaohiemDTO> baohiemList = baohiemDAO.getBaohiem();
        for (BaohiemDTO pb : baohiemList)
        {
            System.out.println(pb.getMaBH()+ " "+  pb.getMaNv()+ " "+ pb.getLoaiBH()+ " "+ 
                                pb.getNgaycap()+ " "+ pb.getNgayhethan());
        }
        
    }
    public  ArrayList<BaohiemDTO> getBaohiem()
    {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("Select * from BaoHiem");
            ArrayList<BaohiemDTO> baohiemDAO = new ArrayList();
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                baohiemDAO.add(new BaohiemDTO( rs.getString("MaBH" ),
                        rs.getString("MaNv" ),
                        rs.getString("LoaiBH" ),
                        rs.getDate("NgayCap" ),
                        rs.getDate("NgayHetHan" )));        
            }
            return baohiemDAO;
        } catch (SQLException e )
        {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    public  boolean addBaohiem( BaohiemDTO baohiem)
    {
        try {
            java.util.Date ngayCap = baohiem.getNgaycap();
            java.sql.Date sqlNgayCap = new java.sql.Date(ngayCap.getTime());
            
            
            java.util.Date ngayhethan = baohiem.getNgayhethan();
            java.sql.Date sqlNgayhethan = new java.sql.Date(ngayhethan.getTime());

            
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(" Insert into Baohiem (MaBH, MaNv, LoaiBH, NgayCap, NgayHetHan )VALUES ( ? ,?,?,?,?)");
            stmt.setString(1, baohiem.getMaBH());
            stmt.setString(2, baohiem.getMaNv());
            stmt.setString(3, baohiem.getLoaiBH());
            stmt.setDate(4, sqlNgayCap);
            stmt.setDate(5, sqlNgayhethan );
            
            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
//    public boolean updateBaohiem(BaohiemDTO baohiem)
//    {
//        try {
//            Object[] selection = baohiem.getSelection();
//            String table ="";
//            for(int i=0 ; i< selection.length ; i++)
//            {
//                if((boolean) selection[i])
//                    switch (i)
//                    {
//                        case INDEX_LOAIBH ->
//                            table += "LoaiBH = ?,  ";
//                    }
//            }
//        } catch (Exception e) {
//        } finally {
//        }
//    }
}
