import java.util.Scanner;
public class ArrayNilai15 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); 
        int[] nilaiakhir = new int[10];
        for (int i = 0; i<10 ; i++){
            System.out.println("Masukkan nilai akhir ke-" + i + " : ");
            nilaiakhir[i] = input.nextInt();
        }
        for (int i = 0; i<10 ; i++){
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiakhir[i]);
        }
    }
}
