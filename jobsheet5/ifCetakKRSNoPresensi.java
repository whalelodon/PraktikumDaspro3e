import java.util.Scanner;
    public class ifCetakKRSNoPresensi{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Cetak KRS SIAKAD ---");
            System.out.println("Apakah UKT sudah lunas? (true/false): ");
            boolean uktlunas = sc.nextBoolean();

            if(uktlunas){
                System.out.println("Pembayaran UKT Tervertifikasi");
                System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
            }else{
                System.out.println("ANDA BELUM MELAKUKAN PEMBAYARAN");
                System.out.println("HUBUNGI DONATUR ANDA");
            sc.close();
            }
        }
    }
