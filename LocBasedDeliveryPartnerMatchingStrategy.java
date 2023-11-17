import java.util.*;

public class LocBasedDeliveryPartnerMatchingStrategy implements IDeliveryPartnerMatchingStrategy{
    public ArrayList<DeliveryPartner> matchDeliveryPartners(DeliveryMetaData pMetaData){
        DeliveryPartnerManager deliveryPartnerMgr = DeliveryPartnerManager.getDeliveryPartnerManager();

        System.out.println("Quadtrees can be used to get nearest delivery partners, Delivery partner manager can be used to get details of partners. Returning all delivery partners for demo purposes for now.");

		ArrayList<DeliveryPartner> nearestDeliveryPartners = new ArrayList<>();
        Map<String, DeliveryPartner> hm = deliveryPartnerMgr.getDeliveryPartnersMap();

		for(Map.Entry<String,DeliveryPartner> mapElement : hm.entrySet()){
			nearestDeliveryPartners.add(mapElement.getValue());
        }
		return nearestDeliveryPartners;
    }
}
