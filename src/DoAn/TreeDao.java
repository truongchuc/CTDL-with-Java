package DoAn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TreeDao {
    
    public void ghiFile(Node root) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream("D:\\BT PhuXuan\\CTDL và GT\\thi2.bin");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(root);
            System.out.println("Ghi file thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fout != null)
                    fout.close();
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Node docFile(String filename) {
        Node root = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            root = (Node) ois.readObject();
            System.out.println("Đọc file thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fin != null)
                    fin.close();
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return root;
    }
}
