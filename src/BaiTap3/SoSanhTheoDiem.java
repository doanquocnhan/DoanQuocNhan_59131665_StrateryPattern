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
public class SoSanhTheoDiem  implements ISosanh<SinhVien>{

    @Override
    public int Sosanh(SinhVien o1, SinhVien o2) {
        if(o1.getDiemTB() > o2.getDiemTB())
            return 1;
        else if(o1.getDiemTB() == o2.getDiemTB())
            return -1;
        else
            return -1;
    }
    
}

