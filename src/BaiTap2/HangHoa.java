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
public class HangHoa {
    public String tenHH;
    public int gia;
    public String mota;

    public HangHoa() {
    }

    public HangHoa(String tenHH, int gia, String mota) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.mota = mota;
    }
    // khai báo getter và setter
    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    // hiển thị thông tin
      public void hienThiHH()
    {
        System.out.print("\nTên hàng hóa: "+ tenHH + " Giá tiền: " + gia + " Mô tả: " + mota);
    }
    
}
