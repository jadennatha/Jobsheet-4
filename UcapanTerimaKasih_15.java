import java.util.Scanner;

public class UcapanTerimaKasih_15 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String NamaOrang = sc.nextLine();
        sc.close();
        return NamaOrang;
    }
    public static void ucapanTerimaKasih(){
        String nama = PenerimaUcapan();
        String ucapanTambahan = UcapanTambahan(nama);
        System.out.println("Thank You " + nama + " for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
        System.out.println("ucapan tambahan :" + ucapanTambahan);
    }
    public static String UcapanTambahan(String penerimaUcapan) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan untuk " + penerimaUcapan);
        String ucapanTambahan = sc.nextLine();
        sc.close();
        return ucapanTambahan;
    }
    public static void main(String [] args){
        ucapanTerimaKasih();
    }
}
