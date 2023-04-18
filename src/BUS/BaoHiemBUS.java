/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.*;
import DTO.BaohiemDTO;
import java.util.ArrayList;
import Exception.*;

/**
 *
 * @author MI
 */
public class BaoHiemBUS {
    BaohiemDAO baohiemdao = new BaohiemDAO();
    public  BaoHiemBUS()
    {
        
    }
    public ArrayList<BaohiemDTO> getBaohiem()
    {
        return baohiemdao.getBaohiem();
    }
    public boolean addBaohiem(BaohiemDTO baohiem) throws DuplicatedException 
    {
        ArrayList<BaohiemDTO> list = baohiemdao.getBaohiem();
        for (BaohiemDTO item : list )
        {
            if(item.getMaBH().equals(baohiem.getMaBH()))
            {
                throw new DuplicatedException(" Mã bảo hiểm bị trùng ");
            }
        }
        // không có mã bảo hiểm nào sẽ tự thêm vào mã bảo hiểm vào list
        return baohiemdao.addBaohiem(baohiem);
    }
    
}
