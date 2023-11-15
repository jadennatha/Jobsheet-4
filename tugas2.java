import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N; 
        System.out.print("Masukkan nilai N = ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++){ //perulangan luar untuk menampilkan baris
            for (int j = N; j >= i; j-- ){ // perulanan dalam untuk menampilkan kolom per baris 
                System.out.print("*"); // hasil perulangan
            }
            System.out.println(); //menampilkan hasil perulangan agar tidak satu baris
        }
    }
}
