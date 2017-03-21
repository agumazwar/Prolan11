public class Lemari1 extends Lemari {
	
    @Override
    public void cetakNama() {
        System.out.println("         " + super.getNama()); //Super Dan Override
    }
	
	public Lemari1 (String name) { // Super Pada Konstruktor
		super(name);
	}
	
	public void penggunaanSuper() {
      System.out.println("Banyak Pintu Lemari " + super.pintu); //Super Pada Atribut
    }
	
	public void data_pemilik () { // Super Pada Method
		nama_pemilik = "Agum Gumelar Azwar";
		banyak = 2;
		harga = banyak * 3000000;
		banyakisi = 32;
		baju = 12;
		celana = 12;
		gantungan = 8;
		super.data();
	}
	
	public static void main(String[] args) {
        Lemari1 pemilik = new Lemari1("Tugas Pewarisan");
        pemilik.setNama("Tugas Pewarisan");
        pemilik.cetakNama();
		pemilik.data_pemilik();
		pemilik.penggunaanSuper();
		pemilik.getName();
    }
}