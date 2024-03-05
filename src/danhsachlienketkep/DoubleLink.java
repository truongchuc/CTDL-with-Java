package danhsachlienketkep;

public class DoubleLink {
    private String maSV;
    private String hoten;
    private double diem;
    private String kq, xl;
    public DoubleLink next, prev;

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

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
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

    public DoubleLink() {
        this.next = null;
        this.prev = null;
    }

    public DoubleLink(String maSV, String hoten, double diem) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.diem = diem;
        this.next = null;
        this.prev = null;
    }
}
