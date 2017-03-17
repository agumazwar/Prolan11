import java.util.Scanner;

public class Quiz {
  public static Scanner input = new Scanner(System.in);

  public static int isWithinRange(float x, float min, float max) {
    byte result = 1;
    if (x < min || x > max) {
      result = 0;
    }
    return result;
  }

  public static void main(String[] args) {
    float nilai = 0, jum_nilai = 0, rata_mhs = 0;
    int jumlah_mhs = 0, mhslulus = 0, mhsgagal = 0;
    boolean exit = false;
	System.out.println("--------------------------------------");
    System.out.println("   PROGRAM MASUKAN NILAI MAHASISWA");
    System.out.println("--------------------------------------\n");

    do {
      System.out.print("Masukan IP Mahasiswa                : ");
      nilai = input.nextFloat();
      if (isWithinRange(nilai, 0f, 4f) == 1) {
        jumlah_mhs++;
        if (isWithinRange(nilai, 2.75f, 4f) == 1) {
          mhslulus++;
        }
        else {
          mhsgagal++;
        }
        jum_nilai += nilai;
      }
      else if (nilai == -999) {
        exit = true;
      }
      else {
      }
    } while (!exit);

    System.out.println("\n--------------------------------------\n");
    if (jumlah_mhs > 0) {
      rata_mhs = jum_nilai / jumlah_mhs;
      System.out.println("Banyak Mahasiswa                    : " + jumlah_mhs);
      System.out.println("Banyak Mahasiswa Lulus (IP >= 2.75) : " + mhslulus);
      System.out.println("Banyak Mahasiswa Tidak Lulus        : " + mhsgagal);
      System.out.println("Rata-Rata IP Mahasiswa              : " + rata_mhs);
    }
    else {
      System.out.println("TIDAK ADA DATA YANG DI INPUT");
    }
    System.out.println("\n--------------------------------------\n");
  }
}