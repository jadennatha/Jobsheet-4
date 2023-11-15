import java.util.Scanner;
public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Volley"};
        String[][] namaPeserta = new String[4][5];

        System.out.println("Masukkan nama peserta");
        System.out.println();
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga " + cabor[i] + " :");
            for (int j = 0; j < namaPeserta[i].length; j++) {
                System.out.print("Peserta ke-" + (j + 1) + " : ");
                namaPeserta[i][j] = input.nextLine();
            }
            System.out.println();
        }
        for (int i = 0 ; i < 4; i++){
            System.out.println("Peserta " + cabor[i] + " :" + String.join(",", namaPeserta[i]));
        }
        input.close();
    }
}
