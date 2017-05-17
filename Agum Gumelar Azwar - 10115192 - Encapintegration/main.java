public class main {
    private String nama;
	String nama_pemilik;
	byte banyak,banyakisi,baju,celana,gantungan;
	int harga;
	
public static void main (String[] args){
	Lemari1 aa = new Lemari1();
	aa.data();
	aa.overloading1("Overloading");
	aa.overloading2("Overloading","Dua Variabel ");
	
	bio bb = new bio();
	bb.setnama("Agum Gumelar Azwar");
	bb.settempat("Lubuk Basung / 11 Juli 1997");
	bb.setjeniskl("Laki-Laki");
	bb.setumur(19);
	System.out.println("\n===============Data Pemilik===================");
	System.out.println("Nama                 :"+bb.getnama());
	System.out.println("Tempat Tanggal Lahir :"+bb.gettempat());
	System.out.println("Jenis Kelamin        :"+bb.getjeniskl());
	System.out.println("Umur                 :"+bb.getumur());
	System.out.println("==============================================");

	}
}