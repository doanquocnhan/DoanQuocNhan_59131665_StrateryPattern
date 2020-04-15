/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Nhan
 */
public class GioHang {
    public IThanhToan hinhThucTT;
    ArrayList <HangHoa> dsHH = new ArrayList();
    
    public void themHH (HangHoa HH)
    {
        dsHH.add(HH);
    }
    
    
}
