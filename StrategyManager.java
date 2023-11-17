public class StrategyManager {
    private static StrategyManager strategyManagerInstance = null;
    private StrategyManager(){}

    public static StrategyManager getStrategyManager(){
        if(strategyManagerInstance == null){
            strategyManagerInstance = new StrategyManager();
        }
        return strategyManagerInstance;
    }

    IDeliveryPartnerMatchingStrategy determineDeliveryPartnerMatchingStrategy(DeliveryMetaData metaData){
        System.out.println("Based on location, weather, and other factors, setting partner strategy");
        return new LocBasedDeliveryPartnerMatchingStrategy();
    }
}
