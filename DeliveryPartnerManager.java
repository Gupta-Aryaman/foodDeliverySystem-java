import java.util.*;

public class DeliveryPartnerManager {
    private static DeliveryPartnerManager deliveryPartnerManagerInstance = null;
    private HashMap<String, DeliveryPartner> deliveryPartnersMap;

    private DeliveryPartnerManager(){
        deliveryPartnersMap = new HashMap<String, DeliveryPartner>();
    }

    public static DeliveryPartnerManager getDeliveryPartnerManager(){
        if(deliveryPartnerManagerInstance == null){
            deliveryPartnerManagerInstance = new DeliveryPartnerManager();
        }
        return deliveryPartnerManagerInstance;
    }

    public void addDeliveryPartner(String pDeliveryPartnerName, DeliveryPartner pDeliveryPartner){
        deliveryPartnersMap.put(pDeliveryPartnerName, pDeliveryPartner);
    }

    public DeliveryPartner getDeliveryPartner(String pDeliveryPartnerName){
        return deliveryPartnersMap.get(pDeliveryPartnerName);
    }

    //This getter is added so that delivery partner matching strategy can access the map and 
	//select nearest delivery partners
    HashMap<String, DeliveryPartner> getDeliveryPartnersMap(){
        return deliveryPartnersMap;
    }
}
