import java.util.Scanner;

public class CustomerManager {

    BaseShopCalculatorManager baseShopCalculatorManager;
    Scanner scanner = new Scanner(System.in);
    void doTheShopping(){

        System.out.println("------------\n-> Ekmek Hesaplama \n ------------");
        System.out.println("-> Kaç Ekmek alacaksınız:");
        int x =scanner.nextInt();
        System.out.println("-> Ekmek Fiyatı:" +baseShopCalculatorManager.breadBuy(x)/x+"TL");
        System.out.println("-> Almış Olduğunuz" + x + "Ekmek İçin Ödeyeceğiniz Fiyat:" + baseShopCalculatorManager.breadBuy(x)+"TL");

    }
}
