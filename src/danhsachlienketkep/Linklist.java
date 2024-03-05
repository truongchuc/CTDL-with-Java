package danhsachlienketkep;

import java.util.Scanner;

public class Linklist {
	public DoubleLink first, last;
	DoubleLink q = null;
	DoubleLink p = null;

	public Linklist() {
		first = null;
		last = null;
	}

	public void insert(String maSV, String hoten, double diem) {
		DoubleLink nut = new DoubleLink(maSV, hoten, diem);
		if ((last == null) && (first == null)) {
			last = nut;
			first = nut;
		} else {
			last.next = nut;
			nut.prev = last;
			last = nut;
		}
	}

	public void creatlist() {
		Scanner scanner = new Scanner(System.in);
		boolean ok = true;

		while (ok) {
			String maSV = "";
			System.out.print("Nhap ma sinh vien:");
			maSV = scanner.nextLine();
			if (maSV.length() == 0) {
				ok = false;
			} else {
				System.out.println("Nhap ho ten:");
				String hoten = scanner.nextLine();
				System.out.println("Nhap diem:");
				double diem = scanner.nextDouble();
				scanner.nextLine();
				insert(maSV, hoten, diem);
			}
		}
	}

	public void printlist() {
		DoubleLink p = first;
		while (p != null) {
			System.out
					.println(p.getMaSV() + " " + p.getHoten() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl());
			p = p.next;
		}
	}

	// printlist(true) == first in danh sách từ đầu đên cuối
	// printlist(false) == last in danh sách từ cuối đên đầu
	public void printlist(boolean fromFirst) {
		DoubleLink p;
		if (fromFirst) {
			p = first;
			while (p != null) {
				System.out.println(
						p.getMaSV() + " " + p.getHoten() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl());
				p = p.next;
			}
		} else {
			p = last;
			while (p != null) {
				System.out.println(
						p.getMaSV() + " " + p.getHoten() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl());
				p = p.prev;
			}
		}
	}

	public void printif() {
		DoubleLink p = first;
		while (p != null) {
			if (p.getDiem() >= 5)
				System.out.println(p.getHoten() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl());
			p = p.next;
		}
	}

	public void kq() {
		DoubleLink p = first;
		while (p != null) {
			if (p.getDiem() >= 5)
				p.setKq("dau");
			else
				p.setKq("rot");
			p = p.next;
		}
	}

	public void xl() {
		DoubleLink p = first;
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
			p = p.next;
		}
	}

	public double max() {
		DoubleLink p = first;
		double ln = first.getDiem();
		while (p != null) {
			if (ln < p.getDiem())
				ln = p.getDiem();
			p = p.next;
		}
		return ln;
	}

	public DoubleLink search(String maSV) {
		DoubleLink p = first;
		while ((p != null) && (!p.getMaSV().equals(maSV))) {
			p = p.next;
		}
		return p;
	}

	public void delete(String maSV) {
		DoubleLink p = search(maSV);
		if (p != null) {
			if (p == first) {
				first = first.next;
				if (first != null) {
					first.prev = null;
				}
			} else {
				DoubleLink q = p.prev;
				q.next = p.next;
				if (p.next != null) {
					p.next.prev = q;
				}
			}
		}
	}

	public void sort() {
		DoubleLink p, q;
		String ht, maSV;
		double diem;
		p = first;
		while (p != null) {
			q = p.next;
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
				q = q.next;
			}
			p = p.next;
		}
	}

	public void search1(String hoTen) {
		DoubleLink p = first;
		while (p != null) {
			if (p.getHoten().equalsIgnoreCase(hoTen)) {
				System.out.println(p.getMaSV() + ";" + p.getHoten());
			}
			p = p.next;
		}
	}

	public void insertBefore(DoubleLink nextNode, String maSV, String hoten, double diem) {
		if (nextNode == null) {
			System.out.println("Nút sau đó không tồn tại.");
			return;
		}

		DoubleLink newNode = new DoubleLink(maSV, hoten, diem);

		newNode.prev = nextNode.prev;
		if (nextNode.prev != null) {
			nextNode.prev.next = newNode;
		}

		newNode.next = nextNode;
		nextNode.prev = newNode;
	}

	public void insertAfter(DoubleLink prevNode, String maSV, String hoten, double diem) {
		if (prevNode == null) {
			System.out.println("Nút trước đó không tồn tại.");
			return;
		}

		DoubleLink newNode = new DoubleLink(maSV, hoten, diem);

		newNode.next = prevNode.next;
		if (prevNode.next != null) {
			prevNode.next.prev = newNode;
		}

		prevNode.next = newNode;
		newNode.prev = prevNode;
	}

	public void xlvakq() {
		xl();
		kq();
	}

	public void thongKeTheoXepLoai() {
		int gioi = 0, kha = 0, trungBinh = 0, kem = 0;

		DoubleLink p = first;

		while (p != null) {
			String xl = p.getXl();

			switch (xl.toLowerCase()) {
			case "gioi":
				gioi++;
				break;
			case "kha":
				kha++;
				break;
			case "trung binh":
				trungBinh++;
				break;
			case "kem":
				kem++;
				break;
			default:
				System.out.println("Loại xếp loại không hợp lệ: " + xl);
				break;
			}

			p = p.next;
		}

		System.out.println("Thống kê theo xếp loại:");
		System.out.println("Gioi: " + gioi);
		System.out.println("Kha: " + kha);
		System.out.println("Trung binh: " + trungBinh);
		System.out.println("Kem: " + kem);
	}

}
