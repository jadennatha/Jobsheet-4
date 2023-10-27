import java.util.Scanner;
public class LinearSearch15{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int key;
        int hasil = 0;

        System.out.println("Masukkan jumlah elemen array :");
        int jmlelemen = input.nextInt();
        int[] arrayInt = new int[jmlelemen];
        for (int i = 0; i < arrayInt.length ; i++){
            System.out.print("Masukkan element array ke-" + (i) + " :");
            arrayInt[i] = input.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari :");
        key = input.nextInt();
        hasil = 0;
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil = i;   
                break;
                }
            }
            if (hasil != 0){
                System.out.println("Key ditemukan pada indeks ke-" + hasil);
            }else {
                System.out.println("Key tidak ditemukan");
            }
                       
    }
}