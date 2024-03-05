package DoAn;
import java.io.Serializable;

public class Link implements Serializable {
		String maSV;
		private String hoten;
		private double diem;
		private String kq,xl;
		public Link nextLink;
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
		public Link getNextLink() {
			return nextLink;
		}
		public void setNextLink(Link nextLink) {
			this.nextLink = nextLink;
		}
		public Link(String maSV, String hoten, double diem) {
			super();
			this.maSV = maSV;
			this.hoten = hoten;
			this.diem = diem;
		}
		public Link() {
			super();
		}
		
		
		
	}


