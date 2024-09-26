public class App {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        bd.luas();
        bd.keliling();

        // instantiate / membuat objek lingkaran
        Lingkaran el = new Lingkaran(7);
        System.out.println("Luas lingkaran: " + el.luas());
        System.out.println("keliling lingkaran: " + el.keliling());

        // instantiate / membuat objek Persegi
        Persegi p = new Persegi(3);
        System.out.println("Luas Bujur Sangkar: " + p.luas());
        System.out.println("keliling Bujur Sangkar: " + p.keliling());

        // instantiate / membuat objek segitiga
        Segitiga s = new Segitiga(4, 4);
        System.out.println("Luas Segitiga: " + s.luas());
        
        // karena class Segitiga tidak mendefinisikan keliling
        // maka ketika sg memanggil keliling(), yang terpanggil
        // adalah keliling() yang ada di parent/super class yaitu
        // BangunDatar
        s.keliling();
        // System.out.println("keliling Segitiga: " + sg.keliling());
    }
}