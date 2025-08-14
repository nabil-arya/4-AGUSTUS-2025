import java.util.Scanner;
public class BelanjabuahBaru {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    int Semangka=25,Jeruk=35;
    double hargasemangka=69000,hargajeruk=77000;
    double total,bayar,kembalian;
    
    System.out.println("Stock buah semangka"+ Semangka);
    System.out.println("Stock buah jeruk"+ Jeruk);
    
    total=(Semangka*hargasemangka)+(Jeruk*hargajeruk);
    System.out.println("jumlah semangka yang dibeli"+ Semangka +  "dan Jeruk: "+Jeruk);
    System.out.println("Total pembayaran: "+total);
    System.out.println("Masukkan pembayaran");
    bayar =input.nextDouble();
    kembalian = bayar - total;
    System.out.println("kembalian anda adalah"+kembalian);
    }
}
