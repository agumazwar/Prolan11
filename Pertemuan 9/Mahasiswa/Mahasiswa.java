public abstract class Mahasiswa {
	protected String nama;
	protected String nim;
	
	protected void organisasi (){
		System.out.println("Mahasiswa Yang Ikut Dalam Organisasi");
		
		}
		
	protected abstract void kuliah (String nama);

	protected abstract void lulus ();
	
	protected abstract void tdklulus();

}