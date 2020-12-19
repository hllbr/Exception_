
public class Main {
    /*
    Stacklerle Beraber exceptionların İç içe metodlarda yakalanmaları...
    
    */
    public static void ucuncuFonksiyon(){
        try{
              int a = 58/0;//arithmetic exception hatası alacağımz metodumuz
        }catch(ArithmeticException e){
            System.out.println("Aritmatik exception hatası meydana geldi...\n"
                    + "bir sayı Java dilinde 0'a bölünmeye çalışıldığı zaman bir hata meydana gelir...\n"
                    + "Java mantıksal olarak bu işlemin gerçekleşmesine izin vermez(veremez)\n"
                    + "bu hata UnCheckException hatasıdır Kullanıcının Ayıtlaması gerekn bir hata çeşididir.");
        }
      
        
    }
    public static void ikinciFonksiyon(){
        ucuncuFonksiyon();
    }
    public static void birinciFonksiyon(){
        ikinciFonksiyon();
    }
    public static void main(String[] args) {
        birinciFonksiyon();
        /*
        Stcaklerde kurduğumuz bu yapı için önce main ardından birinci fonksiyon ardından ikinci fonksiyon ve son olarak üçüncüfonksiyon çağırılıyor...
        hata yakalanana kadar stack boşalmaya devam ediyor bizim hatayı uçuncü fonksiyonda yani hatanın başladığı noktada yakalamamız en uygun olan yöntem...
        Tabi yazılan koda göre hatayı exception handling nerde yapmak isteyeceğiniz duruma göre değişir.
        Yapmak istediğiniz işe göre başka bir noktada yakalamk isteyebilirsiniz.
        İç İçe metodlarda Stackler Kullanılıyor.
        */
    }
    
}
