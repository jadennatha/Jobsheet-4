import java.util.Scanner;
public class PemilihanPercobaan116 {
    public static void main(String [] args){
        Scanner input16 = new Scanner(System.in);

        System.out.println("Masukkan angka ");
        int angka = input16.nextInt();
        
        String jnsbil = angka % 2 == 0 ? " bilangan genap " : " bilangan ganjil ";

        System.out.println("Angka " + angka + jnsbil);
    }
}
