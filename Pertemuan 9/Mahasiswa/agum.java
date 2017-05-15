public class agum extends Mahasiswa {

	protected void organisasi(){
		super.organisasi();
	
	}
	
	protected void kuliah(String nama){
		System.out.println(nama +" Masuk Tepat Waktu");
		System.out.println("Mengerjakan Tugas");
		System.out.println("Mengikuti Ujian");
	
	}

	protected void lulus (){
		System.out.println(" \nSaya Akan Lulus Tepat Waktu");
		System.out.println("Jika Tidak Ada Nilai Matakuliah Yang E");
		System.out.println("Serta Matakuliah yang Bernilai D tidak Melebihi 9 SKS ");
	
	}

	protected void tdklulus (){
		System.out.println("\nSaya Tidak Lulus Karena");
		System.out.println("Ada Nilai Matakuliah Yang E");
		System.out.println("Atau Matakuliah yang Bernilai D tidak Melebihi 9 SKS ");
	
	}	
}