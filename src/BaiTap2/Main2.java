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
public class Main2 {
    public static void main(String[] args) {
        // khởi tạo 2 giỏ hàng
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        //Nhập hàng hóa
        HangHoa h1 = new HangHoa("Garen",430000,"Figure 01");
        HangHoa h2 = new HangHoa("Jinx",570000,"make in Japan");
        HangHoa h3 = new HangHoa("Yasuo",450000,"Đấng Gánh Team");
        HangHoa h4 = new HangHoa("Tam Kê",500000,"Mật vụ Susuan0175");
        HangHoa h5 = new HangHoa("Fake",9000000,"Quỷ Vưởng Legend");
        // Thêm Hàng hóa vào giỏ
        gh1.themHH(h3);
        gh1.themHH(h4);
        gh2.themHH(h1);
        gh2.themHH(h2);
        gh2.themHH(h5);
        // Loại thanh toán
        gh1.HTThanhtoan(new ThanhToanCOD());
        gh2.HTThanhtoan(new ThanhToanOline());
        // Thông tin
        System.out.println("\nGiỏ hàng 1 thanh toán COD:");
        gh1.hienThiGH();
        System.out.println("\nTổng tiền hàng: " + gh1.tongTienHang());
        System.out.println("Số tiền khách phải trả: " + gh1.tongTienGiam());
        
        System.out.println("\nGiỏ hàng 2 thanh toán Online:");
        gh2.hienThiGH();
        System.out.println("\nTổng tiền hàng: " + gh2.tongTienHang());
        System.out.println("Số tiền khách phải trả: " + gh2.tongTienGiam());
    }
    
}
