public class MarketCalculatorManager extends BaseShopCalculatorManager {
    @Override
    double breadBuy(int howMuchBread) {
        return howMuchBread*1.75;
    }
}
