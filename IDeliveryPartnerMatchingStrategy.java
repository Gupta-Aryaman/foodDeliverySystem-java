import java.util.*;

public interface IDeliveryPartnerMatchingStrategy{
    ArrayList<DeliveryPartner> matchDeliveryPartners(DeliveryMetaData pDeliveryMetaData);
}