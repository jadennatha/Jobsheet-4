import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Masukkan nilai N = ");
        N = sc.nextInt();
        // Mencetak sisi atas
        for (int i = 1; i <= N; i++) { 
            System.out.print(N + " "); //hasil perulangan untuk sisi atas
        }
        System.out.println(); //menampilkan hasil perulangan agar tidak satu baris

        // Cetak sisi kiri dan kanan
        for (int i = 2; i < N; i++) { //perulangan luar untuk mengisi sisi kanan dan kiri
            System.out.print(N + " "); //hasil perulangan sisi kiri
            for (int j = 2; j < N; j++) { //perulangan dalam untuk mengisi isian dari persegi
                System.out.print("  "); //hasil perulangan isian persegi
            }
            System.out.println(N); //hasil perulangan sisi kanan
        }

        // Mencetak sisi bawah
        for (int i = 1; i <= N; i++) {
            System.out.print(N + " "); //hasil perulangan untuk sisi atas 
        }
        System.out.println(); //menampilkan hasil perulangan agar tidak satu baris
        

    }
}
