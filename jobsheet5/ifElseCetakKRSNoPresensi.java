import java.util.Scanner;
public class ifElseCetakKRSNoPresensi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MASUKKAN SEMESTER ANDA SAAT INI");
        int semester = sc.nextInt();

        if(semester == 1){
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 1 (MABA||MAHASISWA BARU)");
        }else if (semester == 2) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 2");
        }else if (semester == 3) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 3");
            }else if (semester == 4) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 4");
            }else if (semester == 5) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 5");
            }else if (semester == 6) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 6");
            }else if (semester == 7) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 7");
            }else if (semester == 8) {
            System.out.println("ANDA SEKARANG ADALAH SEORANG MAHASISWA SEMESTER 8");
            }else{
         System.out.println("ANDA ADALAH SEORANG MAHASISWA ABADI KAMPUS");
        }
        sc.close();
    
    }
}