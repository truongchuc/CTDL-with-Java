package DeQuy;

public class ChuyenDoiNhiPhan {
	public static void main(String[] args) {
		int soThapPhan = 2; 

		String soNhiPhan = chuyenDoiNhiPhan(soThapPhan);
		System.out.println("Số nhị phân là: " + soNhiPhan);
	}

	private static String chuyenDoiNhiPhan(int soThapPhan) {
     String KetQua = "";
        while (soThapPhan > 0) {
            int phanDu = soThapPhan % 2;
            KetQua = phanDu + KetQua;
            soThapPhan /= 2;
        }

        return KetQua;
    }
}
