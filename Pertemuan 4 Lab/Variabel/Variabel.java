public class Variabel {
	private int a;
	private boolean menikah;
	private char nama;
	
	public static final String JUDUL = "Belajar Java Yuks";
	public static String judul2 ="Belajar Java Yuks";
	
	public static void main (String [] args){
		Variabel var = new Variabel();
		final int a = 12;
		var.a = 1;
		//a = 11; -> tidak bisa dilakukan
		double aa,b,c;
		String nama = "Nama Saya";
		byte bb =1, B = 2;
		System.out.println(JUDUL);
		System.out.println(judul2);
	}
	
	public void tesvariabel(){
		System.out.println(a);
		System.out.println(menikah);
		System.out.println(JUDUL);
		System.out.println(judul2);
	}
}

class AksesVarlabelStatic {
	public void aksesVariabelStatic() {
		System.out.println(Variabel.JUDUL);
	}
}