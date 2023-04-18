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
public class ChucvuDTO {
    private String MaCv;
    private String TenCv;
    private Date Ngaybonhiem;
    private String Ghichu;

    public ChucvuDTO()
    {
        
    }
    public ChucvuDTO(String MaCv, String TenCv, Date Ngaybonhiem, String Ghichu) {
        this.MaCv = MaCv;
        this.TenCv = TenCv;
        this.Ngaybonhiem = Ngaybonhiem;
        this.Ghichu = Ghichu;
    }

    public String getMaCv() {
        return MaCv;
    }

    public void setMaCv(String MaCv) {
        this.MaCv = MaCv;
    }

    public String getTenCv() {
        return TenCv;
    }

    public void setTenCv(String TenCv) {
        this.TenCv = TenCv;
    }

    public Date getNgaybonhiem() {
        return Ngaybonhiem;
    }

    public void setNgaybonhiem(Date Ngaybonhiem) {
        this.Ngaybonhiem = Ngaybonhiem;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    
}
