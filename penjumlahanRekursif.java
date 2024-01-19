public class penjumlahanRekursif {
    static int hasilJumlah(int angka){
        if (angka <= 1){
            return angka;
        }else {
            return angka + hasilJumlah(angka - 1);
        }
    }
    public static void main(String[] args) {
        int f = 8;
        int total = hasilJumlah(f);
        System.out.println("Hasil dari pernjumlahan 1+2+3+4+5+6+7+8 = " + total);
    }
}
