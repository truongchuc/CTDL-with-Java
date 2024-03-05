package tree;

public class Node {
    public String maSV;
    public String ht;
    public double diem;
    public String kq;
    public String xl;
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

	public Node left;
    public Node right;
    

    public Node(String masv, String hoten, double diem) {
        this.maSV = masv;
        this.ht = hoten;
        this.diem = diem;
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

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
}

