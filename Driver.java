import java.util.*;

public class Driver {
    public static void main(String[] args) {
		//Chinese Restaurant
		RestaurantOwner owner1 = new RestaurantOwner("owner1");
		Restaurant chineseRest = new Restaurant("chinese vala", owner1, new Location(1, 2));
		Dish noodles = new Dish("noodles", CUISINE.CHINESE, 200);
		noodles.addAddOn(new DishAddOn("premium sauce", 20));
		Dish fried_rice = new Dish("fried rice", CUISINE.CHINESE, 180);
		Dish spring_rolls = new Dish("spring rolls", CUISINE.CHINESE, 120);
		ArrayList<Dish> temp_chinese_menu = new ArrayList<Dish>();
		temp_chinese_menu.add(fried_rice);
		temp_chinese_menu.add(noodles);
		temp_chinese_menu.add(spring_rolls);
		Menu chineseMenu = new Menu(temp_chinese_menu);
		chineseRest.addMenu(chineseMenu);

		//South Indian Restaurant
		RestaurantOwner owner2 = new RestaurantOwner("owner2");
		Restaurant southIndianRest = new Restaurant("south indian food", owner2, new Location(2, 3));
		Dish idli = new Dish("idli", CUISINE.SOUTH_INDIAN, 200);
		Dish dosa = new Dish("dosa", CUISINE.SOUTH_INDIAN, 180);
		Dish uthappam = new Dish("uthappam", CUISINE.SOUTH_INDIAN, 120);
		ArrayList<Dish> temp_southindian_menu = new ArrayList<Dish>();
		temp_southindian_menu.add(idli);
		temp_southindian_menu.add(dosa);
		temp_southindian_menu.add(uthappam);
		Menu south_indian_menu = new Menu(temp_southindian_menu);
		southIndianRest.addMenu(south_indian_menu);

		//Note that restaurant owners can exist without restaurants, we have used aggregation relationship
		//This can lead to owners being present with no restaurants and thus not added in restaurant manager
		//This is how we have designed and we should know consequences of the way we have structured.

		RestaurantManager restaurantMgr = RestaurantManager.getRestaurantManager();
		restaurantMgr.addRestaurant("chinese vala", chineseRest);
		restaurantMgr.addRestaurant("south indian food", southIndianRest);

		//////////////////////////////////////////////////////////////////////////////////////////////////

		DeliveryPartner alpha = new DeliveryPartner("alpha");
		DeliveryPartner beta = new DeliveryPartner("beta");
		DeliveryPartner gamma = new DeliveryPartner("gamma");

		DeliveryPartnerManager deliveryPartnerMgr = DeliveryPartnerManager.getDeliveryPartnerManager();
		deliveryPartnerMgr.addDeliveryPartner("alpha", alpha);
		deliveryPartnerMgr.addDeliveryPartner("beta", beta);
		deliveryPartnerMgr.addDeliveryPartner("gamma", gamma);

		//////////////////////////////////////////////////////////////////////////////////////////////////

		User aryaman = new User("Aryaman", new Location(10,11));
		User krish = new User("Krish", new Location(13, 14));
		User rohit = new User("Rohit", new Location(15, 16));
		//users can exist without usermgr as well. That's why it is an aggregation relationship

		UserManager userMgr = UserManager.getUserManager();
		userMgr.addUser("aryaman", aryaman);
		userMgr.addUser("krish", krish);
		userMgr.addUser("rohit", rohit);

		//////////////////////////////////////////////////////////////////////////////////////////////////

		Map<Dish, Integer> cart = new HashMap<Dish, Integer>();
		cart.put(noodles, 2);
		cart.put(fried_rice, 2);
		Order order1 = new Order(aryaman, chineseRest, cart);
		
		OrderManager orderMgr = OrderManager.getOrderManager();
		orderMgr.createOrder("order1", order1); // Ideally, the id should be created in order manager when order is created
													//This is just for simplicity purposes and has been mentioned in the class as well
													//We have done same for all ids - user, restaurant, delivery partner etc.

	}
    
}
