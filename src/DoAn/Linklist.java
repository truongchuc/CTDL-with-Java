package DoAn;

import java.util.Scanner;

public class Linklist {
	LinkDao obj = new LinkDao();
	private Link first;

	public Linklist() {
		first = null;
	}

	/*
	 * public void ghifile() { insert("01", "Truong Cong Chuc\t", 9); insert("02",
	 * "Nguyen Viet Duy Nam\t", 8); insert("03", "Phan Van Minh Hieu\t", 5);
	 * obj.ghiFile(first); }
	 */

	public void docfile() {
		first = obj.docFile("D:\\BT PhuXuan\\CTDL và GT\\thi.bin");
	}

	public void creatlist() {
	    Scanner scanner = new Scanner(System.in);
	    while (true) {
	        String maSV = "";
	        System.out.print("Nhap ma sinh vien:");
	        maSV = scanner.nextLine();
	        if (maSV.length() == 0) {
	            break;
	        } else {
	            if (!isMaSVExist(maSV)) {
	                System.out.println("Nhap ho ten:");
	                String hoten = scanner.nextLine();
	                System.out.println("Nhap diem:");
	                double diem = scanner.nextDouble();
	                scanner.nextLine();
	                insert(maSV, hoten, diem);
	            } else {
	                System.out.println("Mã sinh viên đã tồn tại trong danh sách.");
	            }
	        }
	    }
	    
	}


	public void insert(String maSV, String hoten, double diem) {
	    if (!isMaSVExist(maSV)) {
	        Link nut = new Link(maSV, hoten, diem);
	        nut.nextLink = first;
	        first = nut;
	    } else {
	        System.out.println("Mã sinh viên đã tồn tại trong danh sách.");
	    }
	}

	private boolean isMaSVExist(String maSV) {
	    Link current = first;
	    while (current != null) {
	        if (current.maSV.equals(maSV)) {
	            return true;
	        }
	        current = current.nextLink;
	    }
	    return false;
	}


	public void printlist() {
	    Link p = first;
	    System.out.println("+------+---------------------+------+--------+-----------+");
	    System.out.println("| Mã SV|       Họ và tên     | Điểm | Kết quả| Xếp loại  |");
	    System.out.println("+------+---------------------+------+--------+-----------+");
	    while (p != null) {
	        System.out.printf("| %-5s| %-20s| %5.2f| %-7s| %-9s|\n", p.getMaSV(), p.getHoten(), p.getDiem(), p.getKq(), p.getXl());
	        p = p.nextLink;
	    }
	    System.out.println("+------+---------------------+------+--------+-----------+");
	}

	public void printif() {
		Link p = first;
		while (p != null) {
			if (p.getDiem() >= 5)
				System.out.println(p.getHoten() + " " + p.getDiem());
			p = p.nextLink;
		}
	}

	public void kq() {
		Link p = first;
		while (p != null) {
			if (p.getDiem() >= 5)
				p.setKq("dau");
			else
				p.setKq("rot");
			p = p.nextLink;
		}
	}

	public void xl() {
		Link p = first;
		while (p != null) {
			double diemTB = (p.getDiem());
			if (diemTB < 5)
				p.setXl("Kem");
			else if (diemTB < 7)
				p.setXl("Trung binh");
			else if (diemTB < 8)
				p.setXl("Kha");
			else
				p.setXl("Gioi");
			p = p.nextLink;
		}
	}

	public void chen(String maSV, String hoten, double diem) {
		Scanner scanner = new Scanner(System.in);
		boolean nhapLai;

		do {
			nhapLai = false;
			if (search(maSV) != null) {
				System.out.println("Sinh viên có mã " + maSV + " đã tồn tại trong danh sách. Không thể thêm mới.");
				return;
			}

			insert(maSV, hoten, diem);
			sort();
			displaySortedResults();

			System.out.print("Bạn muốn nhập lại (Y/N)? ");
			String luaChon = scanner.nextLine();

			nhapLai = luaChon.equalsIgnoreCase("Y");
		} while (nhapLai);
	}

	public double max() {
		Link p = first;
		double ln = first.getDiem();
		while (p != null) {
			if (ln < p.getDiem())
				ln = p.getDiem();
			p = p.nextLink;
		}
		return ln;
	}

	public Link search(String maSV) {
		Link p = first;
		while ((p != null) && (!p.getMaSV().equals(maSV))) {
			p = p.nextLink;
		}
		return p;
	}

	public void delete(String maSV) {
		Link p = search(maSV);
		if (p != null) {
			if (p == first) {
				first = first.nextLink;
			} else {
				Link q = first;
				while ((q.nextLink != p) && (q != null))
					q = q.nextLink;
				q.nextLink = p.nextLink;
			}
		}
	}

	public void sort() {
		Link p, q;
		String ht, maSV;
		double diem;
		p = first;
		while (p != null) {
			q = p.nextLink;
			while (q != null) {
				if (p.getHoten().compareTo(q.getHoten()) > 0) {
					ht = q.getHoten();
					diem = q.getDiem();
					maSV = q.getMaSV();
					q.setMaSV(p.getMaSV());
					q.setHoten(p.getHoten());
					q.setDiem(p.getDiem());
					p.setMaSV(maSV);
					p.setHoten(ht);
					p.setDiem(diem);
				}
				q = q.nextLink;
			}
			p = p.nextLink;
		}
	}

	public void search1(String hoTen) {
		Link p = first;
		while (p != null) {
			if (p.getHoten().equalsIgnoreCase(hoTen)) {
				System.out.println(p.getMaSV() + ";" + p.getHoten());
			}
			p = p.nextLink;
		}
	}

	public void displaySortedResults() {
		kq();
		xl();
		printlist();
	}

}
