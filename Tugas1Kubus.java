import java.util.Scanner;

public class Tugas1Kubus {
    static int sisi;
    static int vol;
    static int luas;
    static int LuasPermukaan(){
        luas = sisi*sisi*6;
        return luas;
    }
    static int volume(){
        vol = sisi*sisi*sisi;
        return vol;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi");
        sisi = input.nextInt();
        System.out.println("Luas Permukaan Kubus : " + LuasPermukaan());
        System.out.println("volume Kubus : " + volume());
        input.close();
    }
}
