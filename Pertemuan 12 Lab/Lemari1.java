public class Lemari1 extends Lemari {

    private String nama;
	String nama_pemilik;
	int harga;
	
protected String getNama() {
        return nama;
    }
 
    protected void setNama(String nama) {
        this.nama = nama;
    }
 
    protected void cetakNama() {
        System.out.println(nama);
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
	
	public void getName () {
		System.out.println("Tugas Pertemuan 6 : " +nama);
	}
	
	public void data (){
		System.out.println("========================================");
		System.out.println("Nama Pemilik        : Agum Gumelar Azwar");
		System.out.println("Banyak Lemari       : 1 Lemari");
		System.out.println("Total Harga         : 5000000");
		System.out.println("Banyak Isi Lemari   : 32");
		System.out.println("Banyak Baju         : 8");
		System.out.println("Banyak Celana       : 8");
		System.out.println("Banyak Gantungan    : 16");
		System.out.println("========================================");
	}
}