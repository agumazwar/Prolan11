public class Lemari {
	public String jenis;
	
	public void Pakaian() {
		System.out.println("\t\t|\t\t\t Baju \t\t\t     | ");
		System.out.println("\t\t|\t\t\t Celana \t\t     |");		
	}
	
	public static void main (String[] args) {
		Lemari isi = new Lemari();
		System.out.println("\t\t|----------------------------------------------------|");
		System.out.println(" \t\t|\t\t    Tugas Pertemuan 3                |");
		System.out.println("\t\t|----------------------------------------------------|");
		isi.jenis ="Lemari Besar";
		isi.Pakaian();
		System.out.println("\t\t|----------------------------------------------------|");
		System.out.println(" \t\t|    Termia Kasih Sudah MenjalanKan Program saya ^_^ |");
		System.out.println("\t\t|----------------------------------------------------|");
	}

}