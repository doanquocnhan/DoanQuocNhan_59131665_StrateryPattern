/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nhan
 */
public class Main3 {
    public static void main(String[] args) throws ParseException {
        QLSV dsSV = new QLSV();
        // định dang cho ngày
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        // Nhập các sinh viên
        SinhVien sv = new SinhVien("Đoàn Quốc Nhân ", formatter.parse("08/06/1999"),  10);
        SinhVien sv1 = new SinhVien("Đoàn Quốc Viên", formatter.parse("25/10/2001"),  8);
        SinhVien sv2 = new SinhVien("Đoàn Quốc Anh", formatter.parse("10/03/1999"),  6);
        // Thếm SV vào danh Sách
        dsSV.ThemSV(sv);
        dsSV.ThemSV(sv1);
        dsSV.ThemSV(sv2);
        // In danh sách
        System.out.println("\nSắp xếp danh sách mặc định");
        dsSV.inDS();
        //Sắp xếp danh sách theo tên
        System.out.println("\nSắp xếp danh sách theo tên");
        dsSV.setSoSanh(new SoSanhTheoTen());
        dsSV.sapxep();
        dsSV.inDS();
        //Sắp xếp danh sách theo điểm
        System.out.println("\nSắp xếp danh sách theo điểm");
        dsSV.setSoSanh(new SoSanhTheoDiem());
        dsSV.sapxep();
        dsSV.inDS();
    }
 
}
