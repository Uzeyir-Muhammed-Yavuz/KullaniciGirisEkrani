import java.util.Scanner;

public class KullaniciGirisDeneme {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String kullaniciAdi, sifre, yeniSifre;
        int replay;

        System.out.print("Kullanıcı adınız :");
        kullaniciAdi = inp.nextLine();
        System.out.print("Şifreniz :");
        sifre = inp.nextLine();

        if (kullaniciAdi.equals("admin") && (sifre.equals("cd.admin"))) {
            System.out.println("Kullanıcı adınız ve şifreniz doğru...\nGiriş yapılıyor...\nGiriş yapıldı!");

        } else {
            System.out.println("Kullanıcı adı ve şifre eşleşmedi, kontrol edin ve tekrar deneyin!");


        if (sifre.equals("cd.admin") && (kullaniciAdi.equals("admin"))) {
            System.out.println("Şifreniz doğru...");
            System.out.print("Giriş yaptınız...");
        } else {
            System.out.print("Kullanıcı adı veya şifre yanlış şifrenizi sıfırlamak istermisiniz evet ise '1' hayır ise '0' yi seçin :");

            replay = inp.nextInt();
            inp.nextLine();


            switch (replay) {
                case 1:
                    System.out.print("Yeni şifrenizi girin :");
                    yeniSifre = inp.nextLine();

                    if (yeniSifre.equals("cd.admin")){
                        System.out.print("Yeni şifreniz eskisiyle aynı olamaz kontrol edip tekrar deneyin!");
                        break;
                    }
                    else {
                        System.out.print("Şifreniz başarıyla sıfırlanmıştır");
                        break;
                    }
                case 0:
                    System.out.print("Bilgilerinizi kontrol edin ve tekrar giriş yapın!");
                    break;

                default:
                    System.out.println("Lütfen geçerli bir seçim yapın");
                    break;
            }
        }
        }
    }
}



