import java.util.Scanner;

public class Tugas2NilaiMahasiswa {
    static int[][] nilai;
    static String[] nama;
    static int jmlmahasiswa;
    static int jumlahtgs;

    static void inputbanyakmahasiswadantugas(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlmahasiswa = input.nextInt();
        nama = new String[jmlmahasiswa];
        for (int i = 0 ; i < jmlmahasiswa ; i++){
            System.out.println("Masukkan nama-nama mahasiswa :");
            nama[i]= input.next();
        }
        System.out.print("Masukkan banyaknya tugas per minggu : ");
        int jumlahtgs = input.nextInt();
        nilai = new int[jmlmahasiswa][jumlahtgs];
        ;
        
    }
    
    static void inputnilai(){
        Scanner input = new Scanner(System.in);
        for ( int i = 0; i < nilai.length; i++){
            System.out.println("Masukkan nilai dari " + nama[i]);
            for (int j = 0; j < nilai[i].length; j++){
                System.out.print("Minggu ke" + (j+1) + " : ");
                nilai[i][j]=input.nextInt();
            }
            System.out.println();
        }
        input.close();
    }
    static void tampilkandata(){
        for (int i = 0 ; i < nilai.length; i++){
            System.out.println(nama[i]);
            for (int j = 0; j < nilai[i].length; j++){
                System.out.println("Minggu ke " + (j+1) + " : " + nilai[i][j]);
            }
            System.out.println();
        }
    }
    static void cariMingguTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = nilai[0][0]; 

        for (int j = 1; j < nilai[0].length; j++) {
            for (int i = 0; i < nilai.length; i++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mingguTertinggi = j;
                }
            }
        }
        System.out.println("Minggu dengan nilai tertinggi secara keseluruhan adalah minggu ke-" + (mingguTertinggi + 1));
    }
    static void cariNilaiTertinggi(){
        int NilaiTertinggi = nilai[0][0];
        int minggutertinggi = 0;
        String mahasiswatertinggi = "";
        for (int i=0; i <nilai.length; i++){
            for (int j = 0; j < nilai[i].length; j++){
                if (nilai[i][j] > NilaiTertinggi ){
                    NilaiTertinggi = nilai[i][j];
                    mahasiswatertinggi = nama[i];
                    minggutertinggi = j+1;

                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswatertinggi);
        System.out.println("Dengan nilai : " + NilaiTertinggi);
        System.out.println("Pada Minggu ke-" + minggutertinggi);
    }
    public static void main(String[] args) {
        inputbanyakmahasiswadantugas();
        inputnilai();
        tampilkandata();
        cariMingguTertinggi();
        cariNilaiTertinggi();
        
    } 
}
