public class FibonanciRekursif {
    public static void main(String[] args) {
        int bulan = 12;
        int hasil = 0;
        System.out.print("Pasangan Marmut pada akhir bulan ke-12 : ");
        for (int i = 0; i <= bulan; i++){
            if (i == bulan)
            System.out.print(NilaiFibonanci(i));
        }
    }
    static int NilaiFibonanci(int bulan){
        if (bulan <= 1){
            return bulan;
        }else {
            return NilaiFibonanci(bulan - 1) + NilaiFibonanci(bulan - 2);
        }
    }
}
