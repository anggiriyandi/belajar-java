package belajar.java.fundamental;
import com.belajar.ecommerce.Product;

public class Hallo {
	private String nama = "anggi";

	public void salam() {
		System.out.println("Hallo : "+ nama);
	}

	public static void main(String arr[]){
		Product p1 = new Product("001","product 1",2);

		System.out.println("Menampilkan product 1");
		System.out.println("Kode product : "+p1.getKode());
		System.out.println("Nama Product : "+p1.getNama());
		System.out.println("Stok product : "+p1.getStok());
		
		Product p2 = new Product();
		
		System.out.println("Menampilkan product 2");
		System.out.println("Kode product : "+p2.getKode());
		System.out.println("Nama Product : "+p2.getNama());
		System.out.println("Stok product : "+p2.getStok());

		p2.setNama("PRODUCT 2");
		p2.setKode("002");
		p2.setStok(2);

		System.out.println("Kode product : "+p2.getKode());
		System.out.println("Nama Product : "+p2.getNama());
		System.out.println("Stok product : "+p2.getStok());
	}
}