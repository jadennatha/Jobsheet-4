import java.util.Scanner;
public class tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Masukkan nilai N =");
        N = sc.nextInt();
        for (int i=1;i<=N;i++ ){ //perulangan luar untuk menampilkan baris
            for (int j=1;j<=i;j++){ //perulangan dalam untuk menampilkan kolom per baris
                System.out.print((j)); //menampilkan hasil perulangan
            }
            System.out.println();//menampilkan hasil perbaris atau agar tidak sebaris
        }
    }
}