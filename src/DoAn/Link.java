package DoAn;
import java.io.Serializable;

public class Link implements Serializable {
    private static final long serialVersionUID = 1L;
    String maSV;
    private String hoten;
    private double diemToan;
    private double diemVan;
    private double diemAnh;
    private String kq, xl;
    public Link nextLink;

    // Thêm getter và setter cho diemVan và diemAnh
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

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    // Thay đổi tên biến diem thành diemToan
    public double getDiemToan() {
        return diemToan;
    }

    // Thay đổi tên biến diem thành diemToan
    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public String getKq() {
        return kq;
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

    public Link getNextLink() {
        return nextLink;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }

    // Sửa constructor để khởi tạo diemVan và diemAnh
    public Link(String maSV, String hoten, double diemToan, double diemVan, double diemAnh) {
        super();
        this.maSV = maSV;
        this.hoten = hoten;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public Link() {
        super();
    }
}