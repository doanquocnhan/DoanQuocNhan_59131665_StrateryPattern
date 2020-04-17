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
public class ThanhToanOline implements IThanhToan{

    @Override
    public double thanhtoan(int tienhang) 
    {   // it hơn 1tr giảm 5% nhiều hơn giảm 7% 
        if (tienhang < 1000000)
            return tienhang * 0.95;
        return tienhang * 0.93;
    
    }
}
