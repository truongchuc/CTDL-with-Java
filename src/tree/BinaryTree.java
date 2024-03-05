package tree;

import java.util.Scanner;

public class BinaryTree {
	public Node root;

	public BinaryTree() {
		root = null;
	}

	public Node insertNode(Node root, String maSV, String ht, double diem) {
		if (root == null) {
			root = new Node(maSV, ht, diem);
			return root;
		}
		if (root.getMaSV().compareTo(maSV) > 0) {
			root.left = insertNode(root.left, maSV, ht, diem);
		} else if (root.getMaSV().compareTo(maSV) < 0) {
			root.right = insertNode(root.right, maSV, ht, diem);
		}
		return root;
	}

	public Node insertNode1(Node root, String maSV, String ht, double diem) {
		if (root == null) {
			return new Node(maSV, ht, diem);
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

		Node newNode = new Node(maSV, ht, diem);
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
				System.out.print("Điểm: ");
				double diem = sc.nextDouble();
				sc.nextLine();
				root = insertNode1(root, maSV, ht, diem);
			}
		}
	}

	public void tgp(Node root) {
		if (root != null) {
			tgp(root.left);
			System.out.println("Mã Sinh Viên là: " + root.getMaSV() + "\t" + "Họ Tên là: " + root.getHt() + "\t"
					+ "Điểm là: " + root.getDiem() + "\t" + "Xếp loại là: " + root.getXl() + "\t" + "Kết quả là :"
					+ root.getKq());
			tgp(root.right);
		}
	}

	public void duyetif(Node root) {
		if (root != null) {
			duyetif(root.left);
			if (root.getDiem() >= 5) {
				System.out.println("Mã Sinh Viên là: " + root.getMaSV() + "\t" + "Họ Tên là: " + root.getHt() + "\t"
						+ "Điểm là: " + root.getDiem());
			}
			duyetif(root.right);
		}
	}

	public void xl(Node root) {
		if (root != null) {
			xl(root.left);
			if (root.getDiem() < 5) {
				root.setXl("Kém");
			}
			if (root.getDiem() >= 5) {
				root.setXl("Trung Bình");
			}
			if (root.getDiem() > 5 && root.getDiem() <= 7) {
				root.setXl("Khá");
			}
			if (root.getDiem() > 7 && root.getDiem() <= 9) {
				root.setXl("Giỏi");
			}
			if (root.getDiem() == 10) {
				root.setXl("Xuất Sắc ");
			}
			xl(root.right);
		}
	}

	public void kq(Node root) {
		if (root != null) {
			kq(root.left);
			if (root.getDiem() >= 5) {
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
						+ "Điểm là: " + root.getDiem());
				break;
			}
			if (p == null) {
				System.out.println("Cây rỗng hoặc không tìm thấy");
			}
		}
	}

	public void chen(String maSV) {
		boolean oke = false;

		while (!oke) {
			Node p = root;

			while (p != null) {
				if (p.getMaSV().compareTo(maSV) > 0) {
					p = p.left;
				} else if (p.getMaSV().compareTo(maSV) < 0) {
					p = p.right;
				} else {
					oke = true;
					System.out.println("Mã sinh viên này đã có trong cây");
					break;
				}
			}

			if (!oke) {
				System.out.println("Mã sinh viên này chưa có trong cây");
				boolean ok = true;
				Scanner sc = new Scanner(System.in);

				while (ok) {
					if (maSV.length() == 0) {
						ok = false;
					} else {
						System.out.print("Họ Tên: ");
						String ht = sc.nextLine();
						System.out.print("Điểm: ");
						double diem = sc.nextDouble();
						sc.nextLine();
						root = insertNode(root, maSV, ht, diem);
						System.out.println("Sinh viên đã được thêm vào cây.");
						oke = true;
						break;
					}
				}
			}
		}
	}

}
