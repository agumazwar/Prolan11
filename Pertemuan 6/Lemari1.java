public class Lemari1 extends Lemari {
	
    @Override
    public void cetakNama() {
        System.out.println("         " + super.getNama()); //Super Dan Override
    }
	
	public Lemari1 (String name) { // Super Pada Konstruktor
		super(name);
	}
	
	public void Super() {
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
        Lemari1 pemilik = new Lemari1("Tugas Pewarisan dan Override"); //Konstruktor
		Lemari milik = new Lemari();
        pemilik.setNama("Tugas Pewarisan dan Override");
        pemilik.cetakNama();
		pemilik.data_pemilik();
		pemilik.Super();
		System.out.println("\n");
		pemilik.getName();
		System.out.println("===========================================");
		System.out.print("Banyak Baju :");pemilik.overloading("12 Baju");
		System.out.print("Banyak Celana :");pemilik.overloading1("8 Celana");
		System.out.print("Banyak Baju dan Celana :");pemilik.overloading2("12 Baju ", "8 Celana");
		
    }
}