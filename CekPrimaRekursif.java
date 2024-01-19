import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean CekBilPrima(int angka){
        if (angka <= 1){
            return false;
        } 
        for (int i = 2 ; i < angka; i++){
            if (angka % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int N = sc.nextInt();
        if (CekBilPrima(N)){
            System.out.println("Nilai N = " + N + " adalah bilangan prima");
        }else {
            System.out.println("Nilai N = " + N + " bukan bilangan prima");
        }
    } 
}