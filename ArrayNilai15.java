import java.util.Scanner;
public class ArrayNilai15 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); 
        int[] nilaiakhir = new int[10];
        for (int i = 0; i<nilaiakhir.length ; i++){
            System.out.println("Masukkan nilai akhir ke-" + i + " : ");
            nilaiakhir[i] = input.nextInt();
        }
        for (int i = 0; i<10 ; i++){
            if (nilaiakhir[i] > 70){
                System.out.println("Mahasiswa ke-"+ i +" lulus! ");
            } else {
                System.out.println("Mahasiswa ke-"+ i +" tidak lulus!");
            }
        }
    }
}
