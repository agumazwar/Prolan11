public class main {
    private String nama;
	String nama_pemilik;
	byte banyak,banyakisi,baju,celana,gantungan;
	int harga;
	
public static void main (String[] args){
	Lemari1 aa = new Lemari1();
	aa.data();
	aa.overloading1("Beli 1 Lemari = Rp.5.000.000");
	aa.overloading2("Beli 5 ","Diskon 25% ");
	
	bio bb = new bio();
	bb.setnama("Agum Gumelar Azwar");
	bb.settempat("Lubuk Basung / 11 Juli 1997");
	bb.setjeniskl("Laki-Laki");
	bb.setumur(19);
	System.out.println("\n====================Data Nota====================");
	System.out.println("Nama                 :"+bb.getnama());
	System.out.println("Tempat Tanggal Lahir :"+bb.gettempat());
	System.out.println("Jenis Kelamin        :"+bb.getjeniskl());
	System.out.println("Umur                 :"+bb.getumur());
	System.out.println("=================================================");
	
	isidata cc = new isidata();
	System.out.println("\n============================ Biodata ================================");
	System.out.print("Nama Pembeli 			: ");cc.NamaLengkap();
	System.out.print("Tempat Tanggal Lahir 		: ");cc.Ttl();
	System.out.print("Alamat				: ");cc.Alamat();
	System.out.print("Pekerjaan			: ");cc.Pekerjaan();
	System.out.print("Uang Bulanan		 	: ");cc.UangBulanan();
	System.out.println("=====================================================================");
	
	 Generic <String> GenericString = new Generic <> ();
                System.out.print("Pemilik Lemari Ini Bernama : ");
                GenericString.setTipe("Agum Gumelar Azwar");
                System.out.println(GenericString.getTipe());
	
	 DataKamar dd =new DataKamar();
		dd.NamaArray();
	}
}