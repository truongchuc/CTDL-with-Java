package DoAn;

import java.util.Scanner;

public class Linklist {
	LinkDao obj = new LinkDao();
	private Link first;

	public Linklist() {
		first = null;
	}

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
					System.out.println("Nhap diem toan:");
					double diemToan = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Nhap diem van:");
					double diemVan = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Nhap diem anh:");
					double diemAnh = scanner.nextDouble();
					scanner.nextLine();
					insert(maSV, hoten, diemToan, diemVan, diemAnh);
				} else {
					System.out.println("Mã sinh viên đã tồn tại trong danh sách.");
				}
			}
		}
		obj.ghiFile(first);
	}

	public void insert(String maSV, String hoten, double diemToan, double diemVan, double diemAnh) {
		if (!isMaSVExist(maSV)) {
			Link nut = new Link(maSV, hoten, diemToan, diemVan, diemAnh);
			nut.nextLink = first;
			first = nut;
		} else {
			System.out.println("Mã sinh viên đã tồn tại trong danh sách.");
		}
	}

	public void printlist() {
		Link p = first;
		System.out.println("+------+---------------------+---------+---------+---------+--------+-----------+");
		System.out.println("| Mã SV|       Họ và tên     |  Toán   |  Văn    |  Anh    | Kết quả| Xếp loại  |");
		System.out.println("+------+---------------------+---------+---------+---------+--------+-----------+");
		while (p != null) {
			System.out.printf("| %-5s| %-20s| %8.2f| %8.2f| %8.2f| %-7s| %-10s|\n", p.getMaSV(), p.getHoten(),
					p.getDiemToan(), p.getDiemVan(), p.getDiemAnh(), p.getKq(), p.getXl());
			p = p.nextLink;
		}
		System.out.println("+------+---------------------+---------+---------+---------+--------+-----------+");
	}

	public void printif() {
		Link p = first;
		while (p != null) {
			if (p.getDiemToan() >= 5 && p.getDiemVan() >= 5 && p.getDiemAnh() >= 5)
				System.out.println(p.getHoten() + " " + p.getDiemToan() + " " + p.getDiemVan() + " " + p.getDiemAnh());
			p = p.nextLink;
		}
	}

	public void kq() {
		Link p = first;
		while (p != null) {
			if (p.getDiemToan() >= 5 && p.getDiemVan() >= 5 && p.getDiemAnh() >= 5)
				p.setKq("dau");
			else
				p.setKq("rot");
			p = p.nextLink;
		}
	}

	public void xl() {
		Link p = first;
		while (p != null) {
			double diemTB = (p.getDiemToan() + p.getDiemVan() + p.getDiemAnh()) / 3;
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

	public void sort() {
		Link p, q;
		String ht, maSV;
		double diemToan, diemVan, diemAnh;
		p = first;
		while (p != null) {
			q = p.nextLink;
			while (q != null) {
				double diemTB1 = (p.getDiemToan() + p.getDiemVan() + p.getDiemAnh()) / 3;
				double diemTB2 = (q.getDiemToan() + q.getDiemVan() + q.getDiemAnh()) / 3;
				if (diemTB1 > diemTB2) {
					ht = q.getHoten();
					diemToan = q.getDiemToan();
					diemVan = q.getDiemVan();
					diemAnh = q.getDiemAnh();
					maSV = q.getMaSV();
					q.setMaSV(p.getMaSV());
					q.setHoten(p.getHoten());
					q.setDiemToan(p.getDiemToan());
					q.setDiemVan(p.getDiemVan());
					q.setDiemAnh(p.getDiemAnh());
					p.setMaSV(maSV);
					p.setHoten(ht);
					p.setDiemToan(diemToan);
					p.setDiemVan(diemVan);
					p.setDiemAnh(diemAnh);
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
				System.out.println(p.getMaSV() + " - " + p.getHoten() + ": Toán - " + p.getDiemToan() + ", Văn - "
						+ p.getDiemVan() + ", Anh - " + p.getDiemAnh());
			}
			p = p.nextLink;
		}
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

	public double max() {
		Link p = first;
		double ln = (p.getDiemToan() + p.getDiemVan() + p.getDiemAnh()) / 3;
		while (p != null) {
			double diemTB = (p.getDiemToan() + p.getDiemVan() + p.getDiemAnh()) / 3;
			if (ln < diemTB)
				ln = diemTB;
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

	public void displaySortedResults() {
		kq();
		xl();
		printlist();
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

	public void chinhSuaThongTin(String maSV) {
		Link p = search(maSV);
		if (p != null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập thông tin mới cho sinh viên có mã SV " + maSV + ":");
			System.out.print("Họ tên: ");
			p.setHoten(scanner.nextLine());
			System.out.print("Điểm Toán: ");
			p.setDiemToan(scanner.nextDouble());
			scanner.nextLine();
			System.out.print("Điểm Văn: ");
			p.setDiemVan(scanner.nextDouble());
			scanner.nextLine();
			System.out.print("Điểm Anh: ");
			p.setDiemAnh(scanner.nextDouble());
			scanner.nextLine();
			System.out.println("Thông tin của sinh viên đã được cập nhật thành công.");
		} else {
			System.out.println("Không tìm thấy sinh viên có mã SV " + maSV);
		}
	}

}
