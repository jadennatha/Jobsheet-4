import java.util.Scanner;
public class Rekursif_percobaan2 {
    static int hitungpangkat(int x, int y) {
        if (y == 0){
            return (1);
        } else {
            return (x * hitungpangkat(x, y -1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();
        for (int i = 1 ; i <= pangkat ; i++){
            System.out.print(bilangan + "*");
        }
        System.out.print("1 = " + hitungpangkat(bilangan, pangkat));
    }
}
