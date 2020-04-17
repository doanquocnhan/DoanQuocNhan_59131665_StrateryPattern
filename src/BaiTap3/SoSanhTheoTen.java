/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Nhan
 */
public class SoSanhTheoTen implements ISosanh<SinhVien>{

    @Override
    public int Sosanh(SinhVien o1, SinhVien o2) {
        if((o1.getHoten()).compareTo(o2.getHoten())> 0)
            return 1;
        else if((o1.getHoten()).compareTo(o2.getHoten())==0)
            return 0;
        else
            return -1;
        
        
    }
    
    
}
