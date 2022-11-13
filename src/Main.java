public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseShopCalculatorManager =new SuperMarketCalculatorManager();
        customerManager.doTheShopping();
    }
}