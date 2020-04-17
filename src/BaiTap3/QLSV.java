/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nhan
 */
public class QLSV {
    ISosanh<SinhVien> SoSanh;
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    
    public void ThemSV(SinhVien sv)
    {
        dsSV.add(sv);
    }

    public void setSoSanh(ISosanh<SinhVien> SoSanh) {
        this.SoSanh = SoSanh;
    }
    public void sapxep()
    {
        Collections.sort(dsSV, (o1, o2) -> SoSanh.Sosanh(o1, o2));
    }
     public void inDS(){
        for(int i = 0; i < dsSV.size(); i++){
            System.out.println("Sinh viên thứ: "+(i+1));
            System.out.println(dsSV.get(i).Showinfo());
        }
    }
    
}
