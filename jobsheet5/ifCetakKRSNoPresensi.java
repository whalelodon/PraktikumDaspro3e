import java.util.Scanner;
    public class ifCetakKRSNoPresensi{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Cetak KRS SIAKAD ---");
            System.out.println("Apakah UKT sudah lunas? (true/false): ");
            boolean uktlunas = sc.nextBoolean();

            String pesan = (uktlunas) ? "Pembayaran UKT TERVERTIFIKASI. SILAHKAN CETAK KRS DAN MINTA TANDA TANGAN DPA." : "ANDA BELUM MELAKUKAN PEMBAYARAN. HUBUNGI DONATUR ANDA";
                System.out.println("INI ADALAH JAWABAN YANG ANDA CARI" + pesan);
            sc.close();
            }
        }
    