import java.util.Scanner;

public class Percobaan6_15 {
    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungvolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
    public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     
     int p,l,t,L,vol;
    
     System.out.println("Masukkan Panjang");
     p = input.nextInt();
     System.out.println("Masukkan Tebal ");
     l = input.nextInt();
     System.out.println("Masukka tinggi");
     t = input.nextInt();

     L=hitungLuas(p, l);
     System.out.println("Luas Persegi panjgang adalah " + L);

     vol =hitungvolume(t, p,l);
     System.out.println("volume balok adalah " + vol);
     input.close();
    }
}
