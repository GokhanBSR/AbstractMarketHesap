public class SuperMarketCalculatorManager extends BaseShopCalculatorManager {
    @Override
    double breadBuy(int howMuchBread) {
        return howMuchBread*2.50;
    }
}
