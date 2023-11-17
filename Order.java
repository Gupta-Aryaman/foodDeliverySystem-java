import java.util.*;

public class Order {
    private User user;
    private Restaurant restaurant;
    private Map<Dish, Integer> dishes;
    private String discountCode;
    private String paymentId;
    private ORDER_STATUS status;

    public Order(User pUser, Restaurant pRestaurant, Map<Dish, Integer> pDishes){
        user = pUser;
        restaurant = pRestaurant;
        dishes = pDishes;
        status = ORDER_STATUS.PLACED;
    }

    public String getUserId(){
        return user.getId();
    }

    public String getRestaurantId(){
        return restaurant.getId();
    }

    public Map<Dish, Integer> getDishes(){
        return dishes;
    }

    //Another way to get the location would be to get the entire user or location object and get location from there
	//BUT we should not expose info that is not required. Location is imp info for delivery and is imp for order
	//So, it made sense to put getters for both locations here
	public Location getUserLocation() {
		return user.getLocation();
	}
	public Location getRestaurantLocation() {
		return restaurant.getLocation();
	}
}
