public class Lemari {
	public String jenis;
	
	public void Pakaian() {
		String jenis1 = "Baju, ";
		System.out.print(jenis1);
		
		String jenis2 = "Celana";
		System.out.println(jenis2);		
	}
	
	public void Banyak() {
		byte banyakbaju = 20;
		byte banyakcelana = 12;
		System.out.print("Banyak Baju \t\t: "); System.out.println(banyakbaju);
		System.out.print("Banyak Celana \t\t: "); System.out.println(banyakcelana);
	}
	
	public void Nama_pemilik() {
		
		String Nama = "AGUM GUMELAR AZWAR";
		System.out.println(Nama);
	}
	
	public static void main (String[] args) {
		Lemari isi = new Lemari();

		System.out.println("\t\tTugas Pertemuan 3");
		System.out.println("\t\t-----------------");
		isi.jenis ="Lemari Besar";
		System.out.print("Nama Pemilik \t\t: "); isi.Nama_pemilik();
		System.out.print("Isi Lemari \t\t: "); isi.Pakaian();
		isi.Banyak();
		isi.methodoverloading("Agum Gumelar Azwar"); 
		isi.methodoverloading("Agum Gumelar Azwar"," Trio Putra Azwar"); 
		Lemari nama = new Lemari();
		System.out.println(nama.Nama_Konstruktor);
		System.out.println(isi.harga_lemari(2, 3000000));
		System.out.println("Terimakasih Kasih Sudah MenjalanKan Program saya ^_^");		
	}
		String Nama_Konstruktor; 
			Lemari() 
			{
				Nama_Konstruktor = "Lemari Baru";
			}

	private void methodoverloading(String namapengisi){
			System.out.println(namapengisi);
		}
		
	private void methodoverloading(String namapengisi1, String namapengisi2){
			System.out.println(namapengisi1 + namapengisi2);
		}
	public int harga_lemari (int banyak, int harga) { //method function pengembalian nilai
			return banyak * harga;
		}		
}