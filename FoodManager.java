import java.util.*;

public class FoodManager {
    static private FoodManager foodManagerInstance = null;

    private FoodManager(){};

    public static FoodManager getFoodManager(){
        if(foodManagerInstance == null){
            foodManagerInstance = new FoodManager();
        }
        return foodManagerInstance;
    }   

    public void prepareFood(String pOrderId, String pRestaurantId, Map<Dish, Integer> pDishes){
        RestaurantManager restaurantMgr = RestaurantManager.getRestaurantManager();
        Restaurant restaurant = restaurantMgr.getRestaurant(pRestaurantId);
        // try{
            restaurant.prepareFood(pOrderId, pDishes);
            // notify();
        // }
        // catch (InterruptedException e){
        //     System.out.println("Error occurred!");
        // }
        
    }

}
