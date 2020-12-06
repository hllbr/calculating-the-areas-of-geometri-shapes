
import java.util.Scanner;


public class Main {source = Mustafa Murat Coskun
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        String islemler = "İslemler...\n"
                + "1. işlem Kare Alan Hesapla\n"
                + "2. işlem Üçgen Alan Hesapla\n"
                + "3. işlem Daire Alan Hesapla\n"
                + "4. işlem İşlemler Tablosunu Tekrar Göster\n"
                + "Çıkış için q'ya basınız.";
        System.out.println("************************************************");
        System.out.println(islemler);
        System.out.println("************************************************");
        
        while(true){
            System.out.println("Hangi Şeklin alanını hesaplamak istiyorsunuz");
            String sekil_turu = scn.nextLine();
            if (sekil_turu.equals("1")) {
                System.out.println("karenin bir kenarı :");
                int kenar = scn.nextInt();
                scn.nextLine();
                Kare kare = new Kare("Kare", kenar);
                System.out.println("Karenin alanı hesaplanıyor");
                Thread.sleep(3000);
                kare.alan_hesapla();
              //  break;
                
            }else if(sekil_turu.equals("2")){
                System.out.println("Üçgenin birinci kenarı :");
                int a = scn.nextInt();
                System.out.println("Üçgenin ikinci kenarı :");
                int b = scn.nextInt();
                System.out.println("Üçgenin üçüncü kenarı :");
                int c = scn.nextInt();
                scn.nextLine();
                System.out.println("Üçgenin alanı hesaplanıyor");
                Thread.sleep(3000);
                Ucgen ucgen = new Ucgen("üçgen", a, b, c);
                ucgen.alan_hesapla();
              //  break;
            }else if(sekil_turu.equals("3")){
                System.out.println("Dairenizin yarı çapı(5 6 gibi tam değer giriniz.)");
                System.out.println("Yarı çap :");
                int yarı_cap = scn.nextInt();
                scn.nextLine();
                System.out.println("Dairenizin alanı hesaplanıyor.Lütfen bekleyiniz");
                Thread.sleep(3000);
                //sekil = new Kare("kare1",kenar);şeklinde tanımlarsak bir nevi polymorphism olur.
                Daire daire = new Daire("Daire", yarı_cap);
                daire.alan_hesapla();
               // break;
            }else if(sekil_turu.equals("4")){
                System.out.println("Yapabileceğiniz işlemler hazırlanıyor lütfen bekleyiniz.");
                Thread.sleep(4500);
                System.out.println("************************************************");
                System.out.println(islemler);
                System.out.println("************************************************");
              //  break;
            }else if(sekil_turu.equals("q")){
                System.out.println("İşlemlerden çıkılıyor.Lütfen bekleyiniz.");
                Thread.sleep(5500);
                break;
            }
            
        }
    }
    
}
