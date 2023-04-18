/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author MI
 */
public class BangluongDTO {
    private String MaNv;
    private String MaLuong;
    private String TenNv;
    private double LuongCoBan;
    private double HeSoluong;
    private double ThuongPhat;
    private double TienLuong;
    private double TienPhuCap;
    
    public  BangluongDTO()
    {
        
    }
    public BangluongDTO(String MaNv,String MaLuong,String TenNv,double LuongCoBan,double HeSoluong,
                        double ThuongPhat,double TienLuong,double TienPhuCap)
    {
        this.MaNv= MaNv;
        this.MaLuong= MaLuong;
        this.TenNv=TenNv;
        this.LuongCoBan=LuongCoBan;
        this.HeSoluong=HeSoluong;
        this.ThuongPhat= ThuongPhat;
        this.TienLuong=TienLuong;
        this.TienPhuCap=TienPhuCap;
    }
    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public double getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(double LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public double getHeSoluong() {
        return HeSoluong;
    }

    public void setHeSoluong(double HeSoluong) {
        this.HeSoluong = HeSoluong;
    }

    public double getThuongPhat() {
        return ThuongPhat;
    }

    public void setThuongPhat(double ThuongPhat) {
        this.ThuongPhat = ThuongPhat;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public double getTienPhuCap() {
        return TienPhuCap;
    }

    public void setTienPhuCap(double TienPhuCap) {
        this.TienPhuCap = TienPhuCap;
    }
    
    
    
}
