import java.util.Scanner;
public class percabanganSwitchCase {}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan warna lampu");
        String lampu = input.next();

        switch (lampu){
            case "merah":
            System.out.println("anda harus berhenti");
            case "kuning":
            System.out.println("anda siap-siap yaaaaaa");
            case"hijau":
            System.out.println("langsung gassssssssss");
            break;
        default:
            System.out.println("salah ngetik yaaaaaaaaa???????????");
        break;
        
    }
}
