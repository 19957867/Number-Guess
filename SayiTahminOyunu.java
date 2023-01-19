
package sayitahminoyunu;

import java.util.Random;
import java.util.Scanner;


public class SayiTahminOyunu {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Random rnd = new Random();
     
        System.out.println("Sayı Tahmin Etme Oyununa Hoş Geldiniz !");
        System.out.print("Lütfen 1-100 arasında bir sayı giriniz : ");
        
        int tahmin = input.nextInt();
        
        int sayi = rnd.nextInt(100);
        while(tahmin != sayi){
            if(tahmin<0 && tahmin>100){
                System.out.print("1 ile 100 arasında bir değer giriniz : ");
                tahmin = input.nextInt();
                
            }else if (tahmin < sayi) {
                System.out.print("Daha büyük bir değer giriniz : ");
                tahmin = input.nextInt();
                
            }else{
                System.out.print("Daha küçük bir değer giriniz : ");
                tahmin = input.nextInt();
                 
            }
             System.out.println("Tebrikler, kazandınız!");
            break;
        }
        
        
    }
    
}
