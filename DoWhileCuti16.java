import java.util.Scanner;
public class DoWhileCuti16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do {
             System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }else if (konfirmasi.equalsIgnoreCase("t")){
                System.out.println("terima kasih");
                break;
            }
        }while (jatahCuti > 0);
            
    }
    
}
