/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author Nhan
 */
public class SinhVien {
    public String Hoten;
    public Date NgaySinh;
    public float DiemTB;

    public SinhVien(String Hoten, Date NgaySinh, float DiemTB) {
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.DiemTB = DiemTB;
    }

    public SinhVien() {
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    public String Showinfo() {
        return "SinhVien:{" + "Hoten=" + Hoten + ", NgaySinh=" + NgaySinh + ", DiemTB=" + DiemTB + '}';
    }

    
    
    
    
    
}

