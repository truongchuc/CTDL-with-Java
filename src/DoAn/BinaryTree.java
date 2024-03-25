package DoAn;

import java.util.Scanner;

public class BinaryTree {
	TreeDao obj = new TreeDao();
	public Node root;

	public void ghiFile() {
		obj.ghiFile(root);
	}

	public void docFile() {
		root = obj.docFile("D:\\BT PhuXuan\\CTDL và GT\\thi2.bin");
	}

	public BinaryTree() {
		root = null;
	}

	public Node insertNode(Node root, String maSV, String ht, double diemToan, double diemVan, double diemAnh) {
		if (root == null) {
			root = new Node(maSV, ht, diemToan, diemVan, diemAnh);
			return root;
		}
		if (root.getMaSV().compareTo(maSV) > 0) {
			root.left = insertNode(root.left, maSV, ht, diemToan, diemVan, diemAnh);
		} else if (root.getMaSV().compareTo(maSV) < 0) {
			root.right = insertNode(root.right, maSV, ht, diemToan, diemVan, diemAnh);
		}
		return root;
	}

	public Node insertNode1(Node root, String maSV, String ht, double diemToan, double diemVan, double diemAnh) {
		if (root == null) {
			return new Node(maSV, ht, diemToan, diemVan, diemAnh);
		}

		Node q = null, p = root;

		while (p != null) {
			q = p;

			if (p.getMaSV().compareTo(maSV) > 0) {
				p = p.left;
			} else if (p.getMaSV().compareTo(maSV) < 0) {
				p = p.right;
			} else {
				System.out.println("Mã sinh viên đã tồn tại trong cây");
				return root;
			}
		}

		Node newNode = new Node(maSV, ht, diemToan, diemVan, diemAnh);
		if (q.getMaSV().compareTo(maSV) > 0) {
			q.left = newNode;
		} else {
			q.right = newNode;
		}

		return root;
	}

	public void create() {
		boolean ok = true;
		Scanner sc = new Scanner(System.in);
		while (ok) {
			String maSV = "";
			System.out.print("Nhập Mã Sinh Viên: ");
			maSV = sc.nextLine();

			if (maSV.length() == 0) {
				ok = false;
			} else {
				System.out.print("Họ Tên: ");
				String ht = sc.nextLine();
				System.out.print("Điểm Toán: ");
				double diemToan = sc.nextDouble();
				sc.nextLine();
				System.out.print("Điểm Văn: ");
				double diemVan = sc.nextDouble();
				sc.nextLine();
				System.out.print("Điểm Anh: ");
				double diemAnh = sc.nextDouble();
				sc.nextLine();
				root = insertNode1(root, maSV, ht, diemToan, diemVan, diemAnh);
			}
		}
		obj.ghiFile(root);
	}

	public void docfile() {
		root = obj.docFile("D:\\BT PhuXuan\\CTDL và GT\\thi2.bin");
	}

	public void printlist(Node root) {
		System.out.println("+------+---------------------+---------+---------+---------+--------+-----------+");
		System.out.println("| Mã SV|       Họ và tên     |  Toán   |  Văn    |  Anh    | Kết quả| Xếp loại  |");
		System.out.println("+------+---------------------+---------+---------+---------+--------+-----------+");
		printNodes(root);
		System.out.println("+------+---------------------+---------+---------+---------+--------+-----------+");
	}

	private void printNodes(Node root) {
		if (root != null) {
			printNodes(root.left);
			System.out.printf("| %-5s| %-20s| %8.2f| %8.2f| %8.2f| %-7s| %-10s|\n", root.getMaSV(), root.getHt(),
					root.getDiemToan(), root.getDiemVan(), root.getDiemAnh(), root.getKq(), root.getXl());
			printNodes(root.right);
		}
	}

	public void duyetif(Node root) {
		if (root != null) {
			duyetif(root.left);
			if (root.getDiemToan() >= 5 && root.getDiemVan() >= 5 && root.getDiemAnh() >= 5) {
				System.out.println("+-------------+----------------------+----------+");
				System.out.printf("| Mã SV: %-5s | Họ tên: %-15s | Điểm: Toán: %.2f, Văn: %.2f, Anh: %.2f |\n",
						root.getMaSV(), root.getHt(), root.getDiemToan(), root.getDiemVan(), root.getDiemAnh());
			}
			duyetif(root.right);
		}
	}

	public void xl(Node root) {
		if (root != null) {
			xl(root.left);
			if (root.getDiemToan() < 5 || root.getDiemVan() < 5 || root.getDiemAnh() < 5) {
				root.setXl("Kém");
			}
			if (root.getDiemToan() >= 5 && root.getDiemVan() >= 5 && root.getDiemAnh() >= 5) {
				double avg = (root.getDiemToan() + root.getDiemVan() + root.getDiemAnh()) / 3;
				if (avg < 5) {
					root.setXl("Trung Bình");
				} else if (avg >= 5 && avg < 7) {
					root.setXl("Khá");
				} else if (avg >= 7 && avg < 9) {
					root.setXl("Giỏi");
				} else {
					root.setXl("Xuất Sắc");
				}
			}
			xl(root.right);
		}
	}

	public void kq(Node root) {
		if (root != null) {
			kq(root.left);
			if (root.getDiemToan() >= 5 && root.getDiemVan() >= 5 && root.getDiemAnh() >= 5) {
				root.setKq("Đậu");
			} else {
				root.setKq("Rớt");
			}
			kq(root.right);
		}
	}

	public void kqxl() {
		kq(root);
		xl(root);
	}

	public void timkiem(String maSV) {
		Node p = root;
		while (p != null) {
			if (p.getMaSV().compareTo(maSV) > 0) {
				p = p.left;
			} else if (p.getMaSV().compareTo(maSV) < 0) {
				p = p.right;
			} else {
				System.out.println("Mã Sinh Viên là: " + root.getMaSV() + "\t" + "Họ Tên là: " + root.getHt() + "\t"
						+ "Điểm Toán là: " + root.getDiemToan() + "\t" + "Điểm Văn là: " + root.getDiemVan() + "\t"
						+ "Điểm Anh là: " + root.getDiemAnh());
				break;
			}
			if (p == null) {
				System.out.println("Cây rỗng hoặc không tìm thấy");
			}
		}
	}

	public void xoaNode(String maSV) {
		root = xoa(root, maSV);
	}

	private Node xoa(Node root, String maSV) {
		if (root == null) {
			return root;
		}

		if (maSV.compareTo(root.getMaSV()) < 0) {
			root.left = xoa(root.left, maSV);
		} else if (maSV.compareTo(root.getMaSV()) > 0) {
			root.right = xoa(root.right, maSV);
		} else {
			// Node có thể có 0 hoặc 1 child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			// Node có 2 children, tìm node thay thế với node hiện tại
			root.setMaSV(minValueNode(root.right).getMaSV());

			// Xóa node thay thế
			root.right = xoa(root.right, root.getMaSV());
		}
		return root;
	}

	// Tìm node có giá trị nhỏ nhất trong cây con bên phải của root
	private Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

}
