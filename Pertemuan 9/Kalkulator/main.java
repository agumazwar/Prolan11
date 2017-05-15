import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args){
	double operan1, operan2;
	
	fungsi cal = new fungsi();
	
	Scanner input = new Scanner (System.in);
	operan1 = input.nextDouble();
	operan2 = input.nextDouble();
	
	System.out.println("Hasil Penjumlahan Adalah : " + cal.hasilTambah(operan1,operan2));
	System.out.println("Hasil Penjumlahan Adalah : " + cal.hasilKurang(operan1,operan2));
	System.out.println("Hasil Penjumlahan Adalah : " + cal.hasilKali(operan1,operan2));
	System.out.println("Hasil Penjumlahan Adalah : " + cal.hasilBagi(operan1,operan2));
	}
}
