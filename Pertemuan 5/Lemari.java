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
 
    Lemari (String nama) {
		this.nama = nama;
	}
	
	public void getName () {
		System.out.println("Tugas Pertemuan 5 : " +nama);
	}
	
	public void data (){
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