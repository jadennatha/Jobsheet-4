import java.util.Scanner;
public class Gaji16 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int JmlMasuk, JmlTdkMasuk, TOtGaji;
        int gaji=40000, potGaji=25000;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk kerja Anda ");
        JmlTdkMasuk= input.nextInt();
        TOtGaji = (JmlMasuk * gaji) - (JmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + TOtGaji);
        

    }
}
