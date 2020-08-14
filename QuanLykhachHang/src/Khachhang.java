

import java.util.ArrayList;

public class Khachhang {
    private String tenkhachhang;
    private String diachi;
    private String Sodienthoai;
    private String email;
    private String gioitinh;
    private int donhanhdamua;
    public int oder = 0;


    public Khachhang() {
    }

    public Khachhang(String tenkhachhang, String diachi, String Sodienthoai,
                     String email, String gioitinh, int donhanhdamua) {
        this.tenkhachhang = tenkhachhang;
        this.diachi = diachi;
        this.Sodienthoai = Sodienthoai;
        this.email = email;
        this.gioitinh = gioitinh;
        this.donhanhdamua = donhanhdamua;

    }


    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getDonhanhdamua() {
        return donhanhdamua;
    }

    public void setDonhanhdamua(int donhanhdamua) {
        this.donhanhdamua = donhanhdamua;
    }

    public int getOder() {
        return oder;
    }

    public void setOder(int oder) {
        this.oder = oder;
    }

    @Override
    public String toString() {
        return "Khach hang: " + tenkhachhang + " Dia chi: " + diachi + " SDT: " + Sodienthoai + " Email: " + email +
                " Gioi tinh: " + gioitinh;
    }


}
