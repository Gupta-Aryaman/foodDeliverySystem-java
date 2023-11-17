import java.util.*;

public class DeliveryManager {
    private static DeliveryManager deliveryManagerInstance = null;

    private DeliveryManager(){}

    public static DeliveryManager getDeliveryManager(){
        if(deliveryManagerInstance == null){
            deliveryManagerInstance = new DeliveryManager();
        }
        return deliveryManagerInstance;
    }

    public void manageDelivery(String pOrderId, DeliveryMetaData pDeliveryMetaData){
        StrategyManager StrategyMgr = StrategyManager.getStrategyManager();

        IDeliveryPartnerMatchingStrategy partnerMatchingStrategy = StrategyMgr.determineDeliveryPartnerMatchingStrategy(pDeliveryMetaData);

        ArrayList<DeliveryPartner> deliverypartners = partnerMatchingStrategy.matchDeliveryPartners(pDeliveryMetaData);

        DeliveryPartner assignedDeliveryPartner = deliverypartners.get(0);

        // try{
            assignedDeliveryPartner.performDelivery(pOrderId, pDeliveryMetaData);
        // }
        // catch(Exception e){
        //     System.err.println("Error occurred!");
        // }
	    
    }
}
