public class main {

	public static void main (String[] args) {
		Lemari aa = new Lemari();
		aa.setnama("Agum Gumelar Azwar");
		aa.setbanyak(2);
		aa.setbaju(8);
		aa.setcelana(8);
		aa.setgantungan(16);
		aa.setharga(5000000);
		System.out.println("==========================================================");
		System.out.println("Nama 		        :" + aa.getnama());
		System.out.println("Banyak Lemari    	:" + aa.getbanyak());
		System.out.println("Banyak Baju      	:" + aa.getbaju());
		System.out.println("Banyak Celana    	:" + aa.getcelana());
		System.out.println("Banyak Gantungan 	:" + aa.getgantungan());
		System.out.println("Harga Lemari     	:" + aa.getharga());
		System.out.println("==========================================================");
	}
}