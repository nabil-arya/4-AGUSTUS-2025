import java.util.Scanner;

public class BelanjaBarangnabil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama barang");
        String Barang1 = input.nextLine();
        System.out.println("Masukkan harga"+Barang1);
        double harga1 = input.nextDouble();
    
        System.out.println("masukkan nama barang ke 2");
        String Barang2 = input.next();
        System.out.println("Masukkan harga"+Barang2);
        double harga2 = input.nextDouble();

        System.out.println("nama barang1"+Barang1+ "|harga: "+harga1);
        System.out.println( "nama barang2"+Barang2+ "|harga: "+harga2);
    }
}
