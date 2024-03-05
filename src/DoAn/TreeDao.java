package DoAn;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TreeDao {
	
	public void ghiFile(Node fisrt) {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try {

			fout = new FileOutputStream("D:\\BT PhuXuan\\CTDL và GT\\thi2.bin");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(fisrt);

			System.out.println("Xong rồi!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Node docFile(String filename) {

		Node fisrt = new Node();

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {
			fin = new FileInputStream(filename);
			ois = new ObjectInputStream(fin);
			fisrt = (Node) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return fisrt;
	}

}
