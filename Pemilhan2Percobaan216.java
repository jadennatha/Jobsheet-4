import java.util.Scanner;
public class Pemilhan2Percobaan216 {
    public static void main(String [] args){
        Scanner input16 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalsudut;

        System.out.print("Masukkan sudut 1 :");
        sudut1 = input16.nextFloat();
        System.out.print("Masukkan sudut 2 :");
        sudut2 = input16.nextFloat();
        System.out.print("Masukkan sudut 3 :");
        sudut3 = input16.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180){
            if (sudut1 == 90){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if (sudut1==sudut2 && sudut1==sudut3 && sudut2==sudut3 && sudut3==sudut1){
                System.out.println("segitiga tersebut adalah sama sisi");
            }else if (sudut1==sudut2 || sudut1==sudut3 || sudut2==sudut3 || sudut3==sudut1){
                System.out.println("Segitiga tersebu adalah sama kaki");
            }else {
                System.out.println("segitiga sembarang");
            }
        }else {
            System.out.println("bukan segitiga");
        }
    }
}
