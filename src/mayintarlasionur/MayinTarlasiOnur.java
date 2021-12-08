
package mayintarlasionur;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Onur
 */
public class MayinTarlasiOnur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ONUR SÖNMEZ - 190508356
        // HOCAM ÖDEVİN ZORLUK DERECESİ KISMINI YARDIM ALARAK YAPTIM...
        
        Random rnd = new Random();
       int satirSayisi,sutunSayisi,zorlukDerecesi,rastgele;
       Scanner sc = new Scanner(System.in);
       System.out.println("Lütfen oyunun satır büyüklüğünü giriniz..");
       satirSayisi = sc.nextInt();
       System.out.println("Lütfen oyunun sütun büyüklüğünü giriniz..");
       sutunSayisi = sc.nextInt();
       String [][] tarla = new String[satirSayisi][sutunSayisi];
       int [][] tarla2 = new int[satirSayisi][sutunSayisi];
       for (int i = 0; i < satirSayisi; i++) {
            
            for (int j = 0; j < sutunSayisi; j++) {
              tarla[i][j] = "*";
            }
        }
       for (int i = 0; i < satirSayisi; i++) {
            System.out.println("");
            for (int j = 0; j < sutunSayisi; j++) {
               System.out.print(tarla[i][j]+"   ");
               
            }
       }
       for (int i = 0; i < satirSayisi; i++) {
            
            for (int j = 0; j < sutunSayisi; j++) {
              tarla2[i][j] = 0;
            }
        }
       int satirDegeri,sutunDegeri,toplamPuan=0, level;
        System.out.println("");
       System.out.println("Lütfen 20 ile 80 arasında olacak şekilde oyunun zorluk derecesini giriniz...");
       zorlukDerecesi = sc.nextInt();
       level = (satirSayisi * sutunSayisi*zorlukDerecesi)/100; 
       System.out.println(level);
       System.out.println("");
       System.out.println(""+"Mayınlar yerleştirildi...");
       int randomSutun , randomSatir;
       while(level>0){
           randomSutun = rnd.nextInt(satirSayisi);
            randomSatir = rnd.nextInt(sutunSayisi);
           if (tarla2[randomSatir][randomSutun]==0) {
            tarla2[randomSatir][randomSutun] = 1;
            level--;}                      
       }
             
       for (int i = 0; i < satirSayisi; i++) {
            System.out.println("");
            for (int j = 0; j < sutunSayisi; j++) {
               System.out.print(tarla2[i][j]+"   ");
               
            }
       }
        System.out.println("");
        System.out.println("Oyun Başlasın...");
         for (int i = 0; i < satirSayisi; i++) {
            
            for (int j = 0; j < sutunSayisi; j++) {
              tarla[i][j] = "*";
            }
        }
       for (int i = 0; i < satirSayisi; i++) {
            System.out.println("");
            for (int j = 0; j < sutunSayisi; j++) {
               System.out.print(tarla[i][j]+"   ");
               
            }
       }
        System.out.println("");
        int mayin=1 , bos=0;
        String bos2 = Integer.toString(bos);
        String mayin2 = String.valueOf(mayin);
        while(satirSayisi*sutunSayisi!=0) {
            System.out.println("");
            System.out.println("Lütfen oyununn satır değerini giriniz...");
            satirDegeri = sc.nextInt();
            System.out.println("Lütfen oyunun sütun değerini giriniz...");
            sutunDegeri = sc.nextInt();
            if (tarla2[satirDegeri][sutunDegeri]==0) {
                toplamPuan+=10;
                tarla[satirDegeri][sutunDegeri]=bos2;
           for (int k = 0; k < satirSayisi; k++) {
            System.out.println("");
            for (int j = 0; j < sutunSayisi; j++) {
               System.out.print(tarla[k][j]+"   ");
               
            }
       }
            }
            else{
                           
                System.out.println("");
                System.out.println("Oyun bitti..");
                System.out.println("Toplam Puanınız:.."+toplamPuan);
            for (int k = 0; k < satirSayisi; k++) {
            System.out.println("");
            for (int j = 0; j < sutunSayisi; j++) {
               System.out.print(tarla2[k][j]+"   ");               
            }
       }
                break;
            
                     }
                  }
               }
}


