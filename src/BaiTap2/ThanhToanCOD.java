/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Nhan
 */
public class ThanhToanCOD implements IThanhToan {

    @Override
    public double thanhtoan(int tienhang) {
        // mua hơn 2tr giảm 2% ít hơn không giảm
        if( tienhang >2000000) 
            return tienhang*0.98;
        return tienhang;
        
    }
    
    
}
