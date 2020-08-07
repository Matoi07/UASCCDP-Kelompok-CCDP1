package persegi;
import java.util.Scanner;

/**
 *
 * @author maria ulfah
 */
public class Hitung {
    int sisi;
    int luas, keliling;
    int hasilluas;
    int hasilkeliling;
    private static Hitung hitung;
    Scanner nilai = new Scanner(System.in);
    private Hitung(){
        System.out.println("Menghitung Luas dan Keliling Persegi");
    }
    public static synchronized Hitung getHitung(){
        if(hitung==null){
            hitung=new Hitung();
        }
        return hitung;
    }
    public void HitungLuas(){
        System.out.println("========");
        System.out.println("Persegi");
        System.out.println("========");
        System.out.print("Masukkan sisi Luas(cm) : ");
        sisi = nilai.nextInt();
        luas = sisi * 4;
        System.out.println("Luas Persegi = "+hasilluas);  
        System.out.println("=================================");
    }
    public void HitungKeliling(){
        System.out.println("========");
        System.out.println("Persegi");
        System.out.println("========");
        System.out.print("Masukkan sisi Keliling(cm) : ");
        sisi = nilai.nextInt();
        keliling = sisi * 4;
        System.out.println("Keliling Persegi = "+hasilkeliling);  
        System.out.println("=================================");
    }    
}
