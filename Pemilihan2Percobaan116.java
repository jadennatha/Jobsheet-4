import java.util.Scanner;
public class Pemilihan2Percobaan116 {
    public static void main(String [] args){
        Scanner input16 = new Scanner(System.in);
        
        int tahun;

        System.out.println("Masukkan tahun");
        tahun = input16.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("tahun Kabisat");
            else {
            System.out.println("bukan tahun kabisat"); 
            }

            
        }else {
            System.out.println("bukan tahun kabisat");
        }
}
}