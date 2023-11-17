import java.util.*;

public class OrderManager{
    private DeliveryManager deliveryManager;
    private FoodManager foodManager;
    private Map<String, Order> orderMap;
    static private OrderManager orderManagerInstance = null;

    private OrderManager(){
        deliveryManager = DeliveryManager.getDeliveryManager();
        foodManager = FoodManager.getFoodManager();
        orderMap = new HashMap<String, Order>();
    }

    private void manageDelivery(String pOrderId, Order pOrder){
        DeliveryMetaData metaData = new DeliveryMetaData(pOrderId, pOrder.getUserLocation(), pOrder.getRestaurantLocation());
	    deliveryManager.manageDelivery(pOrderId, metaData);
    }

	private void manageFood(String pOrderId, Order pOrder){
        foodManager.prepareFood(pOrderId, pOrder.getRestaurantId(), pOrder.getDishes());
        // notify();
    }

    public static OrderManager getOrderManager(){
        if(orderManagerInstance == null){
            orderManagerInstance = new OrderManager();
        }
        return orderManagerInstance;
    }

    // the name should ideally not be passed
    //id should be generated. using name as id here
	public void createOrder(String pOrderId, Order pOrder){
        manageFood(pOrderId, pOrder);
        manageDelivery(pOrderId, pOrder);
        // notify();
    } 
														

    //this id should be returned while creating order
    //and can be used to fetch order details
	public Order getOrder(String pOrderId){
        return orderMap.get(pOrderId);
    }
}