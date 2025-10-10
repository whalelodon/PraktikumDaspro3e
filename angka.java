import java.util.Scanner;
public class angka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    int angka;
    System.out.println("MASUKKAN ANGKA YANG ANDA INGINKAN");
    angka = input.nextInt();

    boolean hasil = angka % 2 == 0;
    System.out.println("INI ADALAH HASIL" +hasil);

    if(hasil){
        System.out.println("JAWABANNYA ADALAH GENAP");
    }else{
        System.out.println("JAWABANNYA ADALAH GANJIL");
    }
    input.close();
}
}
