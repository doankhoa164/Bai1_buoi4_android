package com.example.bai1_buoi4;

public class thongtin {
    public String name ;
    public String fan ;
    public String soBaiViet ;
    public String kieuNhom ;
    public int hinh ;

    public thongtin(String Name, String Fan, String SoBaiViet, String KieuNhom, int Hinh) {
        name = Name;
        fan = Fan;
        soBaiViet = SoBaiViet;
        kieuNhom = KieuNhom;
        hinh = Hinh;
    }

    public String getname() {
        return name;
    }

    public void setname(String Name) {
        name = Name;
    }

    public String getfan() {
        return fan;
    }

    public void setfan(String Fan) {
        fan = Fan;
    }

    public String getsoBaiViet() {
        return soBaiViet;
    }

    public void setsoBaiViet(String SoBaiViet) {
        soBaiViet = SoBaiViet;
    }

    public String getkieuNhom() {
        return kieuNhom;
    }

    public void setkieuNhom(String Nhom) {
        kieuNhom = Nhom;
    }

    public int gethinh() {
        return hinh;
    }

    public void sethinh(int Hinh) {
        hinh = Hinh;
    }
}
