package danhsachlienket;

public class link {
		private String maSV;
		private String hoten;
		private double diem;
		private String kq,xl;
		public link nextLink;
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
		public link(String maSV, String hoten, double diem) {
			super();
			this.maSV = maSV;
			this.hoten = hoten;
			this.diem = diem;
			this.nextLink=null;
		}
	}


