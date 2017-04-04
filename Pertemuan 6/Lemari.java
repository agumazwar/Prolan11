public class Lemari {
    private String nama;
	String nama_pemilik;
	byte banyak,banyakisi,baju,celana,gantungan;
	int harga;
	
	String pintu = "Mempunyai 3 Pintu";
	
	protected String getNama() {
        return nama;
    }
 
    protected void setNama(String nama) {
        this.nama = nama;
    }
 
    protected void cetakNama() {
        System.out.println(nama);
    }
	
	String Alamat; //Konstruktor
		Lemari() {
			Alamat = "Cisitu Lama 1 No 1 Kamar No 5"; 
		}
		
	public void overloading(String jum1){
		System.out.println(jum1);
	}	
	
	public void overloading1(String jum2){
		System.out.println(jum2);
	}
	
	public void overloading2(String jum3, String jum4){
		System.out.println(jum3 + jum4);
	}
	
    Lemari (String nama) {
		this.nama = nama;
	}
	
	public void getName () {
		System.out.println("Tugas Pertemuan 6 : " +nama);
	}
	
	public void data (){
		System.out.println("========================================");
		System.out.println("Nama Pemilik        : "+nama_pemilik);
		System.out.println("Banyak Lemari       : "+banyak);
		System.out.println("Total Harga         : "+harga);
		System.out.println("Banyak Isi Lemari   : "+banyakisi);
		System.out.println("Banyak Baju         : "+baju);
		System.out.println("Banyak Celana       : "+celana);
		System.out.println("Banyak Gantungan    : "+gantungan);
		System.out.println("========================================");
	}
}