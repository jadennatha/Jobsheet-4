import java.util.Scanner;
public class HargaBayar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int harga,jumlah;
        double dis;
        double total, bayar, jmlDis;
        String Merk;
        int jmlhal;
        System.out.println("Masukkan merk buku");
        Merk = input.nextLine();
        System.out.println("Masukkan jumlah halaman");
        jmlhal = input.nextInt();
        System.out.println("Masukkan diskon");
        dis = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang Yang Dibeli ");
        jumlah = input.nextInt();
         total=harga*jumlah;
         jmlDis=total*dis;
         bayar=total-jmlDis;
         System.out.println("Diskon yang anda dapatkan adalah "+ jmlDis);
         System.out.println("Jumlah yang harus dibayar adalah " + bayar);

        
        
    }
}
