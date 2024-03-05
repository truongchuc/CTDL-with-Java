package danhsachlienket;

import java.util.Scanner;

public class linklist {
    private link first;

    public linklist() {
        first = null;
    }

    public link insert(String maSV, String hoten, double diem) {
        link nut = new link(maSV, hoten, diem);
        nut.nextLink = first;
        first = nut;
        return first;
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
                System.out.println("Nhap ho ten:");
                String hoten = scanner.nextLine();
                System.out.println("Nhap diem:");
                double diem = scanner.nextDouble();
                scanner.nextLine();
                first = insert(maSV, hoten, diem);
            }
        }
    }

    public void printlist() {
        link p = first;
        while (p != null) {
            System.out.println(p.getMaSV() + " " + p.getHoten() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl());
            p = p.nextLink;
        }
    }

    public void printif() {
        link p = first;
        while (p != null) {
            if (p.getDiem() >= 5)
                System.out.println(p.getHoten() + " " + p.getDiem());
            p = p.nextLink;
        }
    }

    public void kq() {
        link p = first;
        while (p != null) {
            if (p.getDiem() >= 5)
                p.setKq("dau");
            else
                p.setKq("rot");
            p = p.nextLink;
        }
    }

    public void xl() {
        link p = first;
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

    public double max() {
        link p = first;
        double ln = first.getDiem();
        while (p != null) {
            if (ln < p.getDiem())
                ln = p.getDiem();
            p = p.nextLink;
        }
        return ln;
    }

    public link search(String maSV) {
        link p = first;
        while ((p != null) && (!p.getMaSV().equals(maSV))) {
            p = p.nextLink;
        }
        return p;
    }

    public void delete(String maSV) {
        link p = search(maSV);
        if (p != null) {
            if (p == first) {
                first = first.nextLink;
            } else {
                link q = first;
                while ((q.nextLink != p) && (q != null))
                    q = q.nextLink;
                q.nextLink = p.nextLink;
            }
        }
    }

    public void sort() {
        link p, q;
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
        link p = first;
        while (p != null) {
            if (p.getHoten().equalsIgnoreCase(hoTen)) {
                System.out.println(p.getMaSV() + ";" + p.getHoten());
            }
            p = p.nextLink;
        }
    }
}
