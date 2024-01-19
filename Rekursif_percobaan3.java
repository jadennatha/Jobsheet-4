import java.util.Scanner;

public class Rekursif_percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungLaba(saldo, tahun - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        
        System.out.print("Jumlah Saldo awal : ");
        saldoAwal = sc.nextDouble();
        
        System.out.print("Lamanya Investasi (tahun) : ");
        tahun = sc.nextInt();
        
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}

