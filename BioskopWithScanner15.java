import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = "***";
            }
        }
        
        int baris, kolom, menu;
        String nama, next;

        while (true) {
            System.out.println("Pilih Menu (1/2/3) :");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Menu :");
            menu = sc.nextInt();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama : ");
                    nama = sc.next();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris > penonton.length || kolom > 2) {
                        System.out.println("kursi tidak tersedia, pilih kembali");
                        continue;
                    } else if (penonton[baris - 1][kolom - 1] != "***"){
                        System.out.println("Kursi sudah terisi oleh orang lain, silahkan pilih kembali");
                        continue;
                    } 

                    penonton[baris - 1][kolom - 1] = nama;
                    

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("y")) {
                        continue;
                    } else if (next.equalsIgnoreCase("n")) {
                        break;
                    } 
                }

            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(",", penonton[i]));
                }
            } else {
                System.exit(0);
            }
        }
    }
}
