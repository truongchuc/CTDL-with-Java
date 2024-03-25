package DoAn;

import java.io.Serializable;

public class Node implements Serializable {
    public String maSV;
    public String ht;
    public double diemToan;
    public double diemVan;
    public double diemAnh;
    public String kq;
    public String xl;
    public String getKq() {
        return kq;
    }

    public Node() {
        super();
    }

    public void setKq(String kq) {
        this.kq = kq;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    public Node left;
    public Node right;
    

    public Node(String masv, String hoten, double diemToan, double diemVan, double diemAnh) {
        this.maSV = masv;
        this.ht = hoten;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.left = null;
        this.right = null;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }
}