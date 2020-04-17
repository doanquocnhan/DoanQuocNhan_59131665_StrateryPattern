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
    // Thêm hàng hóa vào danh sách
    public void themHH (HangHoa HH)
    {
        dsHH.add(HH);
    }
    // chọn Hinh thức thanh toán
    public void HTThanhtoan( IThanhToan HHThanhToan)
    {
           this.hinhThucTT = HHThanhToan;
    }
    //thanhtoan
    public double thanhtoan(int tienhang)
    {
        return hinhThucTT.thanhtoan(tienhang);
    }
    //tính tiền
    public int tongTienHang()
    {
        int tong = 0;
        for (int i=0; i<dsHH.size(); i++){
            tong += dsHH.get(i).getGia();
        }
        return tong;
    }
    // tổng tiền trả
      public double tongTienGiam()
    {
        return hinhThucTT.thanhtoan(tongTienHang());
    }
    // hiển thị
      public void hienThiGH()
    {
        for (int i=0; i<dsHH.size(); i++){
            dsHH.get(i).hienThiHH();
        }
    }
}
