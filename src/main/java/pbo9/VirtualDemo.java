package pbo9;

public class VirtualDemo {
    public static void main (String[] args){
        //polimorphic
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji ("Han", "Samarinda", 2, 2500.00);
        Pegawai t = new Gaji ("Farhan", "Bukittinggi", 1, 100000000.00);
        
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        System.out.println(s.x);
        s.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(e.x);
        e.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(t.x);
        t.mailCheck();
        
    }
}
