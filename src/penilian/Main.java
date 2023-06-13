
package penilian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir madun = new NilaiAkhir("Muhammad Rahmadhani Dzulfian","2110010504",90,80,85);
        
        System.out.println("Nama Mahasiswa : " + madun.getNama());
        System.out.println("NPM Mahasiswa  : " + madun.getNpm());
        System.out.println("Nilai Akhir    : " + madun.hitungNilaiAkhir());
    }
    
}
