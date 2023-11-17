import java.util.*;

public class RestaurantManager {
    private static RestaurantManager restaurantManagerInstance = null;
    Map<String, Restaurant> restaurantsMap;

    private RestaurantManager(){
        restaurantsMap = new HashMap<String, Restaurant>();
    }

    public static RestaurantManager getRestaurantManager(){
        if(restaurantManagerInstance == null){
            restaurantManagerInstance = new RestaurantManager();
        }
        return restaurantManagerInstance;
    }

    public void addRestaurant(String pRestaurantName, Restaurant pRestaurant){
        restaurantsMap.put(pRestaurantName, pRestaurant);
    }

    public Restaurant getRestaurant(String pRestaurantName){
        return restaurantsMap.get(pRestaurantName);
    }
}
