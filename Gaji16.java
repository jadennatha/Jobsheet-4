import java.util.Scanner;
public class Gaji16 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int JmlMasuk, JmlTdkMasuk, TOtGaji;
        int gaji, potGaji;
        System.out.println("Masukkan gaji");
        gaji = input.nextInt();
        System.out.println("Masukkan potongan gaji");
        potGaji = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk kerja Anda ");
        JmlTdkMasuk= input.nextInt();
        TOtGaji = (JmlMasuk * gaji) - (JmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + TOtGaji);
        

    }
}
