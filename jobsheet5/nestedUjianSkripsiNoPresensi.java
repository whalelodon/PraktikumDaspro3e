import java.util.Scanner;
public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args){
        //yaString bebasKompen;
        Scanner sc = new Scanner(System.in);

        System.out.println("apakah mahasiswa bebas kompen (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();
        
        if(bebasKompen.equalsIgnoreCase("ya")) {
            
            System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();
            System.out.println("Masukkan jumlah log bimbingan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();
        if( bimbinganP1 >= 8 && bimbinganP2 >= 4){
           System.out.println("semua syarat telah terpenuhi. mahasiswa bisa mendaftar ujian skripsi");
        }else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
            System.out.println("Gagal! log bimbinganP1 kurang dari 8 kali dan P2 kurang dari 4 kali");
        }else if (bimbinganP1 < 8) {
           System.out.println("Gagal! log bimbingan kurang dari 8 kali");
        }else if (bimbinganP2 < 4) {
        }
            System.out.println("Gagal! log bimbingan kurang dari 4 kali");
        }else if (bebasKompen.equalsIgnoreCase("tidak")) {
        System.out.println("Gagal! log Mahasiswa memiliki tanggungan kompen");
        sc.close();
        }
    }
}