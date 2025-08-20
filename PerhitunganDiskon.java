import java.util.Scanner;

public class PerhitunganDiskon {}
    public static void main(String[] args) {
        double totalbeli,diskon,hargaAkhir,bayar,kembalian;

        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Total pembelian: " );
        totalbeli = input.nextDouble();


        if(totalbeli > 500000) {
            System.out.println("MENDAPAT DISKON 20%");
            diskon = (20/100)*totalbeli;
        }else if(totalbeli > 300000){
        System.out.println("MENDAPAT DISKON 15%");
            diskon = (15/100)*totalbeli;
        }else if(totalbeli > 10000) {
            System.out.println("MENDAPAT DISKON 10%");
            diskon = (10/100)*totalbeli;
        }else{
            System.out.println("TIDAK ADA DISKON");
            diskon=0;
        }
    
    hargaAkhir = totalbeli - diskon;
    System.out.println("HARGA AKHIR"+hargaAkhir);
    System.out.println("masukkan pembayaran ");
    bayar = input.nextDouble();
    kembalian = bayar-hargaAkhir;
    System.out.println("KEMBALIAN ANDA"+kembalian);
    
    
    }
